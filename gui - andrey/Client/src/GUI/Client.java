/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author ACER PC
 */
public class Client{

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getStatus() {
        return status;
    }

    public String getToken() {
        return token;
    }

    public String getMapName() {
        return mapName;
    }

    public JSONArray getInv() {
        return inv;
    }

    public String getOfferToken() {
        return offerToken;
    }

    public void setOfferToken(String offerToken) {
        this.offerToken = offerToken;
    }

    public long getServerTime() {
        return serverTime;
    }

    public long getDeltaTime() {
        return deltaTime;
    }

    public JSONArray getTradeBox() {
        return tradeBox;
    }

    public JSONArray getItemFound() {
        return itemFound;
    }
    
    // socket attribute
    private JSONMailer mailer;
    private String ip;
    private int port;
        
    // request & response attribute
    private JSONObject json;
    private JSONObject request; 
    private String status;
    private String description;
        
    // login attribute
    private int x;
    private int y;
    private long serverTime;
    private long deltaTime;
    private String token;
        
    // map attribute
    private String mapName;
    private int mapW;
    private int mapH;
        
    // items attribute
    private JSONArray inv;
    private String offerToken;
    private JSONArray tradeBox;
    private JSONArray itemFound;
        
    // 2
    public void signUp(String username, String password){
        try{
            request = new JSONObject();
            request.put("method","signup");
            request.put("username",username);
            request.put("password",password);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    System.out.println("sign up success");
                    break;
                case "fail":
                    description = json.getString("description");
                    System.out.println(description);
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
    // 3
    public void logIn(String username, String password){
        try{
            request = new JSONObject();
            request.put("method","login");
            request.put("username",username);
            request.put("password",password);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    token = json.getString("token");
                    x = json.getInt("x");
                    y = json.getInt("y");
                    serverTime = json.getLong("time");
                    deltaTime = System.currentTimeMillis()/1000 - serverTime;
                    System.out.println("login success");
                    break;
                case "fail":
                    description = json.getString("description");
                    System.out.println(description);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            map();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    // 4
    public void inventory(){
        try{
            request = new JSONObject();
            request.put("method","inventory");
            request.put("token",token);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    inv = json.getJSONArray("inventory");
                    System.out.println("load inventory success");
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
    // 5
    public void mixItem(int item1, int item2){
        try{
            request = new JSONObject();
            request.put("method","mixitem");
            request.put("token",token);
            request.put("item1",item1);
            request.put("item2",item2);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    inv.put(item1, inv.getInt(item1) - 3);
                    inv.put(item2, inv.getInt(item2) - 3);
                    inv.put(json.getInt("item"), (inv.getInt(json.getInt("item")) + 1));
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
    // 6
    public void map(){
        try{
            request = new JSONObject();
            request.put("method","map");
            request.put("token",token);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
            case "ok":
                mapName = json.getString("name");
                mapW = json.getInt("width");
                mapH = json.getInt("height");
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
    // 7
    public void move(int x, int y){
        try{
            request = new JSONObject();
            request.put("method","move");
            request.put("token",token);
            request.put("x",x);
            request.put("y",y);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    serverTime = json.getLong("time");
                    System.out.println("ok");
                    break;
                case "fail":
                    description = json.getString("description");
                    System.out.println(description);
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
    // 8
    public void field(){
        try{
            request = new JSONObject();
            request.put("method","field");
            request.put("token",token);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    int temp = json.getInt("item");
                    inv.put(temp,(inv.getInt(temp)+1));
                    System.out.println("ok");
                    break;
                case "fail":
                    description = json.getString("description");
                    System.out.println(description);
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
    // 9
    public void offer(int offeredItem, int nOfferedItem, int demandedItem, int nDemandedItem){
        try{
            request = new JSONObject();
            request.put("method","offer");
            request.put("token",token);
            request.put("offered_item",offeredItem);
            request.put("n1",nOfferedItem);
            request.put("demanded_item",demandedItem);
            request.put("n2",nDemandedItem);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    System.out.println("ok");
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
    // 10
    public void tradeBox(){
        try{
            request = new JSONObject();
            request.put("method","tradebox");
            request.put("token",token);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    System.out.println("ok");
                    tradeBox = json.getJSONArray("offers");
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
    // 11
    public void sendFind(int item){
        try{
            request = new JSONObject();
            request.put("method","sendfind");
            request.put("token",token);
            request.put("item",item);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    System.out.println("ok");
                    itemFound = json.getJSONArray("offers");
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
    // 13
    public void sendAccept(){
        try{
            request = new JSONObject();
            request.put("method","sendaccept");
            request.put("token",token);
            request.put("offer_token",offerToken);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    System.out.println("ok");
                    break;
                case "fail":
                    description = json.getString("description");
                    System.out.println(description);
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
    // 15
    public void fetchItem(){
        try{
            request = new JSONObject();
            request.put("method","fetchitem");
            request.put("token",token);
            request.put("offer_token",offerToken);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    System.out.println("ok");
                    break;
                case "fail":
                    description = json.getString("description");
                    System.out.println(description);
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
    // 16
    public void cancelOffer(){
        try{
            request = new JSONObject();
            request.put("method","canceloffer");
            request.put("token",token);
            request.put("offer_token",offerToken);
            mailer.send(ip,port,request.toString(),3000);
            respond(mailer.getResponse());
            status = json.getString("status"); 
            switch (status) {
                case "ok":
                    System.out.println("ok");
                    break;
                case "fail":
                    description = json.getString("description");
                    System.out.println(description);
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
    // parser method
    public void respond(String response){
        try {
            json = new JSONObject(response);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
