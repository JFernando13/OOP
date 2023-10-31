package composicion.cake;

public class Ingrediente {
  private String nombre;
  private String unidad;
  private int cantidad;
  private int calorias;

  public Ingrediente(String nombre, String unidad, int cantidad, int calorias) {
    this.nombre = nombre;
    this.unidad = unidad;
    this.cantidad = cantidad;
    this.calorias = calorias;
  }

  /**
   * @return the calorias
   */
  public int getCalorias() {
    return calorias;
  }

  /**
   * @return the cantidad
   */
  public int getCantidad() {
    return cantidad;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @return the unidad
   */
  public String getUnidad() {
    return unidad;
  }
}
