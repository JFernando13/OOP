package file_manage.system;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  static void createNewFile(String fileName, ArrayList<ArrayList<String>> data) throws IOException {
    if (fileName.length() == 0) {
      throw new Error("Debes colocar un nombre al archivo");
    }

    FileWriter file = new FileWriter(fileName + ".txt");

    for (ArrayList<String> user : data) {
      for (int i = 0; i < user.size(); i++) {
        if (i == user.size() - 1) {
          file.write(user.get(i));
        } else {
          file.write(user.get(i) + " - ");
        }
      }
      file.write("\n");
    }

    file.close();

    /* READ FILE */
    Scanner myReader = new Scanner(new FileReader(fileName + ".txt"));
    while (myReader.hasNextLine()) {
      System.out.println(myReader.nextLine());
    }

    myReader.close();

  }

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    ArrayList<ArrayList<String>> data = new ArrayList<>();

    System.out.println("Nombre del archivo:");
    String fileName = input.nextLine();

    System.out.println("Cuantos usuarios quieres añadir:");
    int amountUser = input.nextInt();
    input.nextLine();

    for (int i = 0; i < amountUser; i++) {
      ArrayList<String> userData = new ArrayList<String>();

      System.out.println("Nombre:");
      String name = input.nextLine();
      userData.add(name);

      System.out.println("Edad:");
      String age = input.nextLine();
      userData.add(age);

      System.out.println("Cedula:");
      String id = input.nextLine();
      userData.add(id);

      data.add(userData);
    }

    createNewFile(fileName, data);

    input.close();
  }
}