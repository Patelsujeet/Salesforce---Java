/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sforce.soap.enterprise.Connector;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.GetUserInfoResult;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Salesforce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String username="patelsujeet24051996@gmail.com";
        String password="Sujeet@957451554724051996Bb0bCmTrF82hvry0BnUxhwiXt";

        try {
        ConnectorConfig config = new ConnectorConfig();
        config.setUsername(username);
        config.setPassword(password);
        config.setCompression(true);
        config.setAuthEndpoint("https://login.salesforce.com/services/Soap/c/48.0/0DFf20000000p2J");
            EnterpriseConnection sc=new EnterpriseConnection(config);
            GetUserInfoResult userInfo = sc.getUserInfo(); 
            
            System.out.println("Salesforce user"+userInfo.getUserId());
            
              Account acct = new Account();
              acct.setName("Salesforce USer1");
              
              Account acct1 = new Account();
              acct1.setName("Salesforce USer2");
              
              
              Account acct2 = new Account();
              acct2.setName("Salesforce USer3");
              

              
              Account []acList={acct,acct1,acct2};
              
              SaveResult []saveData=sc.create(acList);
              for(SaveResult sv:saveData){
                  System.out.println("++"+sv.getId());
              }
              System.out.println("++"+saveData);
              
              
              
        } catch (ConnectionException ex) {
            ex.printStackTrace();
        }
        
           
    }

}
