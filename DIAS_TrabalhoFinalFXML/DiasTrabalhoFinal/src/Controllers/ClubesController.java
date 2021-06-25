/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class ClubesController implements Initializable {

    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnRemoverClubes;
    @FXML
    private Button btnEditarDadosClubes;
    @FXML
    private Button btnConsultarClubes;
    @FXML
    private Button btnAdicionarClubes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   @FXML
    private void AdicionarClubes(ActionEvent event) throws IOException {
        abrirJanela("/Views/AdicionarClubes.fxml", event);
    }

    @FXML
    private void ConsultarClubes(ActionEvent event) throws IOException {
        abrirJanela("/Views/ConsultarClubes.fxml", event);
    }


     public void abrirJanela(String caminho, ActionEvent event1) throws IOException {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource(caminho));
        Parent root = (Parent) fxml.load();
        Stage stage = new Stage();
        stage.setTitle("Rato Esquilo - Gestão da Superliga");
        stage.setScene(new Scene(root, 829, 550));
        stage.setResizable(false);
        stage.show();

    }
}
