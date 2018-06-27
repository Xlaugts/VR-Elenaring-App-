/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrapp;

import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.CheckBox;
import javafx.scene.paint.Color;

/**
 *
 * @author henri
 */
public class Quiz extends Parent {
    
    // layout
    private BorderPane borderPane;
    
    
     // check box
    CheckBox box1;
    CheckBox box2;
    CheckBox box3;
    CheckBox box4;
    CheckBox box5;
    CheckBox box6;
    CheckBox box7;
    CheckBox box8;
    CheckBox box9;
    CheckBox box10;
    CheckBox box11;
    CheckBox box12;
    CheckBox box13;
    CheckBox box14;
    CheckBox box15;
    CheckBox box16;
    
    // UI nodes
    private Label topLbl;
    private Button btnBack;
    private Button btnAnswer;
    private Label question1;
    private Label question2;
    private Label question3;
    private Label question4;
    private Label question5;
    private Label question6;
    private Label question7;
    private Label question8;
   
    private  VBox topVb;
    private  VBox midVb;
    private VBox leftVb;
    private VBox bottomVb;
    
    
    public Quiz(){
        createNodesForUI();
        configureUINodes();       
        addNodesToLayout();
    }
    
     private void createNodesForUI()
    {
       // layout object
        borderPane = new BorderPane(); 
        borderPane.setPrefSize(800,600); 
        
         // Setup UI elements here
        topLbl = new Label("VR Elearning Quiz");
        
        question1 = new Label("1-How many devices are on the market right now?");
        box1 = new CheckBox("8");
        box2 = new CheckBox("5");
        
        question2 = new Label("2-Which is the cheapest VR device?");
        box3 = new CheckBox("Oculus Go");
        box4 = new CheckBox("Google Cardboard");
        
        question3 = new Label("3-When Google Cardboard was created?");
        box5 = new CheckBox("2012");
        box6 = new CheckBox("2014");
        
        question4 = new Label("4-What's the price of HTC VIVE Pro");
        box7 = new CheckBox("879 euros");
        box8 = new CheckBox("599 euros");
        
        question5 = new Label("5-Which of these devices need a PS4?");
        box9 = new CheckBox("Morpheus");
        box10 = new CheckBox("Oculus Rift");
        
        question6 = new Label("6-Which company owns Oculus Go and Rift?");
        box11 = new CheckBox("Samsung");
        box12 = new CheckBox("Facebook");
        
        question7 = new Label("7-What means VR?");
        box13 = new CheckBox("Virtual Reality");
        box14 = new CheckBox("Virtual Remedy");
        
        question8 = new Label("8-How many devices needs a smartphone?");
        box15 = new CheckBox("5");
        box16 = new CheckBox("3");
        
        
        btnBack = new Button("Back");
        btnAnswer = new Button("Answer");
        
        // new VBox s to hold UI elements
        topVb = new VBox();
        midVb = new VBox();
        leftVb = new VBox();
        bottomVb = new VBox();
        
        btnBack.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(17);
            }
        });
        
        btnAnswer.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(18);
            }
        });
 
    }
     
    // configure the UI (styling and position)
    private void configureUINodes()
    {
        //Font style
        Font f = Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC, 30);
        
        // Label text style
        topLbl.setFont(f);
        topLbl.setTextFill(Color.web("#000000"));
        
        // Configure the VBoxes
       topVb.getChildren().add(topLbl);
       topVb.setAlignment(Pos.CENTER);
        
       leftVb.getChildren().addAll(question1,box1,box2,question2,box3,box4,question3,box5,box6,question4,box7,box8);
       leftVb.setAlignment(Pos.CENTER);
       leftVb.setSpacing(15);
        
       midVb.getChildren().addAll(question5,box9,box10,question6,box11,box12,question7,box13,box14,question8,box15,box16);
       midVb.setAlignment(Pos.CENTER);
       midVb.setSpacing(15);
       
       btnAnswer.setPrefWidth(150);
       
       bottomVb.getChildren().addAll(btnAnswer,btnBack);
       bottomVb.setAlignment(Pos.CENTER);
       bottomVb.setSpacing(5);
    } 
    
      // add the child nodes to the layout
    private void addNodesToLayout()
    {
       // Add VBoxes to Pane
       borderPane.setTop(topVb);
       borderPane.setLeft(leftVb);
       borderPane.setBottom(bottomVb);       
       borderPane.setCenter(midVb);
        
        getChildren().add(borderPane);
    }
    
    
}
