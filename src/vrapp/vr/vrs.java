/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrapp.vr;

/**
 *
 * @author henri
 */
public class vrs  {
    private String name;            // name of the VR device
    private String company;         // VR company producer
    private String resolution;      // VR resolution
    private String controller;      // VR controler
    private int fov;                // VR Field of view 
    private float price;            // VR price
    
    
    public vrs(String [] textData, int vrfov , float vrprice)
    {
        name = "";
        company = "";
        resolution = "";
        controller = "";
        fov = 0;
        price = 0;
        
        populateTextData(textData);
        
        populateFov(vrfov);
        
        populatePrice(vrprice);
    }
    
    private void populateTextData(String[] vrData){
        name = vrData[0];
        company = vrData[1];
        resolution = vrData[2];
        controller = vrData[3];
    }
    
    private void populateFov(int vrfov){
        fov = vrfov;
    }
    
    private void populatePrice(float vrprice){
        price = vrprice;
    }
    
   public String[] getVRTextData(){
       String[] textData;
       textData = new String[4];
       textData[0] = name;
       textData[1] = company;
       textData[2] = resolution;
       textData[3] = controller;
       
       return textData;
   }
    
   public int getVRFov(){
       return fov;
   }
   
   public float getVRPrice(){
       return price;
   }
    
}
