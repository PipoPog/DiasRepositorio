package Models;

/**
 *Class jogos
 * @author André Marques
 */
public class Jogo {
    
    private int golos;
    private int cartoesAmarelos;
    private int cartoesVermelhos;
    private int substituicoes;
    private int golosAnulados;
    private String resultadoInt;
    private String resultadoFin;
    private int codJogo;
    
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
    public Jogo(int golos, int cartoesAmarelos, int cartoesVermelhos, int substituicoes,
                int golosAnulados, String resultadoInt, String resultadoFin, int codJogo){
        this.golos = golos;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
        this.substituicoes = substituicoes;
        this.golosAnulados = golosAnulados;
        this.resultadoInt = resultadoInt;
        this.resultadoFin = resultadoFin;
        this.codJogo = codJogo;
        
    }

    /**
     * Metodo que devolve golos
     * @return golos
     */
    public int getGolos() {
        return golos;
    }

    /**
     * Metodo que define golos
     * @param golos 
     */
    public void setGolos(int golos) {
        this.golos = golos;
    }

    /**
     * Metodo que devolve cartoes amarelos
     * @return cartoes amarelos
     */
    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    /**
     * Metodo que define cartoes amarelos
     * @param cartoesAmarelos 
     */
    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    /**
     * Metodo que devolve cartoes vermelhos
     * @return cartoes vermelhos
     */
    public int getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    /**
     * Metodo que define cartoes vermelhos
     * @param cartoesVermelhos 
     */
    public void setCartoesVermelhos(int cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }

    /**
     * Metodo que devolve substituicoes
     * @return substituicoes
     */
    public int getSubstituicoes() {
        return substituicoes;
    }

    /**
     * Metodos define substituicoes
     * @param substituicoes 
     */
    public void setSubstituicoes(int substituicoes) {
        this.substituicoes = substituicoes;
    }
    
    /**
     * Metodo que devolve os golos anulados
     * @return golos anulados
     */
    public int getGolosAnulados() {
        return golosAnulados;
    }

    /**
     * Metodo que define os golos anulados
     * @param golosAnulados 
     */
    public void setGolosAnulados(int golosAnulados) {
        this.golosAnulados = golosAnulados;
    }
    
    /**
     * Metodo que devolve o resultado do intervalo
     * @return resultado do intervalo
     */
    public String getResultadoInt() {
        return resultadoInt;
    }
    
    /**
     * Metodo que define resultado do intervalo
     * @param resultadoInt 
     */
    public void setResultadoInt(String resultadoInt) {
        this.resultadoInt = resultadoInt;
    }
    
    /**
     * Metodo que devolve resultado final
     * @return resultado final
     */
    public String getResultadoFin() {
        return resultadoFin;
    }
    
    /**
     * Metodo que define resultado final
     * @param resultadoFin 
     */
    public void setResultadoFin(String resultadoFin) {
        this.resultadoFin = resultadoFin;
    }

    /**
     * Metodo que devolve o codigo de jogo
     * @return codigo de jogo
     */
    public int getCodJogo() {
        return codJogo;
    }
    
    /**
     * Metodo que define codigo de jogo
     * @param codJogo 
     */
    public void setCodJogo(int codJogo) {
        this.codJogo = codJogo;
    }
    
      public String toString() {

        return "Jogo{" + "Golos=" + golos + ", Cartoes Amarelos=" + cartoesAmarelos + 
                ", Cartoes Vermelhos=" + cartoesVermelhos + ", Substituições=" + substituicoes +
                ", Golos Anulados=" + golosAnulados + ", Resultado Intervalo=" + resultadoInt + 
                ", Resultado Final=" + resultadoFin + ", Codigo Jogo=" + codJogo + '}';
    }
}
