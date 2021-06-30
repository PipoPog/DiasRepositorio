/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Clubes;
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
public class ConsultarClubesController implements Initializable {

    
    TableView<Clubes> TabelaClubes;
    
    @FXML
    private AnchorPane PainelClubes;
    @FXML
    private TextField txtCodClube;
    @FXML
    private TextField txtNomeClube;
    private InteracaoBD conexao = new InteracaoBD();  
    
  
    
     /**
     * Initializes the controller class.
     */
     @Override
    public void initialize(URL url, ResourceBundle rb) {
       try {
            TabelaClubes = listarClubesTabela(conexao.getClubes(20));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarJogoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelClubes.getChildren().add(TabelaClubes);

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
     
     private int codigoClube;
    private String nome;
    private String pais;
     
     public TableView listarClubesTabela(ArrayList<Clubes> listaClubes) throws SQLException {

        TableView tableView = new TableView();
        tableView.setMaxWidth(1125);
        tableView.setMinWidth(1125);
        tableView.setMaxHeight(321);

        TableColumn<Integer, Clubes> column2 = new TableColumn<>("Nome Clube");
        column2.setCellValueFactory(new PropertyValueFactory<>("nome"));
        column2.setMinWidth(150);
        column2.setMaxWidth(150);

        TableColumn<Integer, Clubes> column3 = new TableColumn<>("País Clube");
        column3.setCellValueFactory(new PropertyValueFactory<>("pais"));
        column3.setMinWidth(150);
        column3.setMaxWidth(150);
                
        
       
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
       
        
        
        
   
        for (Clubes clubes : listaClubes) {
            tableView.getItems().add(clubes);
        }
        return tableView;
    }
      @FXML
    private void atualizarTabela(ActionEvent event) {
        try {
            TabelaClubes = listarClubesTabela(conexao.getClubesPesquisa(txtNomeClube.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarJogoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelClubes.getChildren().add(TabelaClubes);
    }
}
    
