package Models;

/**
 *Class jogos
 * @author André Marques
 */
public class Jogo {
    
    private int cod_jornada;
    private int equip_casa;
    private int equip_fora;
    private int result_equipcasa;
    private int result_equipfora;
    private String local;
    private int classificacaocasa;
    private int classificacaofora;
    
    /**
     * Metodo que premite criar um jogo
     * 
     * @param golos golos
     * @param cartoesAmarelos cartoes amarelos
     * @param cartoesVermelhos cartoes vermelhos
     * @param substituicoes substituicoes
     * @param golosAnulados golos anulados
     * @param resultadoInt resultado inicial
     * @param resultadoFin resultado final
     * @param codJogo codigo de jogo
     */
    public Jogo(int cod_jornada, int equip_casa, int equip_fora, int result_equipcasa,
                int result_equipfora, String local, int classificacaocasa, int classificacaofora){
      this.classificacaocasa = classificacaocasa;
      this.classificacaofora = classificacaofora;
      this.cod_jornada = cod_jornada;
      this.equip_casa = equip_casa;
      this.equip_fora = equip_fora;
      this.local = local;
      this.result_equipcasa = result_equipcasa;
      this.result_equipfora = result_equipfora;
   
    }


  /**
   * @return the cod_jornada
   */
  public int getCod_jornada() {
    return cod_jornada;
  }

  /**
   * @param cod_jornada the cod_jornada to set
   */
  public void setCod_jornada(int cod_jornada) {
    this.cod_jornada = cod_jornada;
  }

  /**
   * @return the equip_casa
   */
  public int getEquip_casa() {
    return equip_casa;
  }

  /**
   * @param equip_casa the equip_casa to set
   */
  public void setEquip_casa(int equip_casa) {
    this.equip_casa = equip_casa;
  }

  /**
   * @return the equip_fora
   */
  public int getEquip_fora() {
    return equip_fora;
  }

  /**
   * @param equip_fora the equip_fora to set
   */
  public void setEquip_fora(int equip_fora) {
    this.equip_fora = equip_fora;
  }

  /**
   * @return the result_equipcasa
   */
  public int getResult_equipcasa() {
    return result_equipcasa;
  }

  /**
   * @param result_equipcasa the result_equipcasa to set
   */
  public void setResult_equipcasa(int result_equipcasa) {
    this.result_equipcasa = result_equipcasa;
  }

  /**
   * @return the result_equipfora
   */
  public int getResult_equipfora() {
    return result_equipfora;
  }

  /**
   * @param result_equipfora the result_equipfora to set
   */
  public void setResult_equipfora(int result_equipfora) {
    this.result_equipfora = result_equipfora;
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
   * @return the classificacaocasa
   */
  public int getClassificacaocasa() {
    return classificacaocasa;
  }

  /**
   * @param classificacaocasa the classificacaocasa to set
   */
  public void setClassificacaocasa(int classificacaocasa) {
    this.classificacaocasa = classificacaocasa;
  }

  /**
   * @return the classificacaofora
   */
  public int getClassificacaofora() {
    return classificacaofora;
  }

  /**
   * @param classificacaofora the classificacaofora to set
   */
  public void setClassificacaofora(int classificacaofora) {
    this.classificacaofora = classificacaofora;
  }
        public String toString() {

        return "Jogo{" + "CodJornada=" + cod_jornada + ", Equipa Casa=" + equip_casa + 
                ", Equip Fora=" + equip_fora + ", Resultado Equipa Casa=" + result_equipcasa +
                ", Resultado Equipa Fora=" + result_equipfora + ", Local=" + local + 
                ", Classificação Casa=" + classificacaocasa + ", Classificação Fora=" + classificacaofora + '}';
    }
}
