import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
  private JComboBox<String> comboBox1;
  private JComboBox<String> comboBox2;
  private JButton button;

  public MainFrame() {
    initialize();
  }

  public void initialize() {
    setTitle("ARRIENDOS CON CUOTAS");
    setSize(800, 200);
    setMinimumSize(new Dimension(800, 150));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    // ----------- Crear los JComboBox------------------------------------------------

    comboBox1 = new JComboBox<String>();
    comboBox1.setBounds(10, 10, 80, 20);
    comboBox1.addItem("Seleccione CLIENTE"); 
    comboBox1.setSelectedIndex(0); 
    comboBox1.addItem("Maria");
    comboBox1.addItem("Jose");
    comboBox1.addItem("Pedro");
    comboBox1.addItem("Juan");

    comboBox2  = new JComboBox<String>();
    comboBox2.setBounds(10, 10, 80, 20);
    comboBox2.addItem("Seleccione AUTOMOVIL"); 
    comboBox2.setSelectedIndex(0); 
    comboBox2.addItem("Toyota");
    comboBox2.addItem("Chevrolet");
    comboBox2.addItem("Ford");
    comboBox2.addItem("Nissan");


    // Crear el botón
    button = new JButton("Aceptar");

    // Configurar el diseño del JFrame
    setLayout(new FlowLayout());

    // Agregar los componentes al JFrame
    add(comboBox1);
    add(comboBox2);
  // ----------- Fin JComboBox ----------------------------------------------------------------


    JLabel label = new JLabel("Fecha de arriendo:");


    JTextField fechaArriendo = new JTextField(10); 


    add(label);
    add(fechaArriendo);

    add(new JLabel("Dias:"));


    JTextField dias = new JTextField(5); 

    add(dias);

    add(new JLabel("Precio por dia:"));


    JTextField precioXDias = new JTextField(5); 


    add(precioXDias);


    add(new JLabel("Monto a pagar:"));

    JTextField montopagar = new JTextField(5); 
   
    add(montopagar);

   // ----------- Crear los JComboBox------------------------------------------------
   
    add(button);

    // Agregar el ActionListener al botón
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Acción a realizar al hacer clic en el botón

      }
    });

    // Hacer visible la ventana
    setVisible(true);
  }

  public static void main(String[] args) {
    // Crear una instancia de la clase MainFrame
    MainFrame frame = new MainFrame();
  }
}
