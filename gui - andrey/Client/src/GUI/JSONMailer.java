/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.json.simple.JSONObject;

/**
 *
 * @author kevinyu
 */
public class JSONMailer {
    
    private RollingJSONParser mRollingJSONParser;
    private JSONObject mResponse;
    
    public JSONMailer() {
        mRollingJSONParser = new RollingJSONParser();
    }
    
    public void send(String hostName, int portNumber, String jsonString,int timeoutInMillis) {
        System.out.println("JSONMailer.send()"+" "+hostName+" "+portNumber);
        try (
            Socket socket = new Socket(hostName,portNumber);
            PrintWriter sender =
                 new PrintWriter(socket.getOutputStream(), true);
            InputStreamReader receiver =
                new InputStreamReader(
                    new DataInputStream(socket.getInputStream()));
        ) {
            socket.setSoTimeout(timeoutInMillis);
            System.out.println("Send");
            sender.print(jsonString);
            sender.flush();
            
            char buf[] = new char[4096];
            int nRead = 0;
            System.out.println("Reading ");
            while((nRead = receiver.read(buf)) > 0) {

               mRollingJSONParser.receive(new String(buf).substring(0,nRead));
               
               System.out.println("raw " + new String(buf).substring(0,nRead));
               
               if (mRollingJSONParser.isJSONObjectExist()) {
                   JSONObject responseJSON = mRollingJSONParser.getNextJSONObject();
                   mResponse = responseJSON;
                   break;
               }
               
               System.out.println("JSON "+mResponse.toJSONString());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Exit JSONMailer.send()");
    }
    
    public String getResponse() {
        return mResponse.toJSONString();
    }
    
}

