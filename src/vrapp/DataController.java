/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrapp;

import sun.security.util.Debug;
import vrapp.vr.*;

/**
 *
 * @author henri
 */
public class DataController {
    
    //application database
   public Database appDatabase = new Database("Morpheus");
   public Database appDatabase1 = new Database("SGear");
   public Database appDatabase2 = new Database("oGo");
   public Database appDatabase3 = new Database("oRift");
   public Database appDatabase4 = new Database("HTCvive");
   public Database appDatabase5 = new Database("HTCvivePro");
   public Database appDatabase6 = new Database("DayDream");
   public Database appDatabase7 = new Database("Cardboard");
 
    
    // get the respective VR data
    String[] vrdata = appDatabase.getVRTextData();
    int vrfov = appDatabase.getVRfov();
    float vrprice = appDatabase.getVRprice();
    
    String[] vrdata1 = appDatabase1.getVRTextData();
    int vrfov1 = appDatabase1.getVRfov();
    float vrprice1 = appDatabase1.getVRprice();
    
    String[] vrdata2 = appDatabase2.getVRTextData();
    int vrfov2 = appDatabase2.getVRfov();
    float vrprice2 = appDatabase2.getVRprice();
    
    String[] vrdata3 = appDatabase3.getVRTextData();
    int vrfov3 = appDatabase3.getVRfov();
    float vrprice3 = appDatabase3.getVRprice();
    
    String[] vrdata4 = appDatabase4.getVRTextData();
    int vrfov4 = appDatabase4.getVRfov();
    float vrprice4 = appDatabase4.getVRprice();
    
    String[] vrdata5 = appDatabase5.getVRTextData();
    int vrfov5 = appDatabase5.getVRfov();
    float vrprice5 = appDatabase5.getVRprice();
    
    String[] vrdata6 = appDatabase6.getVRTextData();
    int vrfov6 = appDatabase6.getVRfov();
    float vrprice6 = appDatabase6.getVRprice();
    
    String[] vrdata7 = appDatabase7.getVRTextData();
    int vrfov7 = appDatabase7.getVRfov();
    float vrprice7 = appDatabase7.getVRprice();
    
    vrs targetVR;
    vrs targetVR1;
    vrs targetVR2;
    vrs targetVR3;
    vrs targetVR4;
    vrs targetVR5;
    vrs targetVR6;
    vrs targetVR7;

    public DataController()
    {
        targetVR = new vrs(vrdata,vrfov,vrprice);
        targetVR1 = new vrs(vrdata1,vrfov1,vrprice1);
        targetVR2 = new vrs(vrdata2,vrfov2,vrprice2);
        targetVR3 = new vrs(vrdata3,vrfov3,vrprice3);
        targetVR4 = new vrs(vrdata4,vrfov4,vrprice4);
        targetVR5 = new vrs(vrdata5,vrfov5,vrprice5);
        targetVR6 = new vrs(vrdata6,vrfov6,vrprice6);
        targetVR7 = new vrs(vrdata7,vrfov7,vrprice7);
    }
    
     public vrs getVRObject()
    {
           return targetVR; 
    } 
    
}
