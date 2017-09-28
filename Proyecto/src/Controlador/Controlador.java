
package Controlador;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import Modelo.Conection;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author bberc
 */
public class Controlador {
    Conection conection = new Conection();
    public void LogIn (JFormattedTextField txt_user, JPasswordField txt_Pass){
        if (txt_user.getText().length() != 0 && txt_Pass.getPassword().length != 0) {
            /*Code to stored procedure here*/
            txt_user.setText("");
            txt_Pass.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Please, fill all the boxes","LogIn",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean SecurityQuestion (JTextField txt_User, JComboBox cmb_Question, JTextField txt_Answer){
        /*if (Comparacion pregunta y respuesta con el id del empleado con base de datos){
            return true;
        }
        */
        return false;
    }
    
    public void NewPassword (String id, JPasswordField txt_Pass){
        /*Se hace un update en la base de datos para el empleado con el id, se cambia la contrasena por la recibida*/
    }
    
    public void BackLogIn (JFrame frame){
        Vista.LogIn li = new Vista.LogIn();
        li.setLocationRelativeTo(null);
        li.setVisible(true);
        frame.dispose();
    }
}