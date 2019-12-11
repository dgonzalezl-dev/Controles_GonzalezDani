/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class PruebaMytf extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label label=new Label();
        MyTextField mtf=new MyTextField();
        
        StackPane root = new StackPane();
        root.getChildren().add(mtf);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Prueba MyTextField");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
