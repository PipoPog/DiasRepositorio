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
 
    private int codigoClube;
    private String nome;
    private String pais;
    

/**
 * Falta dados jogadores
 * @param codigoClube
 * @param nome
 * @param pais
 */
    public Clubes(int codigoClube, String nome, String pais ) {
        this.codigoClube = codigoClube;
        this.nome = nome;
        this.pais = pais;
    }

  /**
   * @return the codigoClube
   */
  public int getCodigoClube() {
    return codigoClube;
  }

  /**
   * @param codigoClube the codigoClube to set
   */
  public void setCodigoClube(int codigoClube) {
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

  
    public String toString() {

        return "Clube{" + "codigoClube=" + codigoClube + ", nome=" + nome + ", País=" + pais + ", Jogador=" + " " +'}';
    }
}
