package herencia.editorial;
public class Publicacion {
    private String titulo;
    private float precio;
    
    public Publicacion(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
