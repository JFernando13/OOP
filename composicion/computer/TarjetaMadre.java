package composicion.computer;

public class TarjetaMadre {
  private String marca;
  private String modelo;
  private String version;

  public TarjetaMadre(String marca, String modelo, String version) {
    this.marca = marca;
    this.modelo = modelo;
    this.version = version;
  }

  /**
   * @return the marca
   */
  public String getMarca() {
    return marca;
  }

  /**
   * @return the modelo
   */
  public String getModelo() {
    return modelo;
  }

  /**
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * @param marca the marca to set
   */
  public void setMarca(String marca) {
    this.marca = marca;
  }

  /**
   * @param modelo the modelo to set
   */
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  /**
   * @param version the version to set
   */
  public void setVersion(String version) {
    this.version = version;
  }
}
