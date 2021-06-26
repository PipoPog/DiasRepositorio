package Models;

import java.util.ArrayList;
import javafx.scene.control.DatePicker;

/**
 *Class jogador
 * @author André Marques
 */
public class Jogador {
    
    private int codClube;
    private String nome;
    private DatePicker dataNascimento;
    private String posicao;
    private String nacionalidade;
    private String peDom;
  
    
   
    public Jogador(int codClube, String nome, DatePicker dataNascimento, String posicao, String nacionalidade, String peDom){
        this.codClube = codClube;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.peDom = peDom;
     
        
    }

     /**
     * Metodo que devolve codigo do clube
     * @return codigo do clube
     */
    public int getCodClube() {
        return codClube;
    }

    /**
     * Metodo que define codigo do clube
     * @param codClube 
     */
    public void setCodClube(int codClube) {
        this.codClube = codClube;
    }
    
    /**
     * Metodo que devolve nome do jogador
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Metodo que define nome do jogador
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    /**
     * Metodo que devolve data de Nascimento
     * @return dataNascimento
     */
    public DatePicker getDataNascimento() {
        return dataNascimento;
    }
    
    /**
     * Metodo que define data de Nascimento
     * @param dataNascimento 
     */
    public void setdataNascimento(DatePicker dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
   

    /**
     * Metodo que devolve posicao do jogador
     * @return posicao
     */
    public String getPosicao() {
        return posicao;
    }

    /**
     * Metodo que define posicao do jogador
     * @param posicao 
     */
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    /**
     * Metodo que devolve nacionalidade
     * @return nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Metodo que define nacionalidade
     * @param nacionalidade 
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

 

  

    /**
     * Metodo que devolve pe dominante
     * @return pe dominante
     */
    public String getPeDom() {
        return peDom;
    }

    /**
     * Metodo que define posicao do jogador
     * @param peDom 
     */
    public void setPeDom(String peDom) {
        this.peDom = peDom;
    }

 

     public String toString() {

        return "Jogador{" + "Nome do Jogador=" + nome + ", Codigo Clube=" + codClube +  
                ", Data de nascimento=" + dataNascimento + ", Posição=" + posicao + ", nacionalidade=" + nacionalidade + 
                 ", pe Dominante" + peDom + "}";
    }        
}
 