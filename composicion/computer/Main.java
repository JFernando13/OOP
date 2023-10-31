package composicion.computer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Computador> computadores = new ArrayList<Computador>();

    System.out.print("Dime la cantidad de computadores que quieres crear: ");
    Scanner scanner = new Scanner(System.in);
    int cantidad = scanner.nextInt();

    if (cantidad <= 0)
      System.out.println("Solo se permiten numeros positivos");

    for (int i = 0; i < cantidad; i++) {
      // Datos del Computador
      System.out.printf("Computador %s%n", i + 1);
      System.out.print("\t - Marca: ");
      String marcaComputador = scanner.next();

      System.out.print("\t - Color: ");
      String colorComputador = scanner.next();

      System.out.print("\t - Costo: ");
      int costoComputador = scanner.nextInt();

      // Dotos del procesador
      System.out.println("\t Procesador:");
      System.out.print("\t\t - Marca: ");
      String marcaProcesador = scanner.next();

      System.out.print("\t\t - Numero de nucleos: ");
      int numeroNucleosProcesador = scanner.nextInt();

      System.out.print("\t\t - Velocidad (Gh): ");
      int velocidadProcesador = scanner.nextInt();

      // Datos de la memoria
      System.out.println("\t Memoria:");
      System.out.print("\t\t - Tipo: ");
      String tipoMemoria = scanner.next();

      System.out.print("\t\t - Cantidad (Gh): ");
      int cantidadMemoria = scanner.nextInt();

      // Datos de la tarjeta madre
      System.out.println("\t Tarjeta Madre:");
      System.out.print("\t\t - Marca: ");
      String marcaTarjetaMadre = scanner.next();

      System.out.print("\t\t - Modelo: ");
      String modeloTarjetaMadre = scanner.next();

      System.out.print("\t\t - Versión: ");
      String versionTarjetaMadre = scanner.next();

      // Datos del disco duro
      System.out.println("\t Disco Duro:");
      System.out.print("\t\t - Capacidad: ");
      int capacidadDiscoDuro = scanner.nextInt();

      System.out.print("\t\t - Interfaz: ");
      String interfazDiscoDuro = scanner.next();

      System.out.print("\t\t - Teconologia de almacenamiento: ");
      String tecnologiaAlamacenamientoDiscoDuro = scanner.next();

      Procesador procesador = new Procesador(marcaProcesador, numeroNucleosProcesador, velocidadProcesador);
      Memoria memoria = new Memoria(cantidadMemoria, tipoMemoria);
      TarjetaMadre tarjetaMadre = new TarjetaMadre(marcaTarjetaMadre, modeloTarjetaMadre, versionTarjetaMadre);
      DiscoDuro discoDuro = new DiscoDuro(capacidadDiscoDuro, interfazDiscoDuro, tecnologiaAlamacenamientoDiscoDuro);

      Computador computador = new Computador(marcaComputador, procesador, memoria, tarjetaMadre, discoDuro,
          costoComputador, colorComputador);

      computadores.add(computador);
      System.out.printf("%nEl computador se agrego correctamente%n%n");
    }

    scanner.close();
  }

}
