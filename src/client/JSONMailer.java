/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author ACER PC
 */
public class JSONMailer {
    
    private String mHostName;
    private int mPortNumber;
    Socket echoSocket;
    PrintWriter mSender = null;
    BufferedReader mReceiver = null;
    
    public JSONMailer(String hostname, int port) {
        mHostName = hostname;
        mPortNumber = port;
    }
    
    public void openConnection() {
         try {
            echoSocket = new Socket(mHostName, mPortNumber);
            mSender =
                new PrintWriter(echoSocket.getOutputStream(), true);
            mReceiver =
                new BufferedReader(
                    new InputStreamReader(echoSocket.getInputStream()));
         }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String sendMessage(String message) throws IOException {
        mSender.println(message);
        char[] buf = new char[4096];
        int nRead = mReceiver.read(buf);
        return new String(buf,0,nRead);
    }
    
    public void closeConnection() {
        
    }
}
