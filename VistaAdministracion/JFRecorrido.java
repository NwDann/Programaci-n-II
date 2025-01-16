/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaAdministracion;

import Negocio.Actualizar;
import Negocio.Agregar;
import Negocio.Eliminar;
import Negocio.Icono;
import Negocio.Leer;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class JFRecorrido extends javax.swing.JFrame {
    //ATRIBUTOS
    Icono i;
    Leer tabla;
    Agregar agregar;
    Eliminar eliminar;
    Actualizar actualizar;

    
    //CONSTRUCTORES
    public JFRecorrido() {
        //INICIALIZAR OBJETOS
        initComponents();
        this.setLocationRelativeTo(this);
        this.i = new Icono();
        this.tabla = new Leer();
        this.agregar = new Agregar();
        this.eliminar = new Eliminar();
        this.actualizar = new Actualizar();
        this.jBactualizar.setVisible(false);
        
        //OPERACIONES SECUNDARIAS
        this.i.setImageLabel(JLicono, "src//main//java//Imagenes//IconoPrincipal.png");
        this.repaint();
        tablaGeneral();
    }
    

    //METODOS
    private void tablaGeneral(){
        this.tabla.diseniarTabla("Recorrido ID,Origen,Destino");
        this.tabla.mostrarTabla(jTrecorrido, "Recorrido", "", "", "Recorridoid");
    }
    
    
    public void limpiar(){
        this.jTFid.setText("");
        this.jTForigen.setText("");
        this.jTFdestino.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Vuelo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFdestino = new javax.swing.JTextField();
        jTForigen = new javax.swing.JTextField();
        jTFid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JLicono = new javax.swing.JLabel();
        Opciones = new javax.swing.JPanel();
        jBagregar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBregresar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        Tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTrecorrido = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTFbuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(0, 204, 204));
        Bg.setForeground(new java.awt.Color(0, 204, 204));

        Vuelo.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORIGEN:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESTINO:");

        jTFid.setEditable(false);
        jTFid.setBackground(new java.awt.Color(204, 204, 204));
        jTFid.setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RECORRIDO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VueloLayout = new javax.swing.GroupLayout(Vuelo);
        Vuelo.setLayout(VueloLayout);
        VueloLayout.setHorizontalGroup(
            VueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VueloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47)
                .addGroup(VueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTForigen, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jTFdestino)
                    .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VueloLayout.setVerticalGroup(
            VueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VueloLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VueloLayout.createSequentialGroup()
                        .addGroup(VueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTForigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTFdestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Opciones.setBackground(new java.awt.Color(0, 153, 153));
        Opciones.setForeground(new java.awt.Color(0, 153, 153));

        jBagregar.setBackground(new java.awt.Color(0, 153, 204));
        jBagregar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBagregar.setText("AGREGAR");
        jBagregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        jBmodificar.setBackground(new java.awt.Color(0, 153, 204));
        jBmodificar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBmodificar.setText("MODIFICAR");
        jBmodificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBeliminar.setBackground(new java.awt.Color(0, 153, 204));
        jBeliminar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBeliminar.setText("ELIMINAR");
        jBeliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBregresar.setBackground(new java.awt.Color(0, 153, 204));
        jBregresar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBregresar.setText("REGRESAR");
        jBregresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarActionPerformed(evt);
            }
        });

        jBactualizar.setBackground(new java.awt.Color(0, 153, 204));
        jBactualizar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBactualizar.setText("ACTUALIZAR");
        jBactualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBactualizar)
                .addContainerGap())
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabla.setBackground(new java.awt.Color(0, 153, 153));

        jTrecorrido.setBackground(new java.awt.Color(0, 153, 204));
        jTrecorrido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTrecorrido.setRowHeight(30);
        jScrollPane1.setViewportView(jTrecorrido);

        javax.swing.GroupLayout TablaLayout = new javax.swing.GroupLayout(Tabla);
        Tabla.setLayout(TablaLayout);
        TablaLayout.setHorizontalGroup(
            TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        TablaLayout.setVerticalGroup(
            TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TABLA DE RECORRIDOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BUSCAR ID DE RECORRIDO:");

        jTFbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFbuscarActionPerformed(evt);
            }
        });
        jTFbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFbuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFbuscar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Vuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addComponent(Vuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        int fila = jTrecorrido.getSelectedRow();
        if(fila >= 0){
            //FUNCIONES BOTONES Y TEXTOS
            this.jBagregar.setVisible(false);
            this.jBmodificar.setVisible(false);
            this.jBeliminar.setVisible(false);
            this.jBregresar.setVisible(false);
            this.jBactualizar.setVisible(true);
            this.jTFbuscar.setFocusable(false);
            this.jTrecorrido.setFocusable(false);
            //DATOS A ACTUALIZAR
            jTFid.setText(jTrecorrido.getValueAt(fila, 0).toString());
            jTForigen.setText(jTrecorrido.getValueAt(fila, 1).toString());
            jTFdestino.setText(jTrecorrido.getValueAt(fila, 2).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Busque la fila a modificar y haga un click en ella para usar esta funcion");
        }
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        if(this.jTForigen.getText().isEmpty() || this.jTFdestino.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vacios, ingrese datos correctamente");
        } else {
            //ACTUALIZACION
            this.actualizar.actualizarDato("Recorrido", "Origen,Destino",
                this.jTForigen.getText() + "," + this.jTFdestino.getText(), "Recorridoid", this.jTFid.getText());
            //FUNCIONES BOTONES Y TEXTOS
            this.jBagregar.setVisible(true);
            this.jBmodificar.setVisible(true);
            this.jBeliminar.setVisible(true);
            this.jBregresar.setVisible(true);
            this.jTFbuscar.setFocusable(true);
            this.jBactualizar.setVisible(false);
            this.jTrecorrido.setFocusable(true);
            //LIMPIAR Y TABLA ACTUALIZADA
            this.tablaGeneral();
            this.limpiar();
        }
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        if(this.jTForigen.getText().isEmpty() || this.jTFdestino.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vacios, ingrese datos correctamente");
        } else if (this.jTForigen.getText().equals(this.jTFdestino.getText())){
            JOptionPane.showMessageDialog(null, "El origen y destino no pueden ser el mismo.");
        }
        else{
            this.agregar.agregarDato("Recorrido", "Recorridoid", "", 
                "default," + this.jTForigen.getText() + "," + this.jTFdestino.getText());
            
            JOptionPane.showMessageDialog(null,"Ingreso exitoso");
            limpiar();
            tablaGeneral();
        }
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarActionPerformed
        JFEscritorio volver = new JFEscritorio();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBregresarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        int fila = jTrecorrido.getSelectedRow();
        if(fila >= 0){
            String[] comprobador = this.tabla.leerDatosAlguienExacto("Vuelo", jTrecorrido.getValueAt(fila, 0).toString(), "Vueloid", "Recorridoid");
            
            if (comprobador[0] == null){
                int op = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro con id: " + jTrecorrido.getValueAt(fila, 0).toString() + "?", "Eliminar", JOptionPane.YES_NO_OPTION);

                if(op == JOptionPane.YES_OPTION ){
                    this.eliminar.eliminarRegistro("Recorrido", "Recorridoid", jTrecorrido.getValueAt(fila, 0).toString());

                } 
            } else {
                JOptionPane.showMessageDialog(null, "El recorrido esta relacionado con algunos vuelos, borre los vuelos e intentelo otra vez");
            } 
                
        } else {
            JOptionPane.showMessageDialog(null, "Busque la fila a modificar y haga un click en ella para usar esta funcion");
        
        }
        
        tablaGeneral();
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jTFbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarKeyReleased
        this.tabla.diseniarTabla("Recorrido ID,Origen,Destino");
        this.tabla.mostrarTablaBusqueda(jTrecorrido, "Recorrido", this.jTFbuscar.getText(), "", "Recorridoid");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarKeyReleased

    private void jTFbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarKeyTyped

    private void jTFbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(JFRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRecorrido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRecorrido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JLabel JLicono;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel Tabla;
    private javax.swing.JPanel Vuelo;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFbuscar;
    private javax.swing.JTextField jTFdestino;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTextField jTForigen;
    private javax.swing.JTable jTrecorrido;
    // End of variables declaration//GEN-END:variables
}
