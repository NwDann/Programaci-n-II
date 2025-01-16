/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaCliente;

import Negocio.Agregar;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class JFRegister extends javax.swing.JFrame {
    //ATRIBUTOS
    Agregar agregar;

    
    //CONSTRUCTORES
    public JFRegister() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.agregar = new Agregar();
        
        JTFnombres.setForeground(Color.black);
    }

    
    //METODOS
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        JTFnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        JTFcedula = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        JTFcontrasena = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JLicono2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        JBaceptar = new javax.swing.JButton();
        JBcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("Nombres");

        JTFnombres.setForeground(new java.awt.Color(204, 204, 204));
        JTFnombres.setToolTipText("");
        JTFnombres.setBorder(null);
        JTFnombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFnombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFnombresFocusLost(evt);
            }
        });
        JTFnombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFnombresMousePressed(evt);
            }
        });
        JTFnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFnombresKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("Cedula");

        JTFcedula.setForeground(new java.awt.Color(204, 204, 204));
        JTFcedula.setText("Ej. 1798745269");
        JTFcedula.setToolTipText("");
        JTFcedula.setBorder(null);
        JTFcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFcedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFcedulaFocusLost(evt);
            }
        });
        JTFcedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFcedulaMousePressed(evt);
            }
        });
        JTFcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFcedulaKeyTyped(evt);
            }
        });

        JTFcontrasena.setForeground(new java.awt.Color(204, 204, 204));
        JTFcontrasena.setText("********");
        JTFcontrasena.setToolTipText("");
        JTFcontrasena.setBorder(null);
        JTFcontrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFcontrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFcontrasenaFocusLost(evt);
            }
        });
        JTFcontrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFcontrasenaMousePressed(evt);
            }
        });
        JTFcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFcontrasenaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JTFnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(JTFnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JTFcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(JTFcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 450, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AIRSCAPE");

        JLicono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Registrarse");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(JLicono2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(JLicono2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 180));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        JBaceptar.setBackground(new java.awt.Color(0, 204, 204));
        JBaceptar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBaceptar.setText("ACEPTAR");
        JBaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBaceptarActionPerformed(evt);
            }
        });

        JBcancelar.setBackground(new java.awt.Color(0, 204, 204));
        JBcancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBcancelar.setText("CANCELAR");
        JBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(JBaceptar)
                .addGap(105, 105, 105)
                .addComponent(JBcancelar)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBaceptar)
                    .addComponent(JBcancelar))
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 820, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFnombresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFnombresMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnombresMousePressed

    private void JTFcedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFcedulaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcedulaMousePressed

    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
        JTFnombres.setText("Ingrese nombres");
        JTFcedula.setText("Ej. 1798745269");
        JTFcontrasena.setText("********");
        JTFnombres.setForeground(Color.gray);
        JTFcedula.setForeground(Color.gray);
        JTFcontrasena.setForeground(Color.gray);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_JBcancelarActionPerformed

    private void JBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaceptarActionPerformed
        if(this.JTFcedula.getText().isEmpty() || this.JTFcedula.getText().equals("Ej. 1798745269") ||
                this.JTFcontrasena.getText().isEmpty() || this.JTFcontrasena.getText().equals("********") ||
                this.JTFnombres.getText().isEmpty() || this.JTFnombres.getText().equals("Ingrese nombres")){
            JOptionPane.showMessageDialog(null, "Campos vacios, ingrese datos correctamente");
            
        } else {
            boolean bandera = this.agregar.agregarDato("Cliente", "Clienteid", this.JTFcedula.getText(),
                    this.JTFcedula.getText() + "," + this.JTFnombres.getText() + "," + this.JTFcontrasena.getText());
            
            if(bandera){
                JOptionPane.showMessageDialog(null,"Ingreso exitoso, ponga a prueba sus datos");
                JTFnombres.setText("Ingrese nombres");
                JTFcedula.setText("Ej. 1798745269");
                JTFcontrasena.setText("********");
                JTFnombres.setForeground(Color.gray);
                JTFcedula.setForeground(Color.gray);
                JTFcontrasena.setForeground(Color.gray);
                this.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null,"La cedula no puede repetirse");
                
            }
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JBaceptarActionPerformed

    private void JTFcontrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFcontrasenaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcontrasenaMousePressed

    private void JTFcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFcedulaKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos sin espacios");
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcedulaKeyTyped

    private void JTFnombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFnombresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.JTFcontrasena.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnombresKeyPressed

    private void JTFcontrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFcontrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.JTFcedula.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcontrasenaKeyPressed

    private void JTFnombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFnombresFocusLost
        if(String.valueOf(this.JTFnombres.getText()).isEmpty()){
            JTFnombres.setText("Ingrese nombres");
            JTFnombres.setForeground(Color.gray);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnombresFocusLost

    private void JTFcontrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFcontrasenaFocusLost
        if(String.valueOf(this.JTFcontrasena.getText()).isEmpty()){
            JTFcontrasena.setText("********");
            JTFcontrasena.setForeground(Color.gray);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcontrasenaFocusLost

    private void JTFcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFcedulaFocusLost
        if(String.valueOf(this.JTFcedula.getText()).isEmpty()){
            JTFcedula.setText("Ej. 1798745269");
            JTFcedula.setForeground(Color.gray);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcedulaFocusLost

    private void JTFnombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFnombresFocusGained
        if(String.valueOf(this.JTFnombres.getText()).equals("Ingrese nombres")){
            JTFnombres.setText("");
            JTFnombres.setForeground(Color.black);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnombresFocusGained

    private void JTFcontrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFcontrasenaFocusGained
        if(String.valueOf(this.JTFcontrasena.getText()).equals("********")){
            JTFcontrasena.setText("");
            JTFcontrasena.setForeground(Color.black);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcontrasenaFocusGained

    private void JTFcedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFcedulaFocusGained
        if(String.valueOf(this.JTFcedula.getText()).equals("Ej. 1798745269")){
            JTFcedula.setText("");
            JTFcedula.setForeground(Color.black);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcedulaFocusGained

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
            java.util.logging.Logger.getLogger(JFRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBaceptar;
    private javax.swing.JButton JBcancelar;
    private javax.swing.JLabel JLicono2;
    private javax.swing.JTextField JTFcedula;
    private javax.swing.JTextField JTFcontrasena;
    private javax.swing.JTextField JTFnombres;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
