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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author henri
 */
public class Splash extends Parent {
     // layout for this screen
    private StackPane stackPane;
    
    // UI nodes
    Button btnWelcome = new Button();
    ImageView background;
    
    
    // Splash constructor
    public Splash()
    {
        stackPane = new StackPane();
        
        createNodesForUI();      
        addNodesToLayout();      
    }
    
    
    // create the nodes objects for the UI
    private void createNodesForUI()
    {
        btnWelcome = new Button();
        btnWelcome.setText("VR learning app");
        
        // button event handler
        btnWelcome.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(1);
            }
        });
         
        // add background image to image object
        background = new ImageView(new Image(getClass().getResourceAsStream("splashpic.png")));
    }
    
    
    // add the child nodes to the layout
    private void addNodesToLayout()
    {
        // add to this object's layout
        stackPane.getChildren().addAll(background,btnWelcome);
        
        // then add to the application's layout
        getChildren().add(stackPane);
    }
    
}
