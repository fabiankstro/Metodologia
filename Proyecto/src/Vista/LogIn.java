/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ImageIcon;

import Controlador.Controlador;
/**
 *
 * @author castrorj
 */
public class LogIn extends javax.swing.JFrame {

    public static String lang = "", Country = "";
    Controlador controlador = new Controlador();
    /**
     * Creates new form LogIn
     */
    public LogIn() {
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

        lbl_User = new javax.swing.JLabel();
        lbl_User1 = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JPasswordField();
        btn_LogIn = new javax.swing.JButton();
        lbl_Logo = new javax.swing.JLabel();
        txt_User = new javax.swing.JFormattedTextField();
        bnt_forgot = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Men_Language = new javax.swing.JMenu();
        Men_English = new javax.swing.JMenuItem();
        Men_Spanish = new javax.swing.JMenuItem();
        Men_Italian = new javax.swing.JMenuItem();
        Men_French = new javax.swing.JMenuItem();
        Men_Add = new javax.swing.JMenuItem();
        Men_Remove = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/man-user.png"))); // NOI18N

        lbl_User1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key-silhouette-security-tool-interface-symbol-of-password.png"))); // NOI18N

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

        try {
            txt_User.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_User.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        bnt_forgot.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        bnt_forgot.setForeground(new java.awt.Color(51, 51, 255));
        bnt_forgot.setText("Forgot your password?");
        bnt_forgot.setBorder(null);
        bnt_forgot.setBorderPainted(false);
        bnt_forgot.setContentAreaFilled(false);
        bnt_forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_forgotActionPerformed(evt);
            }
        });

        Men_Language.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/translate.png"))); // NOI18N

        Men_English.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/united-states.png"))); // NOI18N
        Men_English.setText("English");
        Men_English.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Men_EnglishActionPerformed(evt);
            }
        });
        Men_Language.add(Men_English);

        Men_Spanish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/spain.png"))); // NOI18N
        Men_Spanish.setText("Español");
        Men_Spanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Men_SpanishActionPerformed(evt);
            }
        });
        Men_Language.add(Men_Spanish);

        Men_Italian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/italy.png"))); // NOI18N
        Men_Italian.setText("Italiano");
        Men_Italian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Men_ItalianActionPerformed(evt);
            }
        });
        Men_Language.add(Men_Italian);

        Men_French.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/france.png"))); // NOI18N
        Men_French.setText("Français");
        Men_French.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Men_FrenchActionPerformed(evt);
            }
        });
        Men_Language.add(Men_French);

        Men_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        Men_Add.setText("Add");
        Men_Language.add(Men_Add);

        Men_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minus-sign-inside-a-black-circle.png"))); // NOI18N
        Men_Remove.setText("Remove");
        Men_Language.add(Men_Remove);

        jMenuBar1.add(Men_Language);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_Logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bnt_forgot)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_User1)
                            .addComponent(lbl_User))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(txt_User)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_LogIn)
                        .addGap(98, 98, 98)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Logo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_User))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_User1)
                    .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnt_forgot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_LogIn)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PassActionPerformed

    private void Men_FrenchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Men_FrenchActionPerformed
        // TODO add your handling code here:
        lang = "fr";
        Country = "FR";
    }//GEN-LAST:event_Men_FrenchActionPerformed

    private void btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogInActionPerformed
        // TODO add your handling code here:
        controlador.LogIn(txt_User, txt_Pass);
    }//GEN-LAST:event_btn_LogInActionPerformed

    private void Men_EnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Men_EnglishActionPerformed
        // TODO add your handling code here:
        lang = "en";
        Country = "US";
    }//GEN-LAST:event_Men_EnglishActionPerformed

    private void Men_SpanishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Men_SpanishActionPerformed
        // TODO add your handling code here:
        lang = "es";
        Country = "CR";
    }//GEN-LAST:event_Men_SpanishActionPerformed

    private void Men_ItalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Men_ItalianActionPerformed
        // TODO add your handling code here:
        lang = "it";
        Country = "IT";
    }//GEN-LAST:event_Men_ItalianActionPerformed

    private void bnt_forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_forgotActionPerformed
        // TODO add your handling code here:
        RecoveryPass rp = new RecoveryPass();
        rp.setLocationRelativeTo(null);
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnt_forgotActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Men_Add;
    private javax.swing.JMenuItem Men_English;
    private javax.swing.JMenuItem Men_French;
    private javax.swing.JMenuItem Men_Italian;
    private javax.swing.JMenu Men_Language;
    private javax.swing.JMenuItem Men_Remove;
    private javax.swing.JMenuItem Men_Spanish;
    private javax.swing.JButton bnt_forgot;
    private javax.swing.JButton btn_LogIn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JLabel lbl_User1;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JFormattedTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
