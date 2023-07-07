package interfaz_por_cod;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola Mundo"); /*se crea un objeto de tipo contenedor: ventana*/
        frame.setSize(500, 500);
        frame.setVisible(true);

        /*crear un boton*/
        JButton miBoton= new JButton("Mi primer boton");
        /*agregar un boton a la ventana*/
        frame.add(miBoton);
        /*instanciar un obejto de Jlabel*/
        JLabel milabel=new JLabel("Bienvenido");
        /*agregar un label a la ventana*/
        frame.add(milabel);

        /*crear más botones*/
        JButton miBoton1 = new JButton("Mi primer boton");
        JButton miBoton2= new JButton("Mi segundo boton");
        JButton miBoton3 = new JButton("Mi tercer boton");
        JButton miBoton4 = new JButton("Mi cuarto boton");

        /*BorderLayaout*/
        frame.add(miBoton1, BorderLayout.NORTH);
        frame.add(miBoton2, BorderLayout.SOUTH);
        frame.add(miBoton3, BorderLayout.EAST);
        frame.add(miBoton4, BorderLayout.WEST);



        /*hacer visible la pantalla*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}