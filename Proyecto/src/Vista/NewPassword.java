/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Controlador.Controlador;

/**
 *
 * @author castrorj
 */
public class NewPassword extends javax.swing.JFrame {

    public static String lang = "", Country = "";
    Controlador controlador = new Controlador();
    /**
     * Creates new form LogIn
     */
    public NewPassword() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Pass = new javax.swing.JPasswordField();
        btn_LogIn = new javax.swing.JButton();
        lbl_Logo = new javax.swing.JLabel();
        bnt_forgot = new javax.swing.JButton();
        txt_Pass1 = new javax.swing.JPasswordField();
        lbl_Key = new javax.swing.JLabel();
        lbl_Key1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 230));

        txt_Pass.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        txt_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PassActionPerformed(evt);
            }
        });

        btn_LogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-login-button.png"))); // NOI18N
        btn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogInActionPerformed(evt);
            }
        });

        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Teradyne.png"))); // NOI18N

        bnt_forgot.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        bnt_forgot.setText("Enter your new password and confirm it");
        bnt_forgot.setBorder(null);
        bnt_forgot.setBorderPainted(false);
        bnt_forgot.setContentAreaFilled(false);

        txt_Pass1.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        txt_Pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Pass1ActionPerformed(evt);
            }
        });

        lbl_Key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key-silhouette-security-tool-interface-symbol-of-password.png"))); // NOI18N

        lbl_Key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key-silhouette-security-tool-interface-symbol-of-password.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_Logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btn_LogIn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Key1)
                            .addComponent(lbl_Key))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(bnt_forgot)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnt_forgot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_Key)
                    .addComponent(txt_Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_LogIn))
                    .addComponent(lbl_Key1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PassActionPerformed

    private void btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogInActionPerformed
        // TODO add your handling code here:
        if (txt_Pass.getPassword().length != 0 && txt_Pass1.getPassword().length != 0){
            if (txt_Pass.getPassword().equals(txt_Pass1.getPassword())){
                controlador.NewPassword(RecoveryPass.id, txt_Pass);
            }
            else {
                JOptionPane.showMessageDialog(null, "Password do not match", "New Password", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please, fill all the fields", "New Password", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_LogInActionPerformed

    private void txt_Pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Pass1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_forgot;
    private javax.swing.JButton btn_LogIn;
    private javax.swing.JLabel lbl_Key;
    private javax.swing.JLabel lbl_Key1;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JPasswordField txt_Pass1;
    // End of variables declaration//GEN-END:variables
}