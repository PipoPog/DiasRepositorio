package Models;

import java.util.ArrayList;

/**
 *Class jogador
 * @author André Marques
 */
public class Jogador {
    
   
    private String nome;
    private int codClube;
    private int idade;
    private String posicao;
    private String nacionalidade;
    private String nomeClube;
    private ArrayList<Jogo> estatisticas;
    private String peDom;
    private ArrayList<Jogo> historicoClube;
    
    /**
     * Metodo que premite criar um jogador
     * 
     * @param nome nome
     * @param codClube codigo clube
     * @param idade idade
     * @param posicao posicao
     * @param nacionalidade nacionalidade
     * @param nomeClube nome do clube
     * @param estatistica estatistica
     * @param peDom pe dominante
     * @param historicoClube historico de clubes
     */
    public Jogador(String nome, int codClube, int idade, String posicao, String nacionalidade, String nomeClube, ArrayList<Jogo> estatistica, String peDom, ArrayList<Jogo> historicoClube){
        this.nome = nome;
        this.codClube = codClube;
        this.idade = idade;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.nomeClube = nomeClube;
        this.estatisticas = estatistica;
        this.peDom = peDom;
        this.historicoClube = historicoClube;
        
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
     * Metodo que devolve a idade do jogador
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Metodo que define idade
     * @param idade 
     */
    public void setIdade(int idade) {
        this.idade = idade;
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
     * Metodo que devolve nome do clube
     * @return nome do clube
     */
    public String getNomeClube() {
        return nomeClube;
    }

    /**
     * Metodo que define nome do clube
     * @param nomeClube 
     */
    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    /**
     * Metodo que devolve estatistica
     * @return estatistica
     */
    public ArrayList<Jogo> getEstatisticas() {
        return estatisticas;
    }

    /**
     * Metodo que define estatistica
     * @param estatisticas 
     */
    public void setEstatisticas(ArrayList<Jogo> estatisticas) {
        this.estatisticas = estatisticas;
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

    /**
     * Metodo que devolve historico de clube
     * @return historico de clube
     */
    public ArrayList<Jogo> getHistoricoClube() {
        return historicoClube;
    }

    /**
     * Metodo que define historico de clube
     * @param historicoClube 
     */
    public void setHistoricoClube(ArrayList<Jogo> historicoClube) {
        this.historicoClube = historicoClube;
    }

     public String toString() {

        return "Jogador{" + "Nome do Jogador=" + nome + ", Codigo Clube=" + codClube + ", Idade=" + idade + 
                ", Estatisticas=" + " " + ", Posição=" + posicao + ", nacionalidade=" + nacionalidade + 
                ", Nome CLube=" + nomeClube + ", pe Dominante" + peDom + ", Historico Clube" + "" + "}";
    }        
}
 