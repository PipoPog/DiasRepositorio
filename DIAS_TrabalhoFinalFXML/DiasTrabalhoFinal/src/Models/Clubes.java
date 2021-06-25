/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


/**
 *
 * @author lucpe
 */
public class Clubes {
 
    private String codigoClube;
    private String nome;
    private String pais;
    private String historico;

/**
 * Falta dados jogadores
 * @param codigoClube
 * @param nome
 * @param pais
 * @param historico 
 */
    public Clubes(String codigoClube, String nome, String pais, String historico ) {
        this.codigoClube = codigoClube;
        this.nome = nome;
        this.pais = pais;
        this.historico = historico;
    }

  /**
   * @return the codigoClube
   */
  public String getCodigoClube() {
    return codigoClube;
  }

  /**
   * @param codigoClube the codigoClube to set
   */
  public void setCodigoClube(String codigoClube) {
    this.codigoClube = codigoClube;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the pais
   */
  public String getPais() {
    return pais;
  }

  /**
   * @param pais the pais to set
   */
  public void setPais(String pais) {
    this.pais = pais;
  }

  /**
   * @return the historico
   */
  public String getHistorico() {
    return historico;
  }

  /**
   * @param historico the historico to set
   */
  public void setHistorico(String historico) {
    this.historico = historico;
  }
    public String toString() {

        return "Clube{" + "codigoClube=" + codigoClube + ", nome=" + nome + ", País=" + pais + ", Jogador=" + " " + ", historico=" + historico+'}';
    }
}
