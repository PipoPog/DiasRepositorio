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
 * @author lucpe
 */
public class MenuPrincipalController implements Initializable {

  @FXML
  private Button btnJogadores;
  @FXML
  private Button btnArbitros;
  @FXML
  private Button btnClubes;
  @FXML
  private Button btnJornada;
    @FXML
    private Button btnClassi;
    @FXML
    private Button btnEstat;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

   @FXML
    private void Jornada(ActionEvent event) throws IOException {
        abrirJanela("/Views/Jogo.fxml", event);
    }

    @FXML
    private void Arbitro(ActionEvent event) throws IOException {
        abrirJanela("/Views/Arbitro.fxml", event);
    }

    @FXML
    private void Clubes(ActionEvent event) throws IOException {
        abrirJanela("/Views/Clubes.fxml", event);
    }
     @FXML
    private void Jogador(ActionEvent event) throws IOException {
        abrirJanela("/Views/Jogadores.fxml", event);
    }
    private void Jogo(ActionEvent event) throws IOException {
        abrirJanela("/Views/Jogo.fxml", event);
    }

     public void abrirJanela(String caminho, ActionEvent event1) throws IOException {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource(caminho));
        Parent root = (Parent) fxml.load();
        Stage stage = new Stage();
        stage.setTitle("Rato Esquilo - Gestão da Superliga");
        stage.setScene(new Scene(root, 1500, 850));
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    private void Classificacao(ActionEvent event) throws IOException {
      abrirJanela("/Views/ConsultarClassificacao.fxml", event); 
    }

    @FXML
    private void Estatisticas(ActionEvent event) throws IOException {
      abrirJanela("/Views/ConsultarEstatisticas.fxml", event);
    }
  
}
