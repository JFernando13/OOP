package computer;

public class Procesador {
  private String marca;
  private int numeroNucleos;
  private int velocidad;

  public Procesador() {}

  public Procesador(String marca, int numeroNucleos, int velocidad) {
    this.marca = marca;
    this.numeroNucleos = numeroNucleos;
    this.velocidad = velocidad;
  }

  /**
   * @return the marca
   */
  public String getMarca() {
    return marca;
  }

  /**
   * @return the numeroDeNucleos
   */
  public int getNumeroNucleos() {
    return numeroNucleos;
  }

  /**
   * @return the velocidad
   */
  public int getVelocidad() {
    return velocidad;
  }

  /**
   * @param marca the marca to set
   */
  public void setMarca(String marca) {
    this.marca = marca;
  }

  /**
   * @param numeroDeNucleos the numeroDeNucleos to set
   */
  public void setNumeroNucleos(int numeroDeNucleos) {
    this.numeroNucleos = numeroDeNucleos;
  }

  /**
   * @param velocidad the velocidad to set
   */
  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }
}