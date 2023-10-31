package herencia.editorial;
public class Libro extends Publicacion {
    private int numPaginas;

    public Libro(String titulo, float precio, int numPaginas) {
        super(titulo, precio);
        this.numPaginas = numPaginas;
    } 

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
