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
public class Database {
    
    public String[] vrdata;
    public int fov;
    public float price;
    
    public String[] morpheus;
    public int mfov;
    public float mprice;
    
    public String[] sgear;
    public int sfov;
    public float sprice;
    
    public String[] oGo;
    public int gfov;
    public float gprice;
    
    public String[] oRift;
    public int rfov;
    public float rprice;
    
    public String[] htcv;
    public int hvfov;
    public float hvprice;
    
    public String[] htcvp;
    public int hvpfov;
    public float hvpprice;
    
    public String[] gDream;
    public int dfov;
    public float dprice;
    
    public String[] cardB;
    public int cfov;
    public float cprice;
    
    
    public Database(String vrType){
        createMorpheus();
        createSGear();
        createGo();
        createRift();
        createHTCvive();
        createHTCvivePro();
        createDayDream();
        createCardboard();
        
        if(vrType == "Morpheus"){
            vrdata = morpheus;
            fov = mfov;
            price = mprice;
        }
        else  if(vrType == "SGear"){
            vrdata = sgear;
            fov = sfov;
            price = sprice;
        }
        else  if(vrType == "oGo"){
            vrdata = oGo;
            fov = gfov;
            price = gprice;
        }
        else  if(vrType == "oRift"){
            vrdata = oRift;
            fov = rfov;
            price = rprice;
        }
        else  if(vrType == "HTCvive"){
            vrdata = htcv;
            fov = hvfov;
            price = hvprice;
        }
        else  if(vrType == "HTCvivePro"){
            vrdata = htcvp;
            fov = hvpfov;
            price = hvpprice;
        }
        else  if(vrType == "DayDream"){
            vrdata = gDream;
            fov = dfov;
            price = dprice;
        }
        else  if(vrType == "Cardboard"){
            vrdata = cardB;
            fov = cfov;
            price = cprice;
        }
        
    }
    
    
    private void createMorpheus(){
        morpheus = new String[4];
        morpheus[0] = "Sony Morpheus";
        morpheus[1] = "Sony";
        morpheus[2] = "1920x1080 - 960x1080 per eye";
        morpheus[3] = "Playstation Move controller";
        mfov = 100;
        mprice = 399;
    }
    
    private void createSGear(){
        sgear = new String[4];
        sgear[0] = "Samsung Gear VR";
        sgear[1] = "Samsung";
        sgear[2] = "2560x1440";
        sgear[3] = "Touchpad or Trackpad";
        sfov = 90;
        sprice = 99;
    }
    
    private void createGo(){
        oGo = new String[4];
        oGo[0] = "Oculus GO";
        oGo[1] = "Facebook";
        oGo[2] = "No specified";
        oGo[3] = "Hand Controller";
        gfov = 0;
        gprice = 219;
    }
    
    private void createRift(){
        oRift = new String[4];
        oRift[0] = "Oculus Rift";
        oRift[1] = "Facebook";
        oRift[2] = "2160x1200 - 1080x1200 per eye";
        oRift[3] = "2 Hand Controllers";
        rfov = 110;
        rprice = 449;
    }
    
    private void createHTCvive(){
        htcv = new String[4];
        htcv[0] = "HTC VIVE";
        htcv[1] = "HTC";
        htcv[2] = "2160x1200 - 1080x1200 per eye";
        htcv[3] = "2 Hand Controllers";
        hvfov = 110;
        hvprice = 599;
    }
    
    private void createHTCvivePro(){
        htcvp = new String[4];
        htcvp[0] = "HTC VIVE Pro";
        htcvp[1] = "HTC";
        htcvp[2] = "2160x1200 - 1080x1200 per eye";
        htcvp[3] = "2 Hand Controllers";
        hvpfov = 110;
        hvpprice = 879;
    }
    
    private void createDayDream(){
        gDream = new String[4];
        gDream[0] = "Google DayDream View";
        gDream[1] = "Google";
        gDream[2] = "2560x1440";
        gDream[3] = "1 Hand Controller";
        
        
        dfov = 96;
        dprice = 79;
    }
    
    private void createCardboard(){
        cardB = new String[4];
        cardB[0] = "Google Cardboard";
        cardB[1] = "Google";
        cardB[2] = "From 1280x720 to 2560x1440";
        cardB[3] = "Touchpad";
        
        
        cfov = 90;
        cprice = 10;
    }
    
    public String[] getVRTextData(){
        return vrdata;
    }
    
    public int getVRfov(){
        return fov;
    }
    
    public float getVRprice(){
        return price;
    }
    
   
    
}
