package interfaz_grafica;

import javax.swing.*;
public class MainVentanaPrincipal {
    public static void main(String[] args) {
      /*
      Desde el main, siempre se debe hacer la llamada a la ventana
      que se quiera abrir, y en general a LOS COMPONENTES QUE LA
      CONFORMAN
      */

        /*Llamar a una ventana. Al instanciar un objeto de la  clase JFrame*/
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        /*Objeto miVentanaPrincipal de la clase VentanaPrincipal*/
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();

        /*
        El contenido que se quiere desplegar en el frame de Jframe es el objeto
         miVentanaPrincipal

         IMPORTANTE-->setContentPane RECIBE COMO VALOR UN OBJETO TIPO CONTENEDOR, como lo es UN PANEL--->el PANEL CONTIENE TODOS LOS ELEMENTOS como botones.
         NO SE DEBE PONER EL OBJETO VENTANA, porque le estariamos mandando un OBJETO TIPO VENTANA
         */

        /*NOTA: rootPanel es un atributo de tipo JPanel privado NO SE PUEDE ACCEDER A ELLA DIRECTAMENTE
        Se necesita de un GET */

        frame.setContentPane(miVentanaPrincipal.getRootPanel());//ahora si estamos mandando un contenedor

        /*
        ADICIONAL:
        si el metodo o funcion main estuviera en la misma clase VentanaPrincipal. NO REQUIERE DE GETTERS
        Por lo tanto, el llamado seria el siguiente:

        JFrame frame = new JFrame("HolaMundo");
        frame.setContentPane(new HolaMundo().rootPanel); --->en esta linea se hacen dos cosas
                                                               1. se crea el objeto de la clase HolaMundo
                                                               2. se le indica el atributo al obejeto tipo ventana el atributo "rootPanel"
        */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);//NO OLVIDAR EL METODO QUE HACE VISIBLE LA VENTANA


    }
}
