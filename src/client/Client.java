/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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
        
	public void signUp(String username, String password) throws JSONException{
		request = new JSONObject();
		request.put("method","signup");
		request.put("username",username);
		request.put("password",password);
	}

	public void logIn(String username, String password) throws JSONException{
		request = new JSONObject();
		request.put("method","login");
		request.put("username",username);
		request.put("password",password);
	}

	public void inventory() throws JSONException{
		request = new JSONObject();
		request.put("method","inventory");
		request.put("token",token);
	}

	public void mixItem(int item1, int item2) throws JSONException{
		request = new JSONObject();
		request.put("method","mixitem");
		request.put("token",token);
		request.put("item1",item1);
		request.put("item2",item2);
	}

	public void map() throws JSONException{
		request = new JSONObject();
		request.put("method","map");
		request.put("token",token);
	}

	public void move(int x, int y) throws JSONException{
		request = new JSONObject();
		request.put("method","move");
		request.put("token",token);
		request.put("x",x);
		request.put("y",y);
	}
	
	public void field() throws JSONException{
		request = new JSONObject();
		request.put("method","field");
		request.put("token",token);
	}

	public void offer(int offeredItem, int nOfferedItem, int demandedItem, int nDemandedItem) throws JSONException{
		request = new JSONObject();
		request.put("method","offer");
		request.put("token",token);
		request.put("offered_item",offeredItem);
		request.put("n1",nOfferedItem);
		request.put("demanded_item",demandedItem);
		request.put("n2",nDemandedItem);
	}

	public void tradeBox() throws JSONException{
		request = new JSONObject();
		request.put("method","tradebox");
		request.put("token",token);
	}

	public void sendFind(int item) throws JSONException{
		request = new JSONObject();
		request.put("method","sendfind");
		request.put("token",token);
		request.put("item",item);
	}

	public void sendAccept() throws JSONException{
		request = new JSONObject();
		request.put("method","sendaccept");
		request.put("token",token);
		request.put("offer_token",offerToken);
	}

	public void fetchItem() throws JSONException{
		request = new JSONObject();
		request.put("method","fetchitem");
		request.put("token",token);
		request.put("offer_token",offerToken);
	}

	public void cancelOffer() throws JSONException{
		request = new JSONObject();
		request.put("method","canceloffer");
		request.put("token",token);
		request.put("offer_token",offerToken);
	}

}
