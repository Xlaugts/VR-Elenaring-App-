/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrapp;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author henri
 */
public class Morpheus extends  Parent {
    
    DataController localController;
    
    // layout
    private BorderPane borderPane;
    
    // Veritcal Boxes to hold UI elements
    private  VBox topVb;
    private VBox leftVb;
    private  VBox rightVb;
    private VBox bottomVb;
    private VBox midVb;
    
     // UI nodes
    ImageView imgdevice;
    private Label nameLabel;
    private Text vrname;
    private Text vrcompany;
    private Text vrresolution;
    private Text vrcontroller;
    private Text vrfov;
    private Text vrprice;
    
    //UI Buttons
    private Button morpheus;
    private Button sGear;
    private Button oGo;
    private Button oRift;
    private Button htcVive;
    private Button htcPro;
    private Button gDaydream;
    private Button gCardboard;
    
    private Button btnBackMenu;
    
    private String[] vrTextValue;
    private int vrfovValue;
    private float vrpriceValue;
    
    //constructor
    public Morpheus()
    {
       localController = VRApp.getMainScreen().getDataController();
        getVRData();
        
        createNodesForUI();
        configureUINodes();
        addNodesToLayout();
    }
    
    // get the data from the VR class
    private void getVRData(){
        vrTextValue = localController.targetVR.getVRTextData();
        vrfovValue = localController.targetVR.getVRFov();
        vrpriceValue = localController.targetVR.getVRPrice(); 
    }
    
    private void createNodesForUI(){
        
        // layout object
        borderPane = new BorderPane(); 
        borderPane.setPrefSize(800,600); 
        
         // new VBox s to hold UI elements
        topVb = new VBox();
        leftVb = new VBox();
        rightVb = new VBox();
        bottomVb = new VBox();
        midVb = new VBox();
        
        // Btn text
        morpheus = new Button("Morpheus");
        sGear = new Button("Samsung Gear");
        oGo = new Button ("Oculus Go");
        oRift = new Button ("Oculus Rift");
        htcVive = new Button ("HTC Vive");
        htcPro = new Button ("HTC Vive Pro");
        gDaydream = new Button ("Google DayDream View");
        gCardboard = new Button ("Google Cardboard");
        
        vrname = new Text();
        vrcompany = new Text();
        vrresolution = new Text();
        vrcontroller = new Text();
        vrfov = new Text();
        vrprice = new Text();
        
        
        // Getting the values from the database
        vrname.setText("Name: "+vrTextValue[0]);
        vrcompany.setText("Company: "+vrTextValue[1]);
        vrresolution.setText("Resolution: "+vrTextValue[2]);
        vrcontroller.setText("Controller: "+vrTextValue[3]);
        vrfov.setText("Field of View - FOV: " + vrfovValue);
        vrprice.setText("Price €"+ vrpriceValue);
        btnBackMenu = new Button("Back to Menu");
        nameLabel = new Label("Morpheus");
        
        imgdevice = new ImageView(new Image(getClass().getResourceAsStream("morph.png")));
        
        
         // button event handler
        btnBackMenu.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(5);
            }
        });
         // button event handler
        morpheus.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(8);
            }
        });
         // button event handler
        sGear.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(9);
            }
        });
        
         // button event handler
        oGo.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(10);
            }
        });
        
         // button event handler
        oRift.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(11);
            }
        });
        
         // button event handler
        htcVive.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(12);
            }
        });
        
         // button event handler
        htcPro.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(13);
            }
        });
        
        gDaydream.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(14);
            }
        });
        
        gCardboard.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(15);
            }
        });
        
        
    }
    
    private void configureUINodes()
    {
        //Font style
        Font f = Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC, 30);
        Font f2 = Font.font("Arial",FontWeight.MEDIUM,FontPosture.REGULAR, 20);
        
        // Label text style
        nameLabel.setFont(f);
        nameLabel.setTextFill(Color.web("#000000"));
        
        // BTNs size configuration
        btnBackMenu.setPrefWidth(150);
        
        morpheus.setPrefHeight(150);
        sGear.setPrefHeight(150);
        oGo.setPrefHeight(150);
        oRift.setPrefHeight(150);
        htcVive.setPrefHeight(150);
        htcPro.setPrefHeight(150);
        gDaydream.setPrefHeight(150);
        gCardboard.setPrefHeight(150);
        
        morpheus.setPrefWidth(150);
        sGear.setPrefWidth(150);;
        oGo.setPrefWidth(150);
        oRift.setPrefWidth(150);
        htcVive.setPrefWidth(150);
        htcPro.setPrefWidth(150);
        gDaydream.setPrefWidth(150);
        gCardboard.setPrefWidth(150);
        
        
        leftVb.getChildren().addAll(morpheus,sGear,oGo,oRift);
        leftVb.setAlignment(Pos.CENTER);
        
        rightVb.getChildren().addAll(htcVive,htcPro,gDaydream,gCardboard);
        rightVb.setAlignment(Pos.CENTER);
        
        topVb.getChildren().add(nameLabel);
        topVb.setAlignment(Pos.TOP_CENTER);
        
        bottomVb.getChildren().add(btnBackMenu);
        bottomVb.setAlignment(Pos.BOTTOM_CENTER);
         
        vrname.setFont(f2);
        vrcompany.setFont(f2);
        vrresolution.setFont(f2);
        vrcontroller.setFont(f2);
        vrfov.setFont(f2);
        vrprice.setFont(f2);
        
        midVb.getChildren().addAll(imgdevice,vrname,vrcompany,vrresolution,vrcontroller,vrfov,vrprice);
        midVb.setAlignment(Pos.CENTER);
        midVb.setSpacing(20);
  
    }
    
    private void addNodesToLayout()
    {
      // Add VBoxes to Pane
      borderPane.setTop(topVb);
      borderPane.setBottom(bottomVb);
      borderPane.setLeft(leftVb);
      borderPane.setRight(rightVb);
      borderPane.setCenter(midVb);
        
        
        getChildren().add(borderPane);
    }
    
    
}
