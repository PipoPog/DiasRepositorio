package Models;

import java.util.ArrayList;

public class Arbitro {

    /**
     * Nome
     */
    private String nome;
    /**
     * Código de Arbitro
     */
    private int codArbitro;
    /**
     * Jogo Responsável
     */
    private String jogoResposavel;
  
    /**
     * Historico
     */
    
    private ArrayList<Jogo> historicos;

    /**
     * Método construtor vazio
     */
    public Arbitro() {

    }
/**
 * 
 * @param nome Nome
 * @param codArbitro Código de Arbitro
 * @param jogoResponsavel Jogo Responsável
 * @param historicos  Historico
 */
    public Arbitro(String nome, int codArbitro, String jogoResponsavel, ArrayList<Jogo> historicos) {
        this.nome = nome;
        this.codArbitro = codArbitro;
        this.jogoResposavel = jogoResponsavel;
        this.historicos = historicos;

    }

    /**
     * Método que permite obter o Nome
     * @return Retorna o Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que permite definir o Nome
     * @param nome Nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que permite obter o Código do Arbitro
     * @return Retorna o Código do Arbitro
     */
    public int getCodArbitro() {
        return codArbitro;
    }

    /**
     * Método que permite definir o Código do Arbitro
     * @param codArbitro Código do Arbitro
     */
    public void setCodArbitro(int codArbitro) {
        this.codArbitro = codArbitro;
    }

    /**
     * Método que permite obter o Jogo Responsável
     * @return Retorna o Jogo Responsável
     */
    public String getJogoResposavel() {
        return jogoResposavel;
    }

    /**
     * Método que permite definir o Jogo Responsável
     * @param jogoResposavel Jogo Responsável
     */
    public void setJogoResposavel(String jogoResposavel) {
        this.jogoResposavel = jogoResposavel;
    }

    /**
     * Método que permite obter o Histórico
     * @return Retorna o Histórico
     */
    public ArrayList<Jogo> getHistoricos() {
        return historicos;
    }

    /**
     * Método que permite definir o Historico
     * @param historicos Historico
     */
    public void setComponents(ArrayList<Jogo> historicos) {
        this.historicos = historicos;
    }
    public String toString() {
        return "Arbitro{" + "Nome=" + nome + ", código de árbitro=" + codArbitro + ", jogo responsável=" + jogoResposavel + ", histórico=" + historicos+ '}';

    }
}
