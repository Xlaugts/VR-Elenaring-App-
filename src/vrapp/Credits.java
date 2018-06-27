/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author henri
 */
public class Credits extends Parent{
    
     // layout
    private BorderPane borderPane;
    
    private VBox vboxBack = new VBox();
    private VBox vboxMenu = new VBox();
    private VBox vboxMid = new VBox();
    
    private Label nameLabel;
    private Label lbl1;
    private Label lbl2;
    private Label lbl3;
    private Label lbl4;
    private Label lbl5;
    private Label lbl6;
    private Button btnBack;
    
    
    //constructor
    public Credits()
    {
        createNodesForUI();
        configureUINodes();
        addNodesToLayout();
    }
    
    private void createNodesForUI()
    {
         // layout object
        borderPane = new BorderPane(); 
        borderPane.setPrefSize(800,600); 
        
        // Vbox layout
        vboxBack = new VBox();
        vboxMenu = new VBox();
        vboxMid = new VBox();
        
        btnBack = new Button("Back to Content");
        nameLabel = new Label("Credits");
        lbl1 = new Label("Programmer / Designer");
        lbl2 = new Label("Henrique Pirani");
        lbl3 = new Label("Helpers");
        lbl4 = new Label("Google.com and MBikeFX application");
        lbl5 = new Label("Thanks to Dinesh for the video his Youtube Channel EngineersDream");
        lbl6 = new Label("https://www.youtube.com/channel/UCN_oBeWCCrYJ20a6R6kJN5w/videos");
        
            // back to all Content
    btnBack.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(7);
            }
        });
        
    }
    
     private void configureUINodes()
    {
        //Font style
        Font f = Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC, 30);
        Font f2 = Font.font("Arial",FontWeight.BOLD,FontPosture.REGULAR, 18);
       
        // Label text style
        nameLabel.setFont(f);
        nameLabel.setTextFill(Color.web("#000000"));
        
        btnBack.setPrefWidth(150);
        
        lbl1.setFont(f2);

        lbl3.setFont(f2);

        lbl5.setFont(f2);
        
        vboxMid.getChildren().addAll(lbl1,lbl2,lbl3,lbl4,lbl5,lbl6);
        vboxMenu.setAlignment(Pos.CENTER);
        
        vboxMenu.getChildren().add(nameLabel);
        vboxMenu.setAlignment(Pos.TOP_CENTER);
        
        vboxBack.getChildren().add(btnBack);
        vboxBack.setAlignment(Pos.BOTTOM_CENTER);
        
        
    }
     
     
      private void addNodesToLayout()
    {
       // Add VBoxes to Pane
       borderPane.setTop(vboxMenu);
       borderPane.setBottom(vboxBack);
       borderPane.setCenter(vboxMid);
      
          
       getChildren().add(borderPane);
    }
    
}
