package Ventana_inputs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Ventana_inputs {
    private JButton button1;
    private JTextField txtNombre;
    private JPasswordField txtpassword;
    private JTextField txtUsuario;
    private JCheckBox chkPassword;
    private JButton btnIngresar;
    private JButton clicButton;
    private JPanel rootPanel;

    public Ventana_inputs() {
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String password= Arrays.toString(txtpassword.getPassword());//LE ESTOY mandando un char, pero necesito convertirlo a string
                if(usuario=="bri" && password=="123"){
                    JOptionPane.showMessageDialog(null,"Usuario Identificado");
                }else{
                    JOptionPane.showMessageDialog(null, "Error en usuario y clave");
                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
