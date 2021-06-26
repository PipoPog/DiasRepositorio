/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Arbitro;
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
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author lucpe
 */
public class AdicionarArbitroController implements Initializable {

  @FXML
  private TextField txtNome;
  @FXML
  private Button btnAdicionar;
  @FXML
  private TextField txtCodJogo;
  InteracaoBD connect = new InteracaoBD();

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  
  @FXML
    private void addArbitro(ActionEvent event) throws SQLException, ParseException {

            Arbitro arbitro = new Arbitro(txtNome.getText(), Integer.parseInt(txtCodJogo.getText()));

            connect.adicionarArbitro(arbitro);
                ((Node) (event.getSource())).getScene().getWindow().hide();
                
                System.out.println("Registo inserido com sucesso!");
                
        }
    }
