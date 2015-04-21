/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.io.IOException;
import java.util.Scanner;
import org.json.JSONException;

/**
 *
 * @author ACER PC
 */
public class SocketApp {
    public static void main(String[] args) throws IOException, JSONException {
        Client C = new Client();
        JSONMailer mMailer = new JSONMailer("167.205.35.38",2000);
        mMailer.openConnection();
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan opsi anda: ");
        int input = in.nextInt();
        String username, password;
        
        boolean on = true;
        while(on) {
            switch (input){
                case 1 :
                    username = "menori";
                    password = "";
                    C.signUp(username,password);
                    break;
                case 2 :
                    username = "menori";
                    password = "";
                    C.logIn(username,password);
                    break;
                case 3 :
                    C.inventory();
                    break;
                default :
                    on = false;
                    break;
            }
            String response = mMailer.sendMessage(C.getRequest().toString());
            System.out.println(response);
            switch (input){
                case 1 :
                    C.pSignUp(response);
                    break;
                case 2 :
                    C.pLogIn(response);
                    break;
                case 3 :
                    C.pInventory(response);
                default :
                    break;
            }
        }
        mMailer.closeConnection();
    }
}
