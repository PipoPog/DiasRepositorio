
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
public class JogadoresController implements Initializable {

    @FXML
    private Button btnConsultarJogadores;
    @FXML
    private Button btnAdicionarJogadores;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void AdicionarJogador(ActionEvent event) throws IOException {
        abrirJanela("/Views/CriarJogador.fxml", event);
    }
    @FXML
    private void ConsultarJogador(ActionEvent event) throws IOException {
        abrirJanela("/Views/ConsultarJogadores.fxml", event);
    }


     public void abrirJanela(String caminho, ActionEvent event1) throws IOException {
        FXMLLoader fxml = new FXMLLoader(getClass().getResource(caminho));
        Parent root = (Parent) fxml.load();
        Stage stage = new Stage();
        stage.setTitle("Rato Esquilo - Gestão da Superliga");
        stage.setScene(new Scene(root, 1580, 800));
        stage.setResizable(false);
        stage.show();

    }
    
}
