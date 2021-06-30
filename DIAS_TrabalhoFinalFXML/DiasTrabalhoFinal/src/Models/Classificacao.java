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
public class Classificacao {
  private int cod_equipa;
  private int classificacao ;
  private int vitorias ;
  private int derrotas ;      
  private int empates ;
  private int pontos ;
  
public Classificacao(int cod_equipa, int classificacao, int vitorias, int derrotas, int empates, int pontos) {
        this.cod_equipa = cod_equipa;
        this.classificacao = classificacao;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.pontos = pontos;
}


  /**
   * @return the cod_equipa
   */
  public int getCod_equipa() {
    return cod_equipa;
  }

  /**
   * @param cod_equipa the cod_equipa to set
   */
  public void setCod_equipa(int cod_equipa) {
    this.cod_equipa = cod_equipa;
  }

  /**
   * @return the classificacao
   */
  public int getClassificacao() {
    return classificacao;
  }

  /**
   * @param classificacao the classificacao to set
   */
  public void setClassificacao(int classificacao) {
    this.classificacao = classificacao;
  }

  /**
   * @return the vitorias
   */
  public int getVitorias() {
    return vitorias;
  }

  /**
   * @param vitorias the vitorias to set
   */
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  /**
   * @return the derrotas
   */
  public int getDerrotas() {
    return derrotas;
  }

  /**
   * @param derrotas the derrotas to set
   */
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  /**
   * @return the empates
   */
  public int getEmpates() {
    return empates;
  }

  /**
   * @param empates the empates to set
   */
  public void setEmpates(int empates) {
    this.empates = empates;
  }

  /**
   * @return the pontos
   */
  public int getPontos() {
    return pontos;
  }

  /**
   * @param pontos the pontos to set
   */
  public void setPontos(int pontos) {
    this.pontos = pontos;
  }
   public String toString() {
        return "Classificacao{" + "Cod_Equipa=" + cod_equipa + ", classificacao=" + classificacao+ ", vitorias="+vitorias+", derrotas="+derrotas+", empates="+empates+", pontos="+pontos + '}';

    }
    }