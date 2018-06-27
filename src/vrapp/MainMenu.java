/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrapp;

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
import javafx.scene.paint.Color;

/**
 *
 * @author henri
 */
public class MainMenu extends Parent{
    
     // layout for this screen
    private StackPane stackPane;
    private VBox vboxMenu = new VBox();
    
    // background image
    ImageView background;
    
    // UI nodes
    private Label nameLabel;
    private Button btnVRexplanation;
    private Button btnContent;
    private Button btnQuiz;
    private Button btnCredit;
    private Button btnQuit;
    
    // constructor
    MainMenu()
    {
        stackPane = new StackPane();
        
        createNodesForUI();
        addNodesToLayout();
    }
    
    
    // create the nodes objects for the UI
    private void createNodesForUI()
    {
         // add background image to image object
        background = new ImageView(new Image(getClass().getResourceAsStream("vr.png"))); 
        
        // Vbox layout
        vboxMenu = new VBox();   
        
        //Font style
        Font f = Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC, 30);
       
        // Label text style
        nameLabel = new Label("Main Menu");
        nameLabel.setFont(f);
        nameLabel.setTextFill(Color.web("#ffffff"));
        
        
        // ui buttons
        btnVRexplanation = new Button ("What is a VR device?");
        btnContent = new Button("Content");
        btnQuiz = new Button("Quiz");
        btnCredit = new Button ("Credits");
        btnQuit = new Button("Quit");
        
        btnVRexplanation.setPrefWidth(200);
        btnContent.setPrefWidth(150);
        btnQuiz.setPrefWidth(150);
        btnCredit.setPrefWidth(150);
        btnQuit.setPrefWidth(150);
        
        // set Vbox layout details and size
        vboxMenu.setPrefSize(800,600);
        vboxMenu.setSpacing(10);
        vboxMenu.setPadding(new Insets(0, 20, 10, 20)); 
        vboxMenu.setAlignment(Pos.CENTER);       
        
       // button event handler
       
        btnVRexplanation.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(2);
            }
        });
        
        btnContent.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(4);
            }
        });
        
        //btn quiz event
        btnQuiz.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(16);
            }
        });
        
        btnCredit.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(6);
            }
        });
        
      
    }
    
    
    
    
    // add the child nodes to the layout
    private void addNodesToLayout()
    {
        //Add everything to layout
        vboxMenu.getChildren().addAll( nameLabel,btnVRexplanation, btnContent, btnQuiz,btnCredit, btnQuit,background);
        stackPane.getChildren().addAll(background,vboxMenu);
     
       
        //calling the layout
        getChildren().add(stackPane);
       
        
    }
    
    
}
