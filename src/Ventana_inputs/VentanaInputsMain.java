package Ventana_inputs;

import javax.swing.*;

public class VentanaInputsMain {

    public static void main(String[] args) {
        /*
      Desde el main, siempre se debe hacer la llamada a la ventana
      que se quiera abrir, y en general a LOS COMPONENTES QUE LA
      CONFORMAN
      */

        /*Llamar a una ventana. Al instanciar un objeto de la  clase JFrame*/
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        frame.setContentPane(new Ventana_inputs().getRootPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);//NO OLVIDAR EL METODO QUE HACE VISIBLE LA VENTANA
    }
}
