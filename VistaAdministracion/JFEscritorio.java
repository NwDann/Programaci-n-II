/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaAdministracion;

import Negocio.Icono;

public class JFEscritorio extends javax.swing.JFrame {
    //ATRIBUTOS
    Icono i;
    
    
    //CONSTRUCTORES
    public JFEscritorio() {
        //INICIALIZAR OBJETOS
        initComponents();
        this.setLocationRelativeTo(this);
        this.i = new Icono();
        
        //OPERACIONES SECUNDARIAS
        this.i.setImageLabel(JLicono, "src//main//java//Imagenes//IconoPrincipal.png");
        this.i.setImageLabel(JLcliente, "src//main//java//Imagenes//usuario.png");
        this.i.setImageLabel(JLvuelo, "src//main//java//Imagenes//recorrido.png");
        this.i.setImageLabel(JLasiento, "src//main//java//Imagenes//asiento.png");
        this.i.setImageLabel(JLsalir, "src//main//java//Imagenes//salida.png");
        this.i.setImageLabel(JLvueloBoleto, "src//main//java//Imagenes//vuelo.png");
        this.repaint();
    }
    
    //METODOS
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JLicono = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JPanelOpciones = new javax.swing.JPanel();
        JLcliente = new javax.swing.JLabel();
        JLasiento = new javax.swing.JLabel();
        JLvuelo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLsalir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JLvueloBoleto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escritorio");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AIRSCAPE");

        JLicono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MENU");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 180));

        JPanelOpciones.setBackground(new java.awt.Color(204, 255, 255));

        JLcliente.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        JLcliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLcliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JLcliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLclienteMouseClicked(evt);
            }
        });

        JLasiento.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        JLasiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLasiento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JLasiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLasiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLasientoMouseClicked(evt);
            }
        });

        JLvuelo.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        JLvuelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLvuelo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JLvuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLvuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLvueloMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECORRIDO");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AVION-ASIENTO");

        JLsalir.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        JLsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLsalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JLsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLsalirMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALIR");

        JLvueloBoleto.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        JLvueloBoleto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLvueloBoleto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JLvueloBoleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLvueloBoleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLvueloBoletoMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VUELO-BOLETO");

        javax.swing.GroupLayout JPanelOpcionesLayout = new javax.swing.GroupLayout(JPanelOpciones);
        JPanelOpciones.setLayout(JPanelOpcionesLayout);
        JPanelOpcionesLayout.setHorizontalGroup(
            JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelOpcionesLayout.createSequentialGroup()
                .addGroup(JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelOpcionesLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(jLabel5))
                    .addGroup(JPanelOpcionesLayout.createSequentialGroup()
                        .addGroup(JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelOpcionesLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(JLcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(JLvuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelOpcionesLayout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(JLsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelOpcionesLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelOpcionesLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JLvueloBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPanelOpcionesLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(JLasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPanelOpcionesLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        JPanelOpcionesLayout.setVerticalGroup(
            JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelOpcionesLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLvuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLvueloBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(JPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17))
        );

        getContentPane().add(JPanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 850, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLclienteMouseClicked
        JFCliente cliente = new JFCliente();
        cliente.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_JLclienteMouseClicked

    private void JLvueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLvueloMouseClicked
        JFRecorrido vuelo = new JFRecorrido();
        vuelo.setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_JLvueloMouseClicked

    private void JLasientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLasientoMouseClicked
        JFAvion_Asiento asiento = new JFAvion_Asiento();
        asiento.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_JLasientoMouseClicked

    private void JLsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLsalirMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_JLsalirMouseClicked

    private void JLvueloBoletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLvueloBoletoMouseClicked
        JFVuelo_Boleto vb = new JFVuelo_Boleto();
        vb.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_JLvueloBoletoMouseClicked

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
            java.util.logging.Logger.getLogger(JFEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLasiento;
    private javax.swing.JLabel JLcliente;
    private javax.swing.JLabel JLicono;
    private javax.swing.JLabel JLsalir;
    private javax.swing.JLabel JLvuelo;
    private javax.swing.JLabel JLvueloBoleto;
    private javax.swing.JPanel JPanelOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelTitulo;
    // End of variables declaration//GEN-END:variables
}
