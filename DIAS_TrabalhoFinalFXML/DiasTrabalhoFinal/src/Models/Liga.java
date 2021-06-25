package Models;

import Models.Jogo;
import Models.Clubes;

public class Liga {

    /**
     * Classificação
     */
    private int classificacao;
    /**
     * Prémios
     */
    private int premios;

    /**
     * Jogos
     */
    private Jogo jogos;
    /**
     * Clubes
     */
    private Clubes clubes;

    /**
     * Método construtor vazio
     */
    public Liga() {

    }

    /**
     *
     * @param classificacao Classificação
     * @param premios Prémios
     * @param jogos Jogos
     * @param clubes Clubes
     */
    public Liga(int classificacao, int premios, Jogo jogos, Clubes clubes) {
        this.classificacao = classificacao;
        this.premios = premios;
        this.jogos = jogos;
        this.clubes = clubes;
    }

    /**
     * Método que permite obter a Classificação
     *
     * @return Retorna a Classificação
     */
    public int getClassificacao() {
        return classificacao;
    }

    /**
     * Método que permite definir a Classificação
     *
     * @param classificacao Classificação
     */
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * Método que permite obter os Prémios
     *
     * @return Retorna os Prémios
     */
    public int getPremios() {
        return premios;
    }

    /**
     * Método que permite definir os Prémios
     *
     * @param premios Prémios
     */
    public void setPremios(int premios) {
        this.premios = premios;
    }

    /**
     * Método que permite obter os Jogos
     *
     * @return Retorna os Jogos
     */
    public Jogo getJogo() {
        return jogos;
    }

    /**
     * Método que permite definir os Jogos
     *
     * @param jogos Jogos
     */
    public void setJogo() {
        this.jogos = jogos;
    }

    /**
     * Método que permite obter os Clubes
     *
     * @return Retorna os Clubes
     */
    public Clubes getClube() {
        return clubes;
    }

    /**
     * Método que permite definir os Clubes
     *
     * @param clubes Clubes
     */
    public void setClube() {
        this.clubes = clubes;
    }

    public String toString() {
        return "Liga{" + "classificação=" + classificacao + ", prémio=" + premios + ", jogo=" + jogos + ", clubes=" + clubes + '}';

    }

}
