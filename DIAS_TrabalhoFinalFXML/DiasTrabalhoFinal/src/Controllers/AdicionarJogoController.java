/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Arbitro;
import Models.Jogo;
import diastrabalhofinal.InteracaoBD;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class AdicionarJogoController implements Initializable {

  @FXML
  private Button btnVoltar;
  private TextField txtCodJogo;
  @FXML
  private TextField txtEquipaCasa;
  @FXML
  private TextField txtCodJornada;
  @FXML
  private Label txtJornada;
  @FXML
  private TextField txtEquipaFora;
  @FXML
  private TextField txtResCasa;
  @FXML
  private TextField txtResFora;
  @FXML
  private TextField txtLocal;
  @FXML
  private TextField txtclasscasa;
  @FXML
  private TextField txtclasfora;
  @FXML
  private Button btnAdicionar;
  InteracaoBD connect = new InteracaoBD();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void addJogo(ActionEvent event) throws SQLException, ParseException {

           Jogo jogo = new Jogo(Integer.parseInt(txtCodJornada.getText()), Integer.parseInt(txtEquipaCasa.getText()),Integer.parseInt(txtEquipaFora.getText()),
                   Integer.parseInt(txtResCasa.getText()),Integer.parseInt(txtResFora.getText()),txtLocal.getText(),Integer.parseInt(txtclasscasa.getText()),Integer.parseInt(txtclasfora.getText()) );

            connect.adicionarJogo(jogo);
                ((Node) (event.getSource())).getScene().getWindow().hide();
                
                System.out.println("Registo inserido com sucesso!");
                
        }
}
