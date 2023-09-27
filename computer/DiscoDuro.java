package computer;

public class DiscoDuro {
  private int capacidad;
  private String interfaz;
  private String tecnologiaAlmacenamiento;

  public DiscoDuro(int capacidad, String interfaz, String tecnologiaAlmacenamiento) {
    this.capacidad = capacidad;
    this.interfaz = interfaz;
    this.tecnologiaAlmacenamiento = tecnologiaAlmacenamiento;
  }

  /**
   * @return the capacidad
   */
  public int getCapacidad() {
    return capacidad;
  }

  /**
   * @return the interfaz
   */
  public String getInterfaz() {
    return interfaz;
  }

  /**
   * @return the tecnologiaAlmacenamiento
   */
  public String getTecnologiaAlmacenamiento() {
    return tecnologiaAlmacenamiento;
  }

  /**
   * @param capacidad the capacidad to set
   */
  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  /**
   * @param interfaz the interfaz to set
   */
  public void setInterfaz(String interfaz) {
    this.interfaz = interfaz;
  }

  /**
   * @param tecnologiaAlmacenamiento the tecnologiaAlmacenamiento to set
   */
  public void setTecnologiaAlmacenamiento(String tecnologiaAlmacenamiento) {
    this.tecnologiaAlmacenamiento = tecnologiaAlmacenamiento;
  }
}
