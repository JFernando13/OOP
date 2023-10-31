package herencia.editorial;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Titulo del libro:");
    String tituloLibroUser = input.nextLine();

    System.out.println("Titulo del CD:");
    String tituloCDUser = input.nextLine();

    System.out.println("Precio del libro:");
    float precioLibroUser = input.nextFloat();

    System.out.println("Precio del CD:");
    float precioCDUser = input.nextFloat();

    System.out.println("Numero de paginas del libro:");
    int numPaginasUser = input.nextInt();

    System.out.println("Tiempo de reproduccion del CD:");
    float tiempoReproduccionUser = input.nextFloat();

    Libro libro = new Libro(tituloLibroUser, precioLibroUser, numPaginasUser);
    CD cd = new CD(tituloCDUser, precioCDUser, tiempoReproduccionUser);

    System.out.printf("Libro: %s - %s pag. - $%s COP%n", libro.getTitulo(), libro.getNumPaginas(), libro.getPrecio());

    System.out.printf("CD: %s - %s seg. - $%s COP%n", cd.getTitulo(), cd.getTiempoReproduccion(), cd.getPrecio());

    input.close();
  }
}