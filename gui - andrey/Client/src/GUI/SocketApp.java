/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.io.IOException;
import java.util.Scanner;
import org.json.JSONException;

/**
 *
 * @author ACER PC
 */
public class SocketApp {
    /*public static void main(String[] args) throws IOException, JSONException {
        Client C = new Client();
        JSONMailer mMailer = new JSONMailer("192.168.2.2",3000);
        mMailer.openConnection();
        Scanner in = new Scanner(System.in);
        int input, moveX, moveY;
        String username, password;
        
        boolean on = true;
        while(on) {
            System.out.print("Masukkan opsi anda: ");
            input = in.nextInt();
            switch (input){
                case 1 :
                    username = "henry";
                    password = "menori";
                    C.signUp(username,password);
                    break;
                case 2 :
                    username = in.next();
                    password = in.next();
                    C.logIn(username,password);
                    break;
                case 3 :
                    C.inventory();
                    break;
                case 4 :
                    C.mixItem(2, 3);
                    break;
                case 5 :
                    C.map();
                    break;
                case 6 :
                    System.out.print("x : "); moveX = in.nextInt();
                    System.out.print("y : "); moveY = in.nextInt();
                    C.move(moveX, moveY);
                    break;
                case 7 :
                    C.field();
                    break;
                case 8 :
                    C.offer(2, 2, 3, 2);
                    break;
                case 9 :
                    C.tradeBox();
                    break;
                case 10 :
                    C.sendFind(2);
                    break;
                case 11 :
                    C.sendAccept();
                    break;
                case 12 :
                    C.fetchItem();
                    break;
                case 13 :
                    C.cancelOffer();
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
                case 5 :
                    C.pMap();
                    break;
                case 6 :
                    C.pMove();
                    break;
                case 7 :
                    C.pField();
                    break;
                case 8 :
                    break;
                case 9 :
                    C.pTradeBox();
                    break;
                case 10 :
                    C.pSendFind();
                    break;
                case 11 :
                    C.pSendAccept();
                    break;
                case 12 :
                    C.pFetchItem();
                    break;
                case 13 :
                    C.pCancelOffer();
                    break;
                default :
                    break;
            }
        }
        mMailer.closeConnection();
    }*/
}
