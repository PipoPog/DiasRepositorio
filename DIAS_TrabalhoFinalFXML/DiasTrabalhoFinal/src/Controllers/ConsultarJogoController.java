/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Arbitro;
import Models.Jogo;
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
public class ConsultarJogoController implements Initializable {

    @FXML
    private AnchorPane PainelJogo;
    @FXML
    private TextField txtCodJogo;
    @FXML
    private TextField txtClubeFora;
    @FXML
    private TextField txtClubeCasa;
    private InteracaoBD conexao = new InteracaoBD();  
    TableView<Jogo> TabelaJogo;
    
    /**
     * Initializes the controller class.
     */
     @Override
    public void initialize(URL url, ResourceBundle rb) {
       try {
            TabelaJogo = listarJogoTabela(conexao.getJogo(20));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarJogoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelJogo.getChildren().add(TabelaJogo);

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
     public TableView listarJogoTabela(ArrayList<Jogo> listaJogo) throws SQLException {

        TableView tableView = new TableView();
       tableView.setMaxWidth(1200);
        tableView.setMinWidth(1200);
        tableView.setMaxHeight(800);
        tableView.setMinHeight(600);

        TableColumn<String, Jogo> column1 = new TableColumn<>("Codigo jogo");
        column1.setCellValueFactory(new PropertyValueFactory<>("cod_jornada"));
        column1.setMinWidth(365);
        column1.setMaxWidth(365);

        TableColumn<Integer, Jogo> column2 = new TableColumn<>("Clube Casa");
        column2.setCellValueFactory(new PropertyValueFactory<>("equip_casa"));
        column2.setMinWidth(150);
        column2.setMaxWidth(150);

        TableColumn<Integer, Jogo> column3 = new TableColumn<>("Clube Fora");
        column3.setCellValueFactory(new PropertyValueFactory<>("equip_fora"));
        column3.setMinWidth(150);
        column3.setMaxWidth(150);
                
        TableColumn<Integer, Jogo> column4 = new TableColumn<>("Resultado Casa");
        column4.setCellValueFactory(new PropertyValueFactory<>("result_equipcasa"));
        column4.setMinWidth(150);
        column4.setMaxWidth(150);
               
        TableColumn<Integer, Jogo> column5 = new TableColumn<>("Result Fora");
        column5.setCellValueFactory(new PropertyValueFactory<>("result_equipfora"));
        column5.setMinWidth(150);
        column5.setMaxWidth(150);
               
        TableColumn<Integer, Jogo> column6 = new TableColumn<>("Local");
        column6.setCellValueFactory(new PropertyValueFactory<>("local"));
        column6.setMinWidth(150);
        column6.setMaxWidth(150);
               
        TableColumn<Integer, Jogo> column7 = new TableColumn<>("Classificacao Casa");
        column7.setCellValueFactory(new PropertyValueFactory<>("classificacaocasa"));
        column7.setMinWidth(150);
        column7.setMaxWidth(150);
        
        TableColumn<Integer, Jogo> column8 = new TableColumn<>("Classificacao Fora");
        column8.setCellValueFactory(new PropertyValueFactory<>("classificacaofora"));
        column8.setMinWidth(150);
        column8.setMaxWidth(150);
        
        
        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
        tableView.getColumns().add(column4);
        tableView.getColumns().add(column5);
        tableView.getColumns().add(column6);
        tableView.getColumns().add(column7);
        tableView.getColumns().add(column8);
        
        
        
   
        for (Jogo jogo : listaJogo) {
            tableView.getItems().add(jogo);
        }
        return tableView;
    }
     @FXML
    private void atualizarTabela(ActionEvent event) {
        try {
            TabelaJogo = listarJogoTabela(conexao.getJogoPesquisa(txtCodJogo.getText(),txtClubeCasa.getText(),txtClubeFora.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarJogoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelJogo.getChildren().add(TabelaJogo);
    }
}