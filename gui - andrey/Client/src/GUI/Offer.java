/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author ACER PC
 */
public class Offer {
    
    public int mOfferedItem;
    public int mNOfferedItem;
    public int mDemandedItem;
    public int mNDemandedItem;
    public String mToken;
    public boolean mIsAvailable;
    
    public Offer(JSONArray jsonObj) {
        
        try {
            mOfferedItem = jsonObj.getInt(0);
            mNOfferedItem = jsonObj.getInt(1);
            mDemandedItem = jsonObj.getInt(2);
            mNDemandedItem = jsonObj.getInt(3);
            mIsAvailable = jsonObj.getBoolean(4);
            mToken = jsonObj.getString(5);
        } catch (JSONException ex) {
            ex.printStackTrace();
            Logger.getLogger(Offer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
