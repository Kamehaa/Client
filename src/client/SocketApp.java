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
        JSONMailer mMailer = new JSONMailer("100.100.101.177",2000);
        mMailer.openConnection();
        Scanner in = new Scanner(System.in);
        int input;
        String username, password;
        
        boolean on = true;
        while(on) {
            System.out.print("Masukkan opsi anda: ");
            input = in.nextInt();
            switch (input){
                case 1 :
                    username = "menori";
                    password = "menori";
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
                case 4 :
                    C.mixItem(2, 3);
                    break;
                case 7 :
                    C.move(3, 3);
                    break;
                case 8 :
                    C.field();
                    break;
                default :
                    on = false;
                    break;
            }
            String response = mMailer.sendMessage(C.getRequest().toString());
            C.respond(response);
            System.out.println(response);
            switch (input){
                case 1 :
                    C.pSignUp();
                    break;
                case 2 :
                    C.pLogIn();
                    break;
                case 3 :
                    C.pInventory();
                    break;
                case 4 :
                    C.pMixItem();
                    break;
                case 7 :
                    break;
                case 8 :
                    break;
                default :
                    break;
            }
        }
        mMailer.closeConnection();
    }
}
