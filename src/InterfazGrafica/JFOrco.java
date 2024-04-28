package InterfazGrafica;
import AbstractVideoJuego.AFuria;
import AbstractVideoJuego.HOrco;
import AbstractVideoJuego.PFaccion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
public class JFOrco extends javax.swing.JFrame {
    HOrco orco = new HOrco(200,90);
    public JFOrco() {
        initComponents();
        setLocationRelativeTo(null);   
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/R.png")).getImage());
        ImageIcon img = new ImageIcon ("/Imagenes/R.png");
        
       // orco = new HOrco(200, 90);
        lblNombre.setText(orco.nombre());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOtraRaza = new javax.swing.JButton();
        btnAtaca = new javax.swing.JButton();
        btnConstruir = new javax.swing.JButton();
        btnAumenta = new javax.swing.JButton();
        btnVerVida = new javax.swing.JButton();
        lblOrco = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtAtaca = new javax.swing.JTextField();
        txtConstruye = new javax.swing.JTextField();
        txtAumenta = new javax.swing.JTextField();
        txtVida = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORCOS");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOtraRaza.setText("Selccionar otra Faccion");
        btnOtraRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtraRazaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOtraRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 236, 277, -1));

        btnAtaca.setText("Ataca");
        btnAtaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 52, 139, -1));

        btnConstruir.setText("Construir");
        btnConstruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstruirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConstruir, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 98, 139, -1));

        btnAumenta.setText("Aumentar el Daño");
        btnAumenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAumenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 144, -1, -1));

        btnVerVida.setText("Ver vida");
        btnVerVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 190, 139, -1));

        lblOrco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mogulkan1.jpg"))); // NOI18N
        getContentPane().add(lblOrco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblNombre.setText("Nombre del Personaje");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 6, 143, 28));
        getContentPane().add(txtAtaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 52, 277, -1));
        getContentPane().add(txtConstruye, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 98, 277, -1));
        getContentPane().add(txtAumenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 144, 277, -1));
        getContentPane().add(txtVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 190, 277, -1));

        btnLimpiar.setText("Restablecer");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 236, 139, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtraRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtraRazaActionPerformed
        MainGrafica frame=new MainGrafica();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOtraRazaActionPerformed

    private void btnAtacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacaActionPerformed
        orco.ataca();
        String result = "El ataque es de " + orco.danoo + " de daño Fisico";
        txtAtaca.setText(result);
    }//GEN-LAST:event_btnAtacaActionPerformed

    private void btnConstruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruirActionPerformed
        orco.construye();
        String result = "Construye una choza";
        txtConstruye.setText(result);
    }//GEN-LAST:event_btnConstruirActionPerformed

    private void btnAumentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentaActionPerformed
        orco.aumentaElDano();
        String result = "Aumenta su daño en: " + orco.danoo;
        txtAumenta.setText(result);
    }//GEN-LAST:event_btnAumentaActionPerformed

    private void btnVerVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVidaActionPerformed
        orco.vida();
        String result = "vida del orco es: " + orco.vidao;
        txtVida.setText(result);
    }//GEN-LAST:event_btnVerVidaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtAtaca.setText("");
        txtConstruye.setText("");
        txtAumenta.setText("");
        txtVida.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFOrco().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaca;
    private javax.swing.JButton btnAumenta;
    private javax.swing.JButton btnConstruir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOtraRaza;
    private javax.swing.JButton btnVerVida;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOrco;
    private javax.swing.JTextField txtAtaca;
    private javax.swing.JTextField txtAumenta;
    private javax.swing.JTextField txtConstruye;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
