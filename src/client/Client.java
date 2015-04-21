/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author ACER PC
 */
public class Client{

    public JSONObject getRequest() {
        return request;
    }

    public void setRequest(JSONObject request) {
        this.request = request;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOfferToken() {
        return offerToken;
    }

    public void setOfferToken(String offerToken) {
        this.offerToken = offerToken;
    }
	private JSONObject request; 
	private String token;
	private String offerToken;
        //2
	public void signUp(String username, String password) throws JSONException{
		request = new JSONObject();
		request.put("method","signup");
		request.put("username",username);
		request.put("password",password);
	}
        //3
	public void logIn(String username, String password) throws JSONException{
		request = new JSONObject();
		request.put("method","login");
		request.put("username",username);
		request.put("password",password);
	}
        //4
	public void inventory() throws JSONException{
		request = new JSONObject();
		request.put("method","inventory");
		request.put("token",token);
	}
        //5
	public void mixItem(int item1, int item2) throws JSONException{
		request = new JSONObject();
		request.put("method","mixitem");
		request.put("token",token);
		request.put("item1",item1);
		request.put("item2",item2);
	}
        //6
	public void map() throws JSONException{
		request = new JSONObject();
		request.put("method","map");
		request.put("token",token);
	}
        //7
	public void move(int x, int y) throws JSONException{
		request = new JSONObject();
		request.put("method","move");
		request.put("token",token);
		request.put("x",x);
		request.put("y",y);
	}
	//8
	public void field() throws JSONException{
		request = new JSONObject();
		request.put("method","field");
		request.put("token",token);
	}
        //9
	public void offer(int offeredItem, int nOfferedItem, int demandedItem, int nDemandedItem) throws JSONException{
		request = new JSONObject();
		request.put("method","offer");
		request.put("token",token);
		request.put("offered_item",offeredItem);
		request.put("n1",nOfferedItem);
		request.put("demanded_item",demandedItem);
		request.put("n2",nDemandedItem);
	}
        //10
	public void tradeBox() throws JSONException{
		request = new JSONObject();
		request.put("method","tradebox");
		request.put("token",token);
	}
        //11
	public void sendFind(int item) throws JSONException{
		request = new JSONObject();
		request.put("method","sendfind");
		request.put("token",token);
		request.put("item",item);
	}
        //13
	public void sendAccept() throws JSONException{
		request = new JSONObject();
		request.put("method","sendaccept");
		request.put("token",token);
		request.put("offer_token",offerToken);
	}
        //15
	public void fetchItem() throws JSONException{
		request = new JSONObject();
		request.put("method","fetchitem");
		request.put("token",token);
		request.put("offer_token",offerToken);
	}
        //16
	public void cancelOffer() throws JSONException{
		request = new JSONObject();
		request.put("method","canceloffer");
		request.put("token",token);
		request.put("offer_token",offerToken);
	}
        
        private int x;
        private int y;
        private long time;
        private JSONObject json;
        
        // getter
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public long getTime() {
            return time;
        }
        
        
        // parser method
        public void respond(String response){
            json = new JSONObject(response);
        }
        //2
        public void pSignUp() {
            try {
                switch (json.get("status").toString()) {
                    case "ok":
                        System.out.println("sign up success");
                        break;
                    case "fail":
                        System.out.println(json.get("description"));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        //3
        public void pLogIn() {
            try {
                switch (json.get("status").toString()) {
                    case "ok":
                        token = json.get("token").toString();
                        x = Integer.parseInt(json.get("x").toString());
                        y = Integer.parseInt(json.get("y").toString());
                        time = Long.parseLong(json.get("time").toString());
                        break;
                    case "fail":
                        System.out.println(json.get("description"));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        //4
        public void pInventory() {
            try {
                switch (json.get("status").toString()) {
                    case "ok":
                        ArrayList inv = (ArrayList) json.get("inventory");
                        for (Object inv1 : inv) {
                            System.out.println(inv1.toString());
                        }
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        //5 mixitem
        public void pMixItem(){
            
        }
        //6 map
        public void pMap(){
            
        }
        //7
        public void pMove() {
            try {
                switch (json.get("status").toString()) {
                    case "ok":
                        time = Long.parseLong(json.get("time").toString());
                        System.out.println("ok");
                        break;
                    case "fail":
                        System.out.println(json.get("description"));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        //8 field
        public void pField(){
            
        }
        //9
        public void pOffer() {
            try {
                switch (json.get("status").toString()) {
                    case "ok":
                        System.out.println("ok");
                        break;
                    case "fail":
                        System.out.println(json.get("description"));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        //10 tradebox
        public void pTradeBox(){
            
        }
        //11 sendfind
        public void pSendFind(){
            
        }
        //13
        public void pSendAccept() {
            try {
                switch (json.get("status").toString()) {
                    case "ok":
                        System.out.println("ok");
                        break;
                    case "fail":
                        System.out.println(json.get("description"));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        //15
        public void pFetchItem() {
            try {
                switch (json.get("status").toString()) {
                    case "ok":
                        System.out.println("ok");
                        break;
                    case "fail":
                        System.out.println(json.get("description"));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        //16
        public void pCancelOffer() {
            try {
                switch (json.get("status").toString()) {
                    case "ok":
                        System.out.println("ok");
                        break;
                    case "fail":
                        System.out.println(json.get("description"));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
}
