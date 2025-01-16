package VistaAdministracion;

import Negocio.Icono;
import VistaCliente.JFEscritorioCliente;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class JFLoginAdministracion extends javax.swing.JFrame {
    //ATRIBUTOS
    Icono i;
    
    
    //CONSTRUCTORES
    public JFLoginAdministracion() {
        //INICIALIZAR OBJETOS
        initComponents();
        this.setLocationRelativeTo(this);
        this.i = new Icono();
        this.JTFusuario.setForeground(Color.black);
        
        //OPERACIONES SECUNDARIAS
        this.i.setImageLabel(JLicono, "src//main//java//Imagenes//IconoPrincipal.png");
        this.repaint();
    }
    
    
    //METODOS
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTFusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JPFcontrasena = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jBAceptar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JLicono = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JBcliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Usuario");

        JTFusuario.setForeground(new java.awt.Color(204, 204, 204));
        JTFusuario.setToolTipText("");
        JTFusuario.setBorder(null);
        JTFusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFusuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFusuarioFocusLost(evt);
            }
        });
        JTFusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFusuarioMousePressed(evt);
            }
        });
        JTFusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFusuarioKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        JPFcontrasena.setForeground(new java.awt.Color(204, 204, 204));
        JPFcontrasena.setText("********");
        JPFcontrasena.setBorder(null);
        JPFcontrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JPFcontrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JPFcontrasenaFocusLost(evt);
            }
        });
        JPFcontrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPFcontrasenaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPFcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(JTFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JPFcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 380, 240));

        jBAceptar.setBackground(new java.awt.Color(0, 204, 204));
        jBAceptar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBAceptar.setText("ACEPTAR");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 150, -1));

        jBSalir.setBackground(new java.awt.Color(0, 204, 204));
        jBSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 130, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AIRSCAPE");

        JLicono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Administracion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 180));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        JBcliente.setBackground(new java.awt.Color(0, 204, 204));
        JBcliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBcliente.setText("INGRESAR COMO CLIENTE");
        JBcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(JBcliente)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(JBcliente)
                .addGap(87, 87, 87))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 900, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        if (this.JTFusuario.getText().equals("root") && (Arrays.equals(this.JPFcontrasena.getPassword(), new char[]{'g','r','u','p','o','3','i','j','p','r'}))) {
            JOptionPane.showMessageDialog(null, "Conexion exitosa ");
            this.setVisible(false);
            JFEscritorio escritorio = new JFEscritorio();
            escritorio.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexion con la base de datos");
        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void JTFusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFusuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuarioMousePressed

    private void JPFcontrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPFcontrasenaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPFcontrasenaMousePressed

    private void JBclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBclienteActionPerformed
        JFEscritorioCliente u = new JFEscritorioCliente();
        u.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_JBclienteActionPerformed

    private void JTFusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFusuarioFocusLost
        if(String.valueOf(this.JTFusuario.getText()).isEmpty()){
            JTFusuario.setText("Usuario aqui");
            JTFusuario.setForeground(Color.gray);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuarioFocusLost

    private void JPFcontrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPFcontrasenaFocusLost
        if(String.valueOf(this.JPFcontrasena.getPassword()).isEmpty()){
            JPFcontrasena.setText("********");
            JPFcontrasena.setForeground(Color.gray);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JPFcontrasenaFocusLost

    private void JTFusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFusuarioFocusGained
        if(String.valueOf(this.JTFusuario.getText()).equals("Usuario aqui")){
            JTFusuario.setText("");
            JTFusuario.setForeground(Color.black);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuarioFocusGained

    private void JPFcontrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPFcontrasenaFocusGained
        if(String.valueOf(this.JPFcontrasena.getPassword()).equals("********")){
            JPFcontrasena.setText("");
            JPFcontrasena.setForeground(Color.black);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JPFcontrasenaFocusGained

    private void JTFusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFusuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.JPFcontrasena.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuarioKeyPressed

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
            java.util.logging.Logger.getLogger(JFLoginAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLoginAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLoginAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLoginAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLoginAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcliente;
    private javax.swing.JLabel JLicono;
    private javax.swing.JPasswordField JPFcontrasena;
    private javax.swing.JTextField JTFusuario;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
