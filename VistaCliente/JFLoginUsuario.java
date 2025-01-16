/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaCliente;

import Negocio.DatosGenerales;
import Negocio.Icono;
import Negocio.Leer;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class JFLoginUsuario extends javax.swing.JFrame {
    //ATRIBUTOS
    JFRegister re;
    JFEscritorioCliente escritorioCliente;
    Icono i;
    Leer leer;

    
    //CONSTRUCTORES
    public JFLoginUsuario(JFEscritorioCliente e) {
        //INICIALIZAR OBJETOS
        initComponents();
        this.setLocationRelativeTo(this);
        this.i = new Icono();
        this.leer = new Leer();
        this.escritorioCliente = e;
        this.JTFcedula.setForeground(Color.black);
        
        //OPERACIONES SECUNDARIAS
        this.i.setImageLabel(JLicono, "src//main//java//Imagenes//IconoPrincipal.png");
        this.repaint();
    }
    
    
    public JFLoginUsuario(){
        //INICIALIZAR OBJETOS
        initComponents();
        this.setLocationRelativeTo(this);
        JTFcedula.setForeground(Color.black);
        this.i = new Icono();
        this.leer = new Leer();
        
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
        jLabel2 = new javax.swing.JLabel();
        JTFcedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JPFcontrasena = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jBSalir = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JLregistrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JLicono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Cedula");

        JTFcedula.setForeground(new java.awt.Color(204, 204, 204));
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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFcedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFcedulaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("Contraseña");

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
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPFcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JTFcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
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

        jBSalir.setBackground(new java.awt.Color(0, 204, 204));
        jBSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBSalir.setText("CANCELAR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 150, -1));

        jBAceptar.setBackground(new java.awt.Color(0, 204, 204));
        jBAceptar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBAceptar.setText("ACEPTAR");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 150, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("No tienes una cuenta?");

        JLregistrar.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        JLregistrar.setForeground(new java.awt.Color(51, 0, 255));
        JLregistrar.setText("Registrate");
        JLregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLregistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLregistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(JLregistrar)
                .addContainerGap(556, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JLregistrar))
                .addGap(64, 64, 64))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 900, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AIRSCAPE");

        JLicono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Para Usuarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFcedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFcedulaMousePressed
    }//GEN-LAST:event_JTFcedulaMousePressed

    private void JPFcontrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPFcontrasenaMousePressed
    }//GEN-LAST:event_JPFcontrasenaMousePressed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        //ARRAY DE STRING PARA GUARDAR DATOS LEIDOS DE LA BASE DE DATOS
        String[] datos = this.leer.leerDatosAlguienExacto("Cliente", this.JTFcedula.getText(), "Clienteid,Contrasenia", "Clienteid");
        if(Arrays.equals(datos, new String[] {this.JTFcedula.getText(), String.valueOf(this.JPFcontrasena.getPassword())})){
            JOptionPane.showMessageDialog(null, "Ingreso exitoso");
            
            //LEER NOMBRE DEL USUARIO
            String[] nombre= this.leer.leerDatosAlguienExacto("Cliente", this.JTFcedula.getText(), "Nombres", "Clienteid");
            
            //USAR DATO ESTATICO PARA PASARLO A ESCRITORIOCLIENTE
            DatosGenerales.setDatos(new String[] {nombre[0], this.JTFcedula.getText()});
            this.escritorioCliente.cargarDatosUsuario();
            
            //LIMPIAR JTFIELD'S
            JTFcedula.setText("Usuario aqui");
            JPFcontrasena.setText("********");
            JTFcedula.setForeground(Color.gray);
            JPFcontrasena.setForeground(Color.gray);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña erroneos");
        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        JTFcedula.setText("Usuario aqui");
        JPFcontrasena.setText("********");
        JTFcedula.setForeground(Color.gray);
        JPFcontrasena.setForeground(Color.gray);
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void JTFcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFcedulaKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos sin espacios");
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcedulaKeyTyped

    private void JLregistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLregistrarMouseClicked
        if(this.re == null){
            this.re = new JFRegister();
            this.re.setVisible(true);
        } else {
            this.re.setVisible(true);
        }
        // TODO add your handling code here:ºº
    }//GEN-LAST:event_JLregistrarMouseClicked

    private void JTFcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFcedulaFocusLost
        if(String.valueOf(this.JTFcedula.getText()).isEmpty()){
            JTFcedula.setText("Usuario aqui");
            JTFcedula.setForeground(Color.gray);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcedulaFocusLost

    private void JPFcontrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPFcontrasenaFocusLost
        if(String.valueOf(JPFcontrasena.getPassword()).isEmpty()){
            JPFcontrasena.setText("********");
            JPFcontrasena.setForeground(Color.gray);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JPFcontrasenaFocusLost

    private void JTFcedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFcedulaFocusGained
        if(JTFcedula.getText().equals("Usuario aqui")){
            JTFcedula.setText("");
            JTFcedula.setForeground(Color.black);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcedulaFocusGained

    private void JPFcontrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JPFcontrasenaFocusGained
        if(String.valueOf(JPFcontrasena.getPassword()).equals("********")){
            JPFcontrasena.setText("");
            JPFcontrasena.setForeground(Color.black);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JPFcontrasenaFocusGained

    private void JTFcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFcedulaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.JPFcontrasena.requestFocus();
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFcedulaKeyPressed

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
            java.util.logging.Logger.getLogger(JFLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLoginUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLicono;
    private javax.swing.JLabel JLregistrar;
    private javax.swing.JPasswordField JPFcontrasena;
    private javax.swing.JTextField JTFcedula;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
