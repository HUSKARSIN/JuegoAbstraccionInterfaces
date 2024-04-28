package InterfazGrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import AbstractVideoJuego.HHumano;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JFHumano extends javax.swing.JFrame {
    private HHumano humano = new HHumano(100, 40);
    public JFHumano() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/R.png")).getImage());
        ImageIcon img = new ImageIcon ("/Imagenes/R.png");
        //humano = new HHumano(200, 90);
        lblNombre.setText(humano.nombre());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOtraRaza = new javax.swing.JButton();
        btnAtaca = new javax.swing.JButton();
        btnConstruir = new javax.swing.JButton();
        lblataca = new javax.swing.JLabel();
        btnEscudo = new javax.swing.JButton();
        btnVerVida = new javax.swing.JButton();
        ImgSoldado = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtVida = new javax.swing.JTextField();
        txtAtaca = new javax.swing.JTextField();
        txtConstruye = new javax.swing.JTextField();
        txtRobo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HUMANOS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOtraRaza.setText("Selccionar otra Faccion");
        btnOtraRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtraRazaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOtraRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 280, -1));

        btnAtaca.setText("Ataca");
        btnAtaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 139, -1));

        btnConstruir.setText("Construir");
        btnConstruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstruirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConstruir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 139, -1));
        getContentPane().add(lblataca, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 136, 182, -1));

        btnEscudo.setText("Usar escudo");
        btnEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscudoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 139, -1));

        btnVerVida.setText("Ver vida");
        btnVerVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 139, -1));

        ImgSoldado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Soldado1.jpg"))); // NOI18N
        getContentPane().add(ImgSoldado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnLimpiar.setText("Restablecer");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 139, -1));

        lblNombre.setText("Nombre del Personaje");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 143, 28));
        getContentPane().add(txtVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 280, -1));
        getContentPane().add(txtAtaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 280, -1));
        getContentPane().add(txtConstruye, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 280, -1));
        getContentPane().add(txtRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtraRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtraRazaActionPerformed
        MainGrafica frame=new MainGrafica();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOtraRazaActionPerformed

    private void btnConstruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruirActionPerformed
        humano.construye();
        String result = "Construye una Barraca";
        txtConstruye.setText(result);
    }//GEN-LAST:event_btnConstruirActionPerformed

    private void btnAtacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacaActionPerformed
        humano.ataca();
        String result = "El ataque es de " + humano.danoh + " de daño Fisico";
        txtAtaca.setText(result);
    }//GEN-LAST:event_btnAtacaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtAtaca.setText("");
        txtConstruye.setText("");
        txtRobo.setText("");
        txtVida.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscudoActionPerformed
        humano.protege();
        String result = "Optine un escudo de " + humano.vidah+" puntos";
        txtRobo.setText(result);
    }//GEN-LAST:event_btnEscudoActionPerformed

    private void btnVerVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVidaActionPerformed
        humano.vida();
        String result = "vida del soldado es: " + humano.vidah;
        txtVida.setText(result);
    }//GEN-LAST:event_btnVerVidaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFHumano().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgSoldado;
    private javax.swing.JButton btnAtaca;
    private javax.swing.JButton btnConstruir;
    private javax.swing.JButton btnEscudo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOtraRaza;
    private javax.swing.JButton btnVerVida;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblataca;
    private javax.swing.JTextField txtAtaca;
    private javax.swing.JTextField txtConstruye;
    private javax.swing.JTextField txtRobo;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
