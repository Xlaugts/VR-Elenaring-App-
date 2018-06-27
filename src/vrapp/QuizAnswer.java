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
public class QuizAnswer  extends Parent{
     // layout
    private BorderPane borderPane;
    
    private Label question1;
    private Label question2;
    private Label question3;
    private Label question4;
    private Label question5;
    private Label question6;
    private Label question7;
    private Label question8;
    
    private VBox rightVb;
    private VBox bottomVb;
    
    private Button btnBack;
    
    
    public QuizAnswer(){
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
        question1 = new Label("1 - A");
        question2 = new Label("2 - B");
        question3 = new Label("3 - B");
        question4 = new Label("4 - A");
        question5 = new Label("5 - A");
        question6 = new Label("6 - B");
        question7 = new Label("7 - A");
        question8 = new Label("8 - B");
        
        btnBack = new Button("Back");
        
        rightVb = new VBox();
        bottomVb = new VBox();
        
        btnBack.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(19);
            }
        });

    }
    
     // configure the UI (styling and position)
    private void configureUINodes()
    {
        
        Font f = Font.font("Arial",FontWeight.BOLD,FontPosture.REGULAR, 15);
        
        question1.setFont(f);
        question2.setFont(f);
        question3.setFont(f);
        question4.setFont(f);
        question5.setFont(f);
        question6.setFont(f);
        question7.setFont(f);
        question8.setFont(f);
       
       rightVb.getChildren().addAll(question1,question2,question3,question4,question5,question6,question7,question8);
       rightVb.setAlignment(Pos.CENTER_LEFT);
       rightVb.setPadding(new Insets(0, 70, 10, 50));
       rightVb.setSpacing(15);
       
       bottomVb.getChildren().addAll(btnBack);
       bottomVb.setAlignment(Pos.CENTER);
        
    }
    
    
      // add the child nodes to the layout
    private void addNodesToLayout()
    {
        // Add VBoxes to Pane
       borderPane.setBottom(bottomVb);       
       borderPane.setRight(rightVb);
        
       getChildren().add(borderPane);
        
    }
    
    
}
