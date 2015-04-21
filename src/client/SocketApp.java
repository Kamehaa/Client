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
        switch (input){
            case 1 :
                username = in.nextLine();
                password = in.nextLine();
                C.signUp(username,password);
                break;
            case 2 :
                username = "lala";
                password = "blabla";
                C.logIn(username,password);
                break;
            default :
                break;
        }
        String response = mMailer.sendMessage(C.getRequest().toString());
        System.out.println(response);
        mMailer.closeConnection();
    }
}
