package composicion.cake;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
  static ArrayList<Pastel> pasteles = new ArrayList<>();

  private static void imprimirMensajeFinal(JFrame frame, JPanel panel, int i, Pastel pastel, GridBagConstraints gbc) {
    String mensaje = i + ". " + pastel.getNombre() + " tiene " + pastel.cantidadIngredientes() + " ingredientes y "
        + pastel.cantidadCalorias() + " calorias";
    JLabel labelMensaje = new JLabel(mensaje);

    gbc.gridx = 0;
    gbc.gridy = i;
    panel.add(labelMensaje, gbc);
    frame.add(panel);
  }

  private static void imprimirFormPastel(JFrame frame, JPanel panel, GridBagConstraints gbc) {
    JTextField nombrePastel = new JTextField(15);
    JTextField cantidadPersonas = new JTextField(15);
    JTextField precio = new JTextField(15);

    JLabel labelNombrePastel = new JLabel("Nombre del pastel:");
    JLabel labelCantidadPersonas = new JLabel("Cantidad de personas:");
    JLabel labelPrecio = new JLabel("Precio del pastel:");
    JLabel error = new JLabel();

    JButton btnAgregarPastel = new JButton("Agregar Pastel");

    panel.removeAll();

    gbc.gridx = 0;
    gbc.gridy = 0;
    panel.add(labelNombrePastel, gbc);

    gbc.gridx = 1;
    gbc.gridy = 0;
    panel.add(nombrePastel, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    panel.add(labelCantidadPersonas, gbc);

    gbc.gridx = 1;
    gbc.gridy = 1;
    panel.add(cantidadPersonas, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    panel.add(labelPrecio, gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    panel.add(precio, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    panel.add(error, gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    panel.add(btnAgregarPastel, gbc);

    btnAgregarPastel.addActionListener(e -> {
      if (cantidadPersonas.getText().isEmpty() || precio.getText().isEmpty() || nombrePastel.getText().isEmpty()) {
        error.setText("Hubo un fuerte error");
        return;
      }
      Pastel pastel = new Pastel(nombrePastel.getText(), Integer.parseInt(cantidadPersonas.getText()),
          Integer.parseInt(precio.getText()));
      pasteles.add(pastel);

      imprimirFormIngredientes(frame, panel, gbc, pastel);
    });

    panel.revalidate();
    panel.repaint();
    frame.add(panel);

  }

  private static void imprimirFormIngredientes(JFrame frame, JPanel panel, GridBagConstraints gbc, Pastel pastel) {

    JTextField nombreIngrediente = new JTextField(15);
    JTextField unidadDeMedida = new JTextField(15);
    JTextField cantidad = new JTextField(15);
    JTextField calorias = new JTextField(15);

    JLabel labelNombreIngrediente = new JLabel("Nombre del Ingrediente: ");
    JLabel labelUnidadDeMedida = new JLabel("Unidad de medida: ");
    JLabel labelCantidad = new JLabel("Cantidad: ");
    JLabel labelCalorias = new JLabel("Calorias: ");
    JLabel error = new JLabel("");

    JButton btnAgregarIngrediente = new JButton("Agregar Ingrediente");

    panel.removeAll();
    gbc.gridx = 0;
    gbc.gridy = 0;
    panel.add(labelNombreIngrediente, gbc);

    gbc.gridx = 1;
    gbc.gridy = 0;
    panel.add(nombreIngrediente, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    panel.add(labelUnidadDeMedida, gbc);

    gbc.gridx = 1;
    gbc.gridy = 1;
    panel.add(unidadDeMedida, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    panel.add(labelCantidad, gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    panel.add(cantidad, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    panel.add(labelCalorias, gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    panel.add(calorias, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    panel.add(error, gbc);

    gbc.gridx = 1;
    gbc.gridy = 4;
    panel.add(btnAgregarIngrediente, gbc);

    btnAgregarIngrediente.addActionListener(e -> {
      if (cantidad.getText().isEmpty() || calorias.getText().isEmpty() || nombreIngrediente.getText().isEmpty()
          || unidadDeMedida.getText().isEmpty()) {
        error.setText("Hubo un error");
        return;
      }

      Ingrediente ingrediente = new Ingrediente(nombreIngrediente.getText(), unidadDeMedida.getText(),
          Integer.parseInt(cantidad.getText()), Integer.parseInt(calorias.getText()));
      pastel.addIngrediente(ingrediente);
      imprimirMenu(frame, panel, gbc, pastel);
    });

    panel.revalidate();
    panel.repaint();
    frame.add(panel);
  }

  private static void imprimirMenu(JFrame frame, JPanel panel, GridBagConstraints gbc, Pastel pastel) {
    JButton btnNuevoIngrediente = new JButton("Añadir nuevo ingrediente");
    JButton btnNuevoPastel = new JButton("Añadir nuevo pastel");
    JButton btnSalir = new JButton("Salir");

    panel.removeAll();

    panel.add(btnNuevoIngrediente);
    panel.add(btnNuevoPastel);
    panel.add(btnSalir);

    btnSalir.addActionListener(e -> {
      panel.removeAll();
      for (int i = 0; i < pasteles.size(); i++) {
        Pastel pastelActual = pasteles.get(i);
        imprimirMensajeFinal(frame, panel, i + 1, pastelActual, gbc);
      }

      panel.revalidate();
      panel.repaint();
    });

    btnNuevoPastel.addActionListener(e -> {
      imprimirFormPastel(frame, panel, gbc);
    });

    btnNuevoIngrediente.addActionListener(e -> imprimirFormIngredientes(frame, panel, gbc, pastel));

    panel.revalidate();
    panel.repaint();

    frame.add(panel);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Aplicacion de postres");

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);

    imprimirFormPastel(frame, panel, gbc);

    frame.setSize(700, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
