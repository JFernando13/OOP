package file_manage.buffer_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  static void createFile(String nombreArchivo, String contenido) {
    try {
      // 1. Crear el archivo de escritura con su nombre y extension
      FileWriter file = new FileWriter(nombreArchivo + ".txt");

      // 2. Escribir lo necesario en el archivo
      file.write(contenido);

      // 3. Cerrar la escritura
      file.close();

      // 4. Mensaje satisfactorio
      System.out.println("Se ha creado el archivo correctamente");
    } catch (IOException err) {
      System.err.println(err.getMessage());
    }
  }

  static void readFile(String nombreArchivo) {
    try {
      // 1. Crear el archivo de lectura con el nombre y la extension
      FileReader fileToRead = new FileReader(nombreArchivo + ".txt");

      // 2. Crear un BufferReader para leer el contenido
      BufferedReader salida = new BufferedReader(fileToRead);

      // 3. Imprimir el contenido en pantalla
      // En este caso solo es un dato y no es necesario hacer una iteracion para leer
      // cada linea
      String contenidoArchivo = salida.readLine();
      System.out.println("El contenido del archivo es el siguiente: " + contenidoArchivo);

      // 4. Cerrar los procesos
      fileToRead.close();
    } catch (IOException err) {
      System.out.println(err.getMessage());
    }
  }

  public static void main(String[] args) throws IOException {
    // 1. Conseguir los datos con BufferReader
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Nombre del archivo:");
    String nombreArchivo = entrada.readLine();

    System.out.println("Contenido:");
    String contenido = entrada.readLine();

    // 2. Crear el archivo con los datos suministrados;
    createFile(nombreArchivo, contenido);

    // 3. Leer el archivo
    readFile(nombreArchivo);
  }

}
