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

    private String nome;
    private String pais;
    

/**
 * Falta dados jogadores
 * @param codigoClube
 * @param nome
 * @param pais
 */
    public Clubes(String nome, String pais ) {
        this.nome = nome;
        this.pais = pais;
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

        return "Clube{" + " nome=" + nome + ", País=" + pais +'}';
    }
}
