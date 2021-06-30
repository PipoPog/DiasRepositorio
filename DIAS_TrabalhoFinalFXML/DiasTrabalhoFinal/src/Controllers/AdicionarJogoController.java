/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Arbitro;
import Models.Classificacao;
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
  private Classificacao classif;
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
            int cod = connect.getById(txtEquipaCasa.getText()).getCod_equipa();
            int classi = connect.getById(txtEquipaCasa.getText()).getClassificacao();
            int vit = connect.getById(txtEquipaCasa.getText()).getVitorias();
            int derr = connect.getById(txtEquipaCasa.getText()).getDerrotas();
            int emp = connect.getById(txtEquipaCasa.getText()).getEmpates();
            int pont = connect.getById(txtEquipaCasa.getText()).getPontos();
            int cod2 = connect.getById(txtEquipaFora.getText()).getCod_equipa();
            int classi2 = connect.getById(txtEquipaFora.getText()).getClassificacao();
            int vit2 = connect.getById(txtEquipaFora.getText()).getVitorias();
            int derr2 = connect.getById(txtEquipaFora.getText()).getDerrotas();
            int emp2 = connect.getById(txtEquipaFora.getText()).getEmpates();
            int pont2 = connect.getById(txtEquipaFora.getText()).getPontos();
            
            if (Integer.parseInt(txtResCasa.getText())>Integer.parseInt(txtResFora.getText())){

              Classificacao classificacao = new Classificacao(cod,classi,vit+1,derr,emp,pont+3);
              Classificacao classificacao2 = new Classificacao(cod2,classi2,vit2,derr2+1,emp2,pont2);
              connect.Classificacaoupdate(classificacao);
              connect.Classificacaoupdate(classificacao2);
            }else if((Integer.parseInt(txtResCasa.getText())<Integer.parseInt(txtResFora.getText()))){
              Classificacao classificacao = new Classificacao(cod,classi,vit,derr+1,emp,pont);
              Classificacao classificacao2 = new Classificacao(cod2,classi2,vit2+1,derr2,emp2,pont2+3);
              connect.Classificacaoupdate(classificacao);
              connect.Classificacaoupdate(classificacao2);
            }else{
              Classificacao classificacao = new Classificacao(cod,classi,vit,derr,emp+1,pont+1);
              Classificacao classificacao2 = new Classificacao(cod2,classi2,vit2+1,derr2,emp2,pont2+1);
            }
            
            if (pont>pont2){
              Classificacao classificacao = new Classificacao(cod,classi-1,vit,derr,emp,pont);
              Classificacao classificacao2 = new Classificacao(cod2,classi2+1,vit,derr2+1,emp2,pont2);
              connect.Classificacaoupdate(classificacao);
              connect.Classificacaoupdate(classificacao2);
            }else{
              Classificacao classificacao = new Classificacao(cod,classi+1,vit,derr,emp,pont);
              Classificacao classificacao2 = new Classificacao(cod2,classi2-1,vit,derr2+1,emp2,pont2);
              connect.Classificacaoupdate(classificacao);
              connect.Classificacaoupdate(classificacao2);
            }
              
                      
                ((Node) (event.getSource())).getScene().getWindow().hide();
                
                System.out.println("Registo inserido com sucesso!");
                
        }
}
