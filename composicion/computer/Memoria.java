package composicion.computer;

public class Memoria {
  private int cantidad;
  private String tipo;

  public Memoria() {
  }

  public Memoria(int cantidad, String tipo) {
    this.tipo = tipo;
    this.cantidad = cantidad;
  }

  /**
   * @return the cantidad
   */
  public int getCantidad() {
    return cantidad;
  }

  /**
   * @return the tipo
   */
  public String getTipo() {
    return tipo;
  }

  /**
   * @param cantidad the cantidad to set
   */
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  /**
   * @param tipo the tipo to set
   */
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}