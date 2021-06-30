/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Classificacao;
import diastrabalhofinal.InteracaoBD;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author lucpe
 */
public class ConsultarClassificaçõesController implements Initializable {

  @FXML
  private AnchorPane PainelClass;
  TableView<Classificacao> TabelaClassi;
  private InteracaoBD conexao = new InteracaoBD();

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    try {
            TabelaClassi= listarClassificacao(conexao.getVit(20));
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarEstatisticasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        PainelClass.getChildren().add(TabelaClassi);
  }  
       public TableView listarClassificacao(ArrayList<Classificacao> listaclassificacao) throws SQLException {

        TableView tableView = new TableView();
        tableView.setMaxWidth(1200);
        tableView.setMinWidth(1200);
        tableView.setMaxHeight(800);
        tableView.setMinHeight(600);

        TableColumn<Integer,Classificacao> column1 = new TableColumn<>("CódigoEquipa");
        column1.setCellValueFactory(new PropertyValueFactory<>("cod_equipa"));
        column1.setMinWidth(200);
        column1.setMaxWidth(200);

        TableColumn<Integer,Classificacao> column2 = new TableColumn<>("Classificação");
        column2.setCellValueFactory(new PropertyValueFactory<>("classificacao"));
        column2.setMinWidth(200);
        column2.setMaxWidth(200);

        TableColumn<Integer,Classificacao> column3 = new TableColumn<>("Vitorias");
        column3.setCellValueFactory(new PropertyValueFactory<>("vitorias"));
        column3.setMinWidth(200);
        column3.setMaxWidth(200);

        TableColumn<Integer,Classificacao> column4 = new TableColumn<>("Derrotas");
        column4.setCellValueFactory(new PropertyValueFactory<>("derrotas"));
        column4.setMinWidth(200);
        column4.setMaxWidth(200);

        TableColumn<Integer,Classificacao> column5 = new TableColumn<>("Empates");
        column5.setCellValueFactory(new PropertyValueFactory<>("empates"));
        column5.setMinWidth(200);
        column5.setMaxWidth(200);

        TableColumn<Integer, Classificacao> column6 = new TableColumn<>("Pontos");
        column6.setCellValueFactory(new PropertyValueFactory<>("pontos"));
        column6.setMinWidth(200);
        column6.setMaxWidth(200);

        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
        tableView.getColumns().add(column4);
        tableView.getColumns().add(column5);
        tableView.getColumns().add(column6);

        for (Classificacao classificacao : listaclassificacao) {
            tableView.getItems().add(classificacao);
        }

        return tableView;

       }
}
