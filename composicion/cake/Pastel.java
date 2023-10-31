package composicion.cake;

import java.util.ArrayList;

public class Pastel {
  private String nombre;
  private int cantidadPersonas;
  private int precio;
  private ArrayList<Ingrediente> ingredientes;

  public Pastel(String nombre, int cantidadPersonas, int precio) {
    this.nombre = nombre;
    this.cantidadPersonas = cantidadPersonas;
    this.precio = precio;
    this.ingredientes = new ArrayList<Ingrediente>();
  }

  public void addIngrediente(Ingrediente ingrediente) {
    this.ingredientes.add(ingrediente);
  }

  public int cantidadIngredientes() {
    return ingredientes.size();
  }

  public int cantidadCalorias() {
    int caloriasDelPastel = 0;
    for (Ingrediente ingrendiente : ingredientes) {
      caloriasDelPastel += ingrendiente.getCalorias();
    }

    return caloriasDelPastel;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @return the cantidad
   */
  public int getCantidadPersonas() {
    return cantidadPersonas;
  }

  /**
   * @return the precio
   */
  public int getPrecio() {
    return precio;
  }

  /**
   * @param ingredientes the ingredientes to set
   */
  public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
    this.ingredientes = ingredientes;
  }
}
