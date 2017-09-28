
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author castrorj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modelo.Conection conn = new Modelo.Conection();
        conn.conexion();
        Vista.LogIn li = new Vista.LogIn();
        li.setLocationRelativeTo(null);
        li.setVisible(true);

    }
    
}
