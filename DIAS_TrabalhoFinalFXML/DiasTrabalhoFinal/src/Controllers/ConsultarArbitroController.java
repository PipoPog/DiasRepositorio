/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import diastrabalhofinal.InteracaoBD;
import Models.Arbitro;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ricardo Santos
 */
public class ConsultarArbitroController implements Initializable {

    @FXML
    private Button btnEditarArbitro;
    TableView<Arbitro> TabelaArbitro;
  @FXML
  private AnchorPane PainelArbitros;
  @FXML
  private TextField txtCodJogo;
  @FXML
  private TextField txtNome;
  private InteracaoBD conexao = new InteracaoBD();
      
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try {
            TabelaArbitro = listarArbitrosTabela(conexao.get(20));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarArbitroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelArbitros.getChildren().add(TabelaArbitro);

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
     public TableView listarArbitrosTabela(ArrayList<Arbitro> listaArbitros) throws SQLException {

        TableView tableView = new TableView();
        tableView.setMaxWidth(1125);
        tableView.setMinWidth(1125);
        tableView.setMaxHeight(321);

        TableColumn<String, Arbitro> column1 = new TableColumn<>("Nome");
        column1.setCellValueFactory(new PropertyValueFactory<>("nome"));
        column1.setMinWidth(365);
        column1.setMaxWidth(365);

        TableColumn<Integer, Arbitro> column2 = new TableColumn<>("Código jogo");
        column2.setCellValueFactory(new PropertyValueFactory<>("jogoResponsavel"));
        column2.setMinWidth(150);
        column2.setMaxWidth(150);


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        for (Arbitro arbitro : listaArbitros) {
            tableView.getItems().add(arbitro);
        }
        return tableView;
    }
     @FXML
    private void atualizarTabela(ActionEvent event) {
        try {
            TabelaArbitro = listarArbitrosTabela(conexao.getArbitroPesquisa(txtNome.getText(),txtCodJogo.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarArbitroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelArbitros.getChildren().add(TabelaArbitro);
    }
}
