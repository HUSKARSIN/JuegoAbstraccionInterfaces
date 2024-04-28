package InterfazGrafica;
import AbstractVideoJuego.HNoMuerto;
import javax.swing.ImageIcon;
public class JFNoMuerto extends javax.swing.JFrame {
    private HNoMuerto muerto = new HNoMuerto(75,30);
    public JFNoMuerto() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/R.png")).getImage());
        ImageIcon img = new ImageIcon ("/Imagenes/R.png");
        
        //muerto = new HNoMuerto(200, 90);
        lblNombre.setText(muerto.nombre());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtaca = new javax.swing.JButton();
        btnConstruir = new javax.swing.JButton();
        btnRobo = new javax.swing.JButton();
        btnVerVida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnOtraRaza1 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtAtaca = new javax.swing.JTextField();
        txtConstruye = new javax.swing.JTextField();
        txtRobo = new javax.swing.JTextField();
        txtVida = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NO MUERTOS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtaca.setText("Ataca");
        btnAtaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 139, -1));

        btnConstruir.setText("Construir");
        btnConstruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstruirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConstruir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 139, -1));

        btnRobo.setText("Robo de Vida");
        btnRobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoboActionPerformed(evt);
            }
        });
        getContentPane().add(btnRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 139, -1));

        btnVerVida.setText("Ver vida");
        btnVerVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 139, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lich1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnOtraRaza1.setText("Selccionar otra Faccion");
        btnOtraRaza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtraRaza1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOtraRaza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 327, -1));

        lblNombre.setText("Nombre del Personaje");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 143, 28));
        getContentPane().add(txtAtaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 327, -1));
        getContentPane().add(txtConstruye, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 327, -1));
        getContentPane().add(txtRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 327, -1));
        getContentPane().add(txtVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 327, -1));

        btnLimpiar.setText("Restablecer");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 139, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacaActionPerformed
        muerto.ataca();
        String result = "El ataque es de " + muerto.danon + " de daño Magico";
        txtAtaca.setText(result);
    }//GEN-LAST:event_btnAtacaActionPerformed

    private void btnConstruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruirActionPerformed
        muerto.construye();
        String result = "Construye una cripta";
        txtConstruye.setText(result);
    }//GEN-LAST:event_btnConstruirActionPerformed

    private void btnOtraRaza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtraRaza1ActionPerformed
        MainGrafica frame=new MainGrafica();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOtraRaza1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtAtaca.setText("");
        txtConstruye.setText("");
        txtRobo.setText("");
        txtVida.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoboActionPerformed
        muerto.robaVida();
        String result = "Aumenta su vida en: " + muerto.vidan;
        txtRobo.setText(result);
    }//GEN-LAST:event_btnRoboActionPerformed

    private void btnVerVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVidaActionPerformed
        muerto.vida();
        String result = "vida del mago es: " + muerto.vidan;
        txtVida.setText(result);
    }//GEN-LAST:event_btnVerVidaActionPerformed

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
            java.util.logging.Logger.getLogger(JFNoMuerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFNoMuerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFNoMuerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFNoMuerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFNoMuerto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaca;
    private javax.swing.JButton btnConstruir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOtraRaza1;
    private javax.swing.JButton btnRobo;
    private javax.swing.JButton btnVerVida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAtaca;
    private javax.swing.JTextField txtConstruye;
    private javax.swing.JTextField txtRobo;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
