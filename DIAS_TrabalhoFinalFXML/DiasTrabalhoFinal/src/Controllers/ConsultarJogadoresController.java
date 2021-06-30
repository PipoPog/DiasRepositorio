/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Arbitro;
import Models.Jogador;
import diastrabalhofinal.InteracaoBD;
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class ConsultarJogadoresController implements Initializable {

    @FXML
    private AnchorPane PainelJogadores;
    TableView<Jogador> TabelaJogador;
    private InteracaoBD conexao = new InteracaoBD();
    @FXML
    private TextField txtCodClube;
    @FXML
    private TextField txtNome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            TabelaJogador = listarJogadoresTabela(conexao.getJogadores(60));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarArbitroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelJogadores.getChildren().add(TabelaJogador);
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

    public TableView listarJogadoresTabela(ArrayList<Jogador> listaJogadores) throws SQLException {

        TableView tableView = new TableView();
        tableView.setMaxWidth(1125);
        tableView.setMinWidth(1125);
        tableView.setMaxHeight(321);

        TableColumn<Integer, Jogador> column1 = new TableColumn<>("Código Clube");
        column1.setCellValueFactory(new PropertyValueFactory<>("codClube"));
        column1.setMinWidth(365);
        column1.setMaxWidth(365);

        TableColumn<String, Jogador> column2 = new TableColumn<>("Nome");
        column2.setCellValueFactory(new PropertyValueFactory<>("nome"));
        column2.setMinWidth(150);
        column2.setMaxWidth(150);

        TableColumn<String, Jogador> column3 = new TableColumn<>("Data de Nascimento");
        column3.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
        column3.setMinWidth(150);
        column3.setMaxWidth(150);

        TableColumn<String, Jogador> column4 = new TableColumn<>("Posição");
        column4.setCellValueFactory(new PropertyValueFactory<>("posicao"));
        column4.setMinWidth(150);
        column4.setMaxWidth(150);

        TableColumn<String, Jogador> column5 = new TableColumn<>("Nacionalidade");
        column5.setCellValueFactory(new PropertyValueFactory<>("nacionalidade"));
        column5.setMinWidth(150);
        column5.setMaxWidth(150);

        TableColumn<String, Jogador> column6 = new TableColumn<>("Pé Dominante");
        column6.setCellValueFactory(new PropertyValueFactory<>("peDom"));
        column6.setMinWidth(150);
        column6.setMaxWidth(150);

        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
        tableView.getColumns().add(column4);
        tableView.getColumns().add(column5);
        tableView.getColumns().add(column6);

        for (Jogador jogadores : listaJogadores) {
            tableView.getItems().add(jogadores);
        }

        return tableView;

    }
         @FXML
    private void atualizarTabela(ActionEvent event) {
        try {
            TabelaJogador = listarJogadoresTabela(conexao.getJogadoresPesquisa(txtCodClube.getText(),txtNome.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarJogadoresController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelJogadores.getChildren().add(TabelaJogador);
    }

}
