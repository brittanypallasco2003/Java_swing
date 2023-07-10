package interfaz_grafica;

import javax.swing.*;
import java.awt.event.*;

public class VentanaSecundaria extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JButton btnatacarMiPokemon;
    private JButton btnatacarRivalPokemon;
    private JLabel labelVidaMiPoke;
    private JLabel labelVidaRivalPokemon;
    private JLabel vidaRestMiPokemon;
    private JLabel vidaRestRivalPokemon;

    public VentanaSecundaria() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        //INSTANCIAR OBJETOS DE LA CLASE POKEMON
        Pokemon miPokemon= new Pokemon(10,100);
       Pokemon miRivalPokemon = new Pokemon(10,100);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        //BOTON ATACAR
        btnatacarMiPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            miPokemon.atacar(miRivalPokemon);
            vidaRestRivalPokemon.setText(String.valueOf(miRivalPokemon.getVida()));
            if(miPokemon.getVida()<=0){
                JOptionPane.showMessageDialog(null," YOU GAME OVER");
            }

            }
        });
        btnatacarRivalPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miRivalPokemon.atacar(miPokemon); //se envia como parametro el objeto MiPokemon
                vidaRestMiPokemon.setText(String.valueOf(miPokemon.getVida()));
            if(miRivalPokemon.getVida()<=0){
                JOptionPane.showMessageDialog(null, " YOU WIN");
            }
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }
   private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
