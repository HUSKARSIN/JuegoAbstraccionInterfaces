package InterfazGrafica;
import AbstractVideoJuego.HHumano;
import AbstractVideoJuego.HNoMuerto;
import AbstractVideoJuego.HOrco;
import javax.swing.ImageIcon;
public class Batalla extends javax.swing.JFrame {
    private HHumano humano = new HHumano(100, 40);
    private HNoMuerto muerto = new HNoMuerto(75,30);
    private HOrco orco = new HOrco(200,90);
    public Batalla() {
        initComponents();
        setLocationRelativeTo(null);
        lblNombre.setText(humano.nombre());
        lblNombre1.setText(orco.nombre());
        lblNombre2.setText(muerto.nombre());
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/R.png")).getImage());
        ImageIcon img = new ImageIcon ("/Imagenes/R.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtaca = new javax.swing.JButton();
        btnConstruir = new javax.swing.JButton();
        btnEscudo = new javax.swing.JButton();
        btnVerVida = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtVida = new javax.swing.JTextField();
        txtAtaca = new javax.swing.JTextField();
        txtConstruye = new javax.swing.JTextField();
        txtEscudo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAtaca1 = new javax.swing.JButton();
        btnConstruir1 = new javax.swing.JButton();
        btnAumenta = new javax.swing.JButton();
        btnVerVida1 = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        txtAtaca1 = new javax.swing.JTextField();
        txtConstruye1 = new javax.swing.JTextField();
        txtAumento = new javax.swing.JTextField();
        txtVida1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAtaca2 = new javax.swing.JButton();
        btnConstruir2 = new javax.swing.JButton();
        btnRobo = new javax.swing.JButton();
        btnVerVida2 = new javax.swing.JButton();
        lblNombre2 = new javax.swing.JLabel();
        txtAtaca2 = new javax.swing.JTextField();
        txtConstruye2 = new javax.swing.JTextField();
        txtRobo = new javax.swing.JTextField();
        txtVida2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnOtraRaza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAtaca.setText("Ataca");
        btnAtaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacaActionPerformed(evt);
            }
        });

        btnConstruir.setText("Construir");
        btnConstruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstruirActionPerformed(evt);
            }
        });

        btnEscudo.setText("Usar escudo");
        btnEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscudoActionPerformed(evt);
            }
        });

        btnVerVida.setText("Ver vida");
        btnVerVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVidaActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre del Personaje");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caballero.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVerVida, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAtaca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConstruir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEscudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConstruye, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAtaca, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtaca)
                            .addComponent(txtAtaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConstruye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConstruir)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEscudo)
                                    .addComponent(txtEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerVida)
                            .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAtaca1.setText("Ataca");
        btnAtaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaca1ActionPerformed(evt);
            }
        });

        btnConstruir1.setText("Construir");
        btnConstruir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstruir1ActionPerformed(evt);
            }
        });

        btnAumenta.setText("Aumentar el Daño");
        btnAumenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentaActionPerformed(evt);
            }
        });

        btnVerVida1.setText("Ver vida");
        btnVerVida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVida1ActionPerformed(evt);
            }
        });

        lblNombre1.setText("Nombre del Personaje");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/peon.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnConstruir1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConstruye1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAtaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAtaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnVerVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAumenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAumento, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtaca1)
                            .addComponent(txtAtaca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConstruye1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConstruir1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAumenta)
                            .addComponent(txtAumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerVida1)))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAtaca2.setText("Ataca");
        btnAtaca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaca2ActionPerformed(evt);
            }
        });

        btnConstruir2.setText("Construir");
        btnConstruir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstruir2ActionPerformed(evt);
            }
        });

        btnRobo.setText("Robo de Vida");
        btnRobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoboActionPerformed(evt);
            }
        });

        btnVerVida2.setText("Ver vida");
        btnVerVida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVida2ActionPerformed(evt);
            }
        });

        lblNombre2.setText("Nombre del Personaje");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/creep.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAtaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAtaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnConstruir2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConstruye2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnRobo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRobo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnVerVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVida2)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(329, 329, 329))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtaca2)
                            .addComponent(txtAtaca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConstruir2)
                            .addComponent(txtConstruye2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRobo)
                            .addComponent(txtRobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerVida2)
                            .addComponent(txtVida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
        );

        btnLimpiar.setText("Restablecer");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnOtraRaza.setText("Selccionar otra Faccion");
        btnOtraRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtraRazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOtraRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOtraRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //botones humano
    
    private void btnAtacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacaActionPerformed
        humano.ataca();
        String resultado = "El ataque es de " + humano.danoh + " de daño Fisico";
        txtAtaca.setText(resultado);
        muerto.vidan -= humano.danoh; 
        String resultado2 = "vida del mago es: " + muerto.vidan;
        txtVida2.setText(resultado2);
        orco.vidao -= humano.danoh; 
        String resultado3 = "vida del orco es: " + orco.vidao;
        txtVida1.setText(resultado3);
        // muestra el daño del humano
        /*humano.ataca();
        String result = "El ataque es de " + humano.danoh + " de daño Fisico";
        txtAtaca.setText(result);*/
    }//GEN-LAST:event_btnAtacaActionPerformed

    private void btnConstruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruirActionPerformed
        humano.construye();
        String result = "Construye una Barraca";
        txtConstruye.setText(result);
    }//GEN-LAST:event_btnConstruirActionPerformed

    private void btnEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscudoActionPerformed
        humano.protege();
        String result = "Optine un escudo de " + humano.vidah+" puntos";
        txtEscudo.setText(result);
    }//GEN-LAST:event_btnEscudoActionPerformed

    private void btnVerVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVidaActionPerformed
        humano.vida();
        String result = "vida del soldado es: " + humano.vidah;
        txtVida.setText(result);
    }//GEN-LAST:event_btnVerVidaActionPerformed
    //botones orco
    
    private void btnAtaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaca1ActionPerformed
        orco.ataca();
        String resultado = "El ataque es de " + orco.danoo + " de daño Fisico";
        txtAtaca1.setText(resultado);
        muerto.vidan -= orco.danoo; 
        String resultado2 = "vida del mago es: " + muerto.vidan;
        txtVida2.setText(resultado2);
        humano.vidah -= orco.danoo; 
        String resultado3 = "vida del humano es: " + humano.vidah;
        txtVida.setText(resultado3);
        /*orco.ataca();
        String result = "El ataque es de " + orco.danoo + " de daño Fisico";
        txtAtaca1.setText(result);*/
    }//GEN-LAST:event_btnAtaca1ActionPerformed

    private void btnConstruir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruir1ActionPerformed
        orco.construye();
        String result = "Construye una choza";
        txtConstruye1.setText(result);
    }//GEN-LAST:event_btnConstruir1ActionPerformed

    private void btnAumentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentaActionPerformed
        orco.aumentaElDano();
        String result = "Aumenta su daño en: " + orco.danoo;
        txtAumento.setText(result);
    }//GEN-LAST:event_btnAumentaActionPerformed

    private void btnVerVida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVida1ActionPerformed
        orco.vida();
        String result = "vida del orco es: " + orco.vidao;
        txtVida1.setText(result);
    }//GEN-LAST:event_btnVerVida1ActionPerformed
    //botones muerto
    
    private void btnAtaca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaca2ActionPerformed
        muerto.ataca();
        String resultado = "El ataque es de " + muerto.danon + " de daño Fisico";
        txtAtaca2.setText(resultado);
        orco.vidao -= muerto.danon; 
        String resultado2 = "vida del orco es: " + orco.vidao;
        txtVida1.setText(resultado2);
        humano.vidah -= muerto.danon; 
        String resultado3 = "vida del humano es: " + humano.vidah;
        txtVida.setText(resultado3);
        /*muerto.ataca();
        String result = "El ataque es de " + muerto.danon + " de daño Magico";
        txtAtaca2.setText(result);*/
    }//GEN-LAST:event_btnAtaca2ActionPerformed

    private void btnConstruir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruir2ActionPerformed
        muerto.construye();
        String result = "Construye una cripta";
        txtConstruye2.setText(result);
    }//GEN-LAST:event_btnConstruir2ActionPerformed

    private void btnRoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoboActionPerformed
        muerto.robaVida();
        String result = "Aumenta su vida en: " + muerto.vidan;
        txtRobo.setText(result);
    }//GEN-LAST:event_btnRoboActionPerformed

    private void btnVerVida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVida2ActionPerformed
        muerto.vida();
        String result = "vida del mago es: " + muerto.vidan;
        txtVida2.setText(result);
    }//GEN-LAST:event_btnVerVida2ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtAtaca.setText("");
        txtConstruye.setText("");
        txtRobo.setText("");
        txtVida.setText("");
        txtAtaca1.setText("");
        txtConstruye1.setText("");
        txtAumento.setText("");
        txtVida1.setText("");
        txtAtaca2.setText("");
        txtConstruye2.setText("");
        txtEscudo.setText("");
        txtVida2.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnOtraRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtraRazaActionPerformed
        MainGrafica frame=new MainGrafica();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOtraRazaActionPerformed

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
            java.util.logging.Logger.getLogger(Batalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaca;
    private javax.swing.JButton btnAtaca1;
    private javax.swing.JButton btnAtaca2;
    private javax.swing.JButton btnAumenta;
    private javax.swing.JButton btnConstruir;
    private javax.swing.JButton btnConstruir1;
    private javax.swing.JButton btnConstruir2;
    private javax.swing.JButton btnEscudo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOtraRaza;
    private javax.swing.JButton btnRobo;
    private javax.swing.JButton btnVerVida;
    private javax.swing.JButton btnVerVida1;
    private javax.swing.JButton btnVerVida2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JTextField txtAtaca;
    private javax.swing.JTextField txtAtaca1;
    private javax.swing.JTextField txtAtaca2;
    private javax.swing.JTextField txtAumento;
    private javax.swing.JTextField txtConstruye;
    private javax.swing.JTextField txtConstruye1;
    private javax.swing.JTextField txtConstruye2;
    private javax.swing.JTextField txtEscudo;
    private javax.swing.JTextField txtRobo;
    private javax.swing.JTextField txtVida;
    private javax.swing.JTextField txtVida1;
    private javax.swing.JTextField txtVida2;
    // End of variables declaration//GEN-END:variables
}
