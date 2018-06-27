/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author henri
 */
public class VRApp extends Application {
    
   // static instance of MainScreen class
    private static MainScreen mainScreen;
    
    //  singleton class - get a static reference so can be accessed from other classes
    public static MainScreen getMainScreen()
    {
        return mainScreen;
    }
    
    
    // JavaFX start() method - need to run the program
    @Override
    public void start(Stage primaryStage)
    {
        Group root = new Group();                       // Group - a container with no special layout to its child ndoes
        mainScreen = new MainScreen(root);              // create a MainScreen object
        
        // create the main Scene object
        Scene scene = new Scene(root, 800, 600);    
        mainScreen.startApp();
        
        // setup the JavaFX stage
        primaryStage.setTitle("VR Learning App");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
     // class to manage application screen
    public class MainScreen
    {
        // Main data controller object (provide access to content data)
        private DataController dataController;
        
        // Group - a container with no special layout to its child ndoes        
        private Group root;
      
        // screens
        private Splash splash;                  // splash layout
        private MainMenu menu;                  // menu layout
        private whatsvr whatsVR;                // what is vr screen
        private Quiz quiz;                      // quiz screen
        private QuizAnswer quizA;               // Answers screen
        private Credits credit;                 // credit screen
        
        // all devices screen 
        private Morpheus morpheus;              
        private SGear sgear;
        private OculusGo ogo;
        private OculusRift orift;
        private HTCVive htcvive;
        private HTCPro htcpro;
        private GDayDream gdaydream;
        private GCardboard gcardboard;
   
        
        
        // MainScreen constructor
        private MainScreen(Group _root) 
        {
            this.root = _root;
        }
                
        // start teh app by opening the splash screen
        public void startApp()
        {
            dataController = new DataController();
            
            splash = new Splash();
            root.getChildren().addAll(splash);
        }
        
        
        public DataController getDataController()
        {
            return dataController;
        }
             
        
        // change screens by changing the layout
        public void changeScreen(int screenNumber)
        {
            switch (screenNumber)
            {
                case 1:
                    // menu
                    root.getChildren().remove(splash);
                    splash = null;
                    menu = new MainMenu();
                    root.getChildren().addAll(menu);
                    break;
                    
                case 2:
                    // Whats VR screen
                    root.getChildren().remove(menu);
                    menu = null;
                    whatsVR = new whatsvr();
                    root.getChildren().addAll(whatsVR);
                    break;
                    
                 case 3:
                    // Back to menu
                    root.getChildren().remove(whatsVR);
                    whatsVR = null; 
                    menu = new MainMenu();
                    root.getChildren().addAll(menu);
                    break;
                    
                 case 4:
                    
                    root.getChildren().remove(menu);
                    menu = null;
                    morpheus = new Morpheus();
                    root.getChildren().addAll(morpheus);
                    break;
                    
                  case 5:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    menu = new MainMenu();
                    root.getChildren().addAll(menu);
                    break;
                    
                  case 6:
                    
                    root.getChildren().remove(menu);
                    menu = null;
                    credit = new Credits();
                    root.getChildren().addAll(credit);
                    break;
                    
                  case 7:
                    
                    root.getChildren().remove(credit);
                    credit = null;
                    menu = new MainMenu();
                    root.getChildren().addAll(menu);
                    break;
                    
                   case 8:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    morpheus = new Morpheus();
                    root.getChildren().addAll(morpheus);
                    break;
                    
                   case 9:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    sgear = new SGear();
                    root.getChildren().addAll(sgear);
                    break;
                    
                   case 10:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    ogo = new OculusGo();
                    root.getChildren().addAll(ogo);
                    break;
                    
                    case 11:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    orift = new OculusRift();
                    root.getChildren().addAll(orift);
                    break;
                    
                    case 12:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    htcvive = new HTCVive();
                    root.getChildren().addAll(htcvive);
                    break;
                    
                    case 13:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    htcpro = new HTCPro();
                    root.getChildren().addAll(htcpro);
                    break;
                    
                    case 14:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    gdaydream = new GDayDream();
                    root.getChildren().addAll(gdaydream);
                    break;
                    
                    case 15:
                    
                    if(morpheus !=null){
                        root.getChildren().remove(morpheus);
                        morpheus = null;
                    }else if ( sgear != null){
                        root.getChildren().remove(sgear);
                        sgear = null;
                    }else if ( ogo != null){
                        root.getChildren().remove(ogo);
                        ogo = null;
                    }else if ( orift != null){
                        root.getChildren().remove(orift);
                        orift = null;
                    }else if ( htcvive != null){
                        root.getChildren().remove(htcvive);
                        htcvive = null;
                    }else if ( htcpro != null){
                        root.getChildren().remove(htcpro);
                        htcpro = null;
                    }else if ( gdaydream != null){
                        root.getChildren().remove(gdaydream);
                        gdaydream = null;
                    }else if ( gcardboard != null){
                        root.getChildren().remove(gcardboard);
                        gcardboard = null;
                    }
                    gcardboard = new GCardboard();
                    root.getChildren().addAll(gcardboard);
                    break;
                    
                  case 16:
                    root.getChildren().remove(menu);
                    menu = null;
                    quiz = new Quiz();
                    root.getChildren().addAll(quiz);
                    break;
                    
                  case 17:
                    root.getChildren().remove(quiz);
                    quiz = null;
                    menu = new MainMenu();
                    root.getChildren().addAll(menu);
                    break;
                    
                  case 18:
                    quizA = new QuizAnswer();
                    root.getChildren().addAll(quizA);
                    break;
                    
                  case 19:
                    root.getChildren().remove(quizA);
                    quizA = null;
                    root.getChildren().remove(quiz);
                    quiz = null;
                    menu = new MainMenu();
                    root.getChildren().addAll(menu);
                    break;
  

                default:
                     break;
                     
                     
                     
                     
            }      
         }
    }    

     /**
     * Java main class - used to start the program
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
