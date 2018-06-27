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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.net.URL;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.FontPosture;
import javafx.scene.web.WebView;

/**
 *
 * @author henri
 */
public class whatsvr extends Parent {
    
      // layout
    private BorderPane borderPane;
    
    
    
    private VBox vboxBack = new VBox();
    private VBox vboxMenu = new VBox();
    
  
    private Media media;
    private MediaView mediaView;
    
     // UI nodes
    private Label nameLabel;
    private Button btnBack;
    
    //constructor
    public whatsvr()
    {
        createNodesForUI();
        createVideoPlayer();
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
        
        btnBack = new Button("Back to Content");
        nameLabel = new Label("What is VR?");
       
        
         // back to all Content
    btnBack.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event)
            {
                VRApp.getMainScreen().changeScreen(3);
            }
        });
    }
    
    private void configureUINodes()
    {
        //Font style
        Font f = Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC, 30);
       
        // Label text style
        nameLabel.setFont(f);
        nameLabel.setTextFill(Color.web("#000000"));
        
        btnBack.setPrefWidth(150);
        
        vboxMenu.getChildren().add(nameLabel);
        vboxMenu.setAlignment(Pos.TOP_CENTER);
        
        vboxBack.getChildren().add(btnBack);
        vboxBack.setAlignment(Pos.BOTTOM_CENTER);
        
    }
   
    private void createVideoPlayer()
    {

        URL mediaUrl = getClass().getResource("whatsvr.mp4");
        String mediaStringUrl = mediaUrl.toExternalForm();
        
        media = new Media(mediaStringUrl);
        
        // Create a Media Player
        final MediaPlayer player = new MediaPlayer(media);

        // Automatically begin the playback
        player.setAutoPlay(true);

        // Create a 400X300 MediaView
        mediaView = new MediaView(player);
        mediaView.setFitWidth(600);
        mediaView.setFitHeight(400);   
        mediaView.setSmooth(true);
    }
   
    
     private void addNodesToLayout()
    {
       // Add VBoxes to Pane
       borderPane.setTop(vboxMenu);
       borderPane.setBottom(vboxBack);
        borderPane.setCenter(mediaView);
      
          
       getChildren().add(borderPane);
    }
    
}
