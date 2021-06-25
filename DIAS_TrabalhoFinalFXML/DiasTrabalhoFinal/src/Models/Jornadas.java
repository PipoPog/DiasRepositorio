/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author lucpe
 */
public class Jornadas {
 
    private Date data;
    private String hora;
    private String local;
    private String equipa1;
    private String equipa2;
    private String codJornada;


    public Jornadas(Date data, String hora, String local, String equipa1, String equipa2, String codJornada ) {
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.equipa1 = equipa1;
        this.equipa2 = equipa2;
        this.codJornada = codJornada;
    }

  /**
   * @return the data
   */
  public Date getData() {
    return data;
  }

  /**
   * @param data the data to set
   */
  public void setData(Date data) {
    this.data = data;
  }

  /**
   * @return the hora
   */
  public String getHora() {
    return hora;
  }

  /**
   * @param hora the hora to set
   */
  public void setHora(String hora) {
    this.hora = hora;
  }

  /**
   * @return the local
   */
  public String getLocal() {
    return local;
  }

  /**
   * @param local the local to set
   */
  public void setLocal(String local) {
    this.local = local;
  }

  /**
   * @return the equipa1
   */
  public String getEquipa1() {
    return equipa1;
  }

  /**
   * @param equipa1 the equipa1 to set
   */
  public void setEquipa1(String equipa1) {
    this.equipa1 = equipa1;
  }

  /**
   * @return the equipa2
   */
  public String getEquipa2() {
    return equipa2;
  }

  /**
   * @param equipa2 the equipa2 to set
   */
  public void setEquipa2(String equipa2) {
    this.equipa2 = equipa2;
  }

  /**
   * @return the codJornada
   */
  public String getCodJornada() {
    return codJornada;
  }

  /**
   * @param codJornada the codJornada to set
   */
  public void setCodJornada(String codJornada) {
    this.codJornada = codJornada;
  }
   public String toString() {

        return "Jornada{" + "CodJornada=" + codJornada + ", Data=" + data + ", Hora=" + hora + ", Local=" + local + ", Equipa1=" + equipa1+", Equipa2="+equipa2+'}';
    }
    }