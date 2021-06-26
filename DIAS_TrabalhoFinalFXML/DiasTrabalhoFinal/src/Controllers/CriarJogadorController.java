/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Jogador;
import diastrabalhofinal.InteracaoBD;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class CriarJogadorController implements Initializable {

    @FXML
    private Button btnAdicionar;
  @FXML
  private TextField txtNome;
  @FXML
  private TextField txtIdade;
  @FXML
  private TextField txtCodClube;
  @FXML
  private TextField txtPosicao;
  @FXML
  private TextField txtNacionalidade;
  @FXML
  private TextField txtNomeClube;
  @FXML
  private TextField txtPeDom;
  @FXML
  private TextField txtEstatistica;
  @FXML
  private TextField txtHistoricoClube;
  InteracaoBD connect = new InteracaoBD();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    private void Voltar(ActionEvent event) throws IOException {
        abrirJanela("/Views/Linguagem.fxml", event);
    }

  @FXML
    private void addJogador(ActionEvent event) throws SQLException, ParseException {

           Jogador jogador = new Jogador(Integer.parseInt(txtCodClube.getText()), txtNome.getText(), txtIdade.getText(),
                   txtPosicao.getText(),txtNacionalidade.getText(), txtPeDom.getText());

                connect.adicionarJogo(jogador);
                ((Node) (event.getSource())).getScene().getWindow().hide();
                
                System.out.println("Registo inserido com sucesso!");
                
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
