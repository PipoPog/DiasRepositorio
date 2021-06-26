/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diastrabalhofinal;

import java.io.IOException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author lucpe
 */
public class DiasTrabalhoFinal extends Application {
  
  @Override
  public void start(Stage stage) throws IOException {
     Parent root;
        root = FXMLLoader.load(getClass().getResource("/Views/Linguagem.fxml"));
        Scene scene = new Scene(root,829, 550);
        stage.setTitle("Rato-Esquilo - Gestão da SuperLiga");
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws SQLException {
    launch(args);
  }
  
}
