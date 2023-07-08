package interfaz_grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {

    private JPanel rootPanel;
    private JButton botonVentanaEmergente;
    private JTextField inputNombreUsuario;
    private JButton bienvenidaUsuarioboton;
    private JLabel mensajeLabelUsuario;
    private JLabel ingreseUsuarioLabel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JCheckBox seePassowrdCheckBox;
    private JButton ingresarboton;

    /*NOTA: TODOS ESTOS atributos son de tipo privado NO SE PUEDE ACCEDER
     A ELLOS DIRECTAMENTE por el MAINVENTANAPRINCIPAL*/

    //Se deben crear los setters y los getters para que los atributos sean accedidos por otras clases
    public JPanel getRootPanel() {
        return rootPanel;
    }

    /*
    CREATE LISTENER--LISTENERACTION
    GENERA un constructor en la clase que hace referencia el form
     */

    //BOTON VENTANA EMERGENTE----
    public VentanaPrincipal() {
        botonVentanaEmergente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //cuando se da clic al boton, botonVentanaEmergente se abrira una ventana Emergente
                JOptionPane.showMessageDialog(null, "Hola Mundo");
            }
        });

        //BOTON BIENVENIDA---
        bienvenidaUsuarioboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //CAPTURAR LO QUE EL USUARIO INGRESE
                String nombreUsuario = inputNombreUsuario.getText();//llamamos al elemento text field de la interfaz grafica seguido del getText-->se OBTIENE LO QUE INGRESA el usuario, y se guarda en una variable
                String mensajeBienvenida="Bienvenido "+nombreUsuario+" ! :)";
                inputNombreUsuario.setText(mensajeBienvenida);//seteamos el texto que se muestra como label para que se muestre en la ventana
            }
        });


        //BOTON AUTENTICACION USUARIO---
        ingresarboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario=textField1.getText();
                String password=String.valueOf(passwordField1.getPassword());
                if(usuario.equals("bri")&& password.equals("123")){
                    JOptionPane.showMessageDialog(null,"Usuario Identificado");
                }else {
                    JOptionPane.showMessageDialog(null,"Error en usuario y clave");
                }
            }
        });

        //CHECKBOX-----
        seePassowrdCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //seePassowrdCheckBox.isSelected();//retorna true si esta seleccionado, false si no lo esta
                if(seePassowrdCheckBox.isSelected()){
                    passwordField1.setEchoChar((char)0);//para el caso de mostrar. Como setEchoChar espera un char, se le manda un 0
                }else {
                    passwordField1.setEchoChar('*');//si el check esta desabilitado se llenara el texfield de *
                                                    //setea caul caracter va a utilizar para ocultar la contraseña
                }

            }
        });
    }



}
