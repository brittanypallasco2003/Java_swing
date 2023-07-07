package interfaz_grafica;

import javax.swing.*;

public class VentanaPrincipal {

    /*
      Los elementos que se agregaron en el .form, osea
      la interfaz grafica. Se agregan tambien a la CLASE.java
      a la que hace referencia el .form
      Como ATRIBUTOS
      */
    private JButton miPrimerBoton;
    private JCheckBox micheckbox1;
    private JCheckBox checkBox2;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JCheckBox checkBox3;
    private JPanel rootPanel;

    /*NOTA: TODOS ESTOS atributos son de tipo privado NO SE PUEDE ACCEDER
     A ELLOS DIRECTAMENTE por el MAINVENTANAPRINCIPAL*/

    //Se deben crear los setters y los getters para que los atributos sean accedidos por otras clases
    public JPanel getRootPanel() {
        return rootPanel;
    }

}
