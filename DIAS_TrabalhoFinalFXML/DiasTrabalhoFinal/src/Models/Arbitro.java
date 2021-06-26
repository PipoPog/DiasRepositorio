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
    /**
     * Jogo Responsável
     */
    private int jogoResponsavel;
  
    /**
     * Historico
     */
    


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
    public Arbitro(String nome, int jogoResponsavel) {
        this.nome = nome;
        this.jogoResponsavel = jogoResponsavel;

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
     * Método que permite obter o Jogo Responsável
     * @return Retorna o Jogo Responsável
     */
    public int getJogoResponsavel() {
        return jogoResponsavel;
    }

    /**
     * Método que permite definir o Jogo Responsável
     * @param jogoResposavel Jogo Responsável
     */
    public void setJogoResposavel(int jogoResposavel) {
        this.jogoResponsavel = jogoResponsavel;
    }

 
    public String toString() {
        return "Arbitro{" + "Nome=" + nome + ", CodJogo=" + jogoResponsavel + '}';

    }
}
