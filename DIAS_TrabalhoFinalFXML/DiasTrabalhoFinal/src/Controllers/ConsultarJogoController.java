/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class ConsultarJogoController implements Initializable {

    @FXML
    private Button btnVoltar;
    @FXML
    private TableView<?> idTableView;
    @FXML
    private TableColumn<?, ?> idNome;
    @FXML
    private TableColumn<?, ?> idCodigo;
    @FXML
    private TableColumn<?, ?> idIdade;
    @FXML
    private TextField idTxtPesquisar;
    @FXML
    private Button idBtnPesquisar;
    @FXML
    private Button btnRemoverJogo;
    @FXML
    private Button btnEditarJogo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
