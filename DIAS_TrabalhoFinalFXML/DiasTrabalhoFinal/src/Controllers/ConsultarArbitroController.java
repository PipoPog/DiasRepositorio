/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Arbitro;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ricardo Santos
 */
public class ConsultarArbitroController implements Initializable {

    @FXML
    private TableView<?> tableviewe;
    @FXML
    private TableColumn<Arbitro, String> cnNome;
    @FXML
    private TableColumn<Arbitro, Integer> cnCodArbitro;
    @FXML
    private TableColumn<Arbitro, String> cnJogoResp;
    @FXML
    private TableColumn<Arbitro, String> cnHistorico;
    @FXML
    private TextField filterField;
    @FXML
    private Button btnPesquisar;
    @FXML
    private Button btnEditarArbitro;
    @FXML
    private Button btnVoltar;
      
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
     public void abrirJanela(String caminho, ActionEvent event1) throws IOException {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource(caminho));
        Parent root = (Parent) fxml.load();
        Stage stage = new Stage();
        stage.setTitle("Rato-Esquilo - Gestor da Superliga");
        stage.setScene(new Scene(root, 1200, 800));
        stage.setResizable(false);

        stage.show();

    }
}
