package computer;

public class Computador {
  private String marca;
  private Procesador procesador;
  private Memoria memoria;
  private TarjetaMadre tarjetaMadre;
  private DiscoDuro discoDuro;
  private int costo;
  private String color;

  public Computador() {}

  public Computador(String marca, Procesador procesador, Memoria memoria, TarjetaMadre tarjetaMadre, DiscoDuro discoDuro, int costo, String color) {
    this.marca = marca;
    this.procesador = procesador;
    this.memoria = memoria;
    this.tarjetaMadre = tarjetaMadre;
    this.discoDuro = discoDuro;
    this.costo = costo;
    this.color = color;
  }


  /**
   * @return the marca
   */
  public String getMarca() {
    return marca;
  }

  /**
   * @return the procesador
   */
  public Procesador getProcesador() {
    return procesador;
  }

  /**
   * @return the memoria
   */
  public Memoria getMemoria() {
    return memoria;
  }

  /**
   * @return the tarjetaMadre
   */
  public TarjetaMadre getTarjetaMadre() {
    return tarjetaMadre;
  }

  /**
   * @return the discoDuro
   */
  public DiscoDuro getDiscoDuro() {
    return discoDuro;
  }

  /**
   * @return the costo
   */
  public int getCosto() {
    return costo;
  }

  /**
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * @param marca the marca to set
   */
  public void setMarca(String marca) {
    this.marca = marca;
  }

  /**
   * @param procesador the procesador to set
   */
  public void setProcesador(Procesador procesador) {
    this.procesador = procesador;
  }

  /**
   * @param memoria the memoria to set
   */
  public void setMemoria(Memoria memoria) {
    this.memoria = memoria;
  }

  /**
   * @param tarjetaMadre the tarjetaMadre to set
   */
  public void setTarjetaMadre(TarjetaMadre tarjetaMadre) {
    this.tarjetaMadre = tarjetaMadre;
  }

  /**
   * @param discoDuro the discoDuro to set
   */
  public void setDiscoDuro(DiscoDuro discoDuro) {
    this.discoDuro = discoDuro;
  }

  /**
   * @param costo the costo to set
   */
  public void setCosto(int costo) {
    this.costo = costo;
  }

  /**
   * @param color the color to set
   */
  public void setColor(String color) {
    this.color = color;
  }
}

