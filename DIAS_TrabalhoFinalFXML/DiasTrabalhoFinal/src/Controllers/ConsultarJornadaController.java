/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Ricardo Santos
 */
public class ConsultarJornadaController implements Initializable {

    @FXML
    private TextField txtCodEquipa;
    @FXML
    private TextField txtCodJornada;
    @FXML
    private AnchorPane PainelJornadas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void atualizarTabela(ActionEvent event) {
    }
    
}
