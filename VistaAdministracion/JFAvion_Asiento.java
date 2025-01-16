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
public class JFAvion_Asiento extends javax.swing.JFrame {
    //ATRIBUTOS
    Icono i;
    Leer tabla;
    Agregar agregar;
    Eliminar eliminar;
    Actualizar actualizar;
    
    
    //CONSTRUCTORES
    public JFAvion_Asiento() {
        //INICIALIZAR OBJETOS
        initComponents();
        this.setLocationRelativeTo(this);
        this.i = new Icono();
        this.tabla = new Leer();
        this.agregar = new Agregar();
        this.eliminar = new Eliminar();
        this.actualizar = new Actualizar();
        this.jBactualizarcompa.setVisible(false);
        
        //OPERACIONES SECUNDARIAS
        this.i.setImageLabel(JLicono, "src//main//java//Imagenes//asiento.png");
        tablaAviones();
        this.tabla.diseniarTabla("AsientoId,Fila,Columna,AvionId,Clase");
    }

    
    //METODOS
    private void tablaAviones(){
        this.tabla.diseniarTabla("Id del Avion,Compañia");
        this.tabla.mostrarTabla(this.JTaviones, "Avion", "", "", "Avionid");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        BG = new javax.swing.JPanel();
        Avion = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTFcompañia = new javax.swing.JTextField();
        Opciones = new javax.swing.JPanel();
        jBagregarcompa = new javax.swing.JButton();
        jBmodificarcompa = new javax.swing.JButton();
        jBeliminarcompa = new javax.swing.JButton();
        jBactualizarcompa = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTaviones = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTFidavion1 = new javax.swing.JTextField();
        ASIENTOS = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Opciones1 = new javax.swing.JPanel();
        jBasignarasiento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTFidavion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTasientos = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        JLicono = new javax.swing.JLabel();
        jBregresar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asiento");
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(0, 204, 204));

        Avion.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AVION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPAÑIA:");

        Opciones.setBackground(new java.awt.Color(255, 255, 255));
        Opciones.setForeground(new java.awt.Color(0, 153, 153));

        jBagregarcompa.setBackground(new java.awt.Color(0, 153, 204));
        jBagregarcompa.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBagregarcompa.setText("AGREGAR");
        jBagregarcompa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBagregarcompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarcompaActionPerformed(evt);
            }
        });

        jBmodificarcompa.setBackground(new java.awt.Color(0, 153, 204));
        jBmodificarcompa.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBmodificarcompa.setText("MODIFICAR");
        jBmodificarcompa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBmodificarcompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarcompaActionPerformed(evt);
            }
        });

        jBeliminarcompa.setBackground(new java.awt.Color(0, 153, 204));
        jBeliminarcompa.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBeliminarcompa.setText("ELIMINAR");
        jBeliminarcompa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBeliminarcompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarcompaActionPerformed(evt);
            }
        });

        jBactualizarcompa.setBackground(new java.awt.Color(0, 153, 204));
        jBactualizarcompa.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBactualizarcompa.setText("ACTUALIZAR");
        jBactualizarcompa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBactualizarcompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarcompaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBagregarcompa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBmodificarcompa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBeliminarcompa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBactualizarcompa)
                .addContainerGap())
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregarcompa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificarcompa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBeliminarcompa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBactualizarcompa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TABLA DE AVIONES");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JTaviones.setBackground(new java.awt.Color(0, 153, 204));
        JTaviones.setModel(new javax.swing.table.DefaultTableModel(
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
        JTaviones.setRowHeight(30);
        JTaviones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTavionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTaviones);

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID AVION:");

        jTFidavion1.setBackground(new java.awt.Color(204, 204, 204));
        jTFidavion1.setFocusable(false);

        javax.swing.GroupLayout AvionLayout = new javax.swing.GroupLayout(Avion);
        Avion.setLayout(AvionLayout);
        AvionLayout.setHorizontalGroup(
            AvionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AvionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AvionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AvionLayout.createSequentialGroup()
                        .addGroup(AvionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AvionLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(AvionLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(35, 35, 35)))
                        .addGroup(AvionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFidavion1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFcompañia, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AvionLayout.setVerticalGroup(
            AvionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvionLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AvionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTFcompañia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AvionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFidavion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ASIENTOS.setBackground(new java.awt.Color(0, 153, 153));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ASIENTOS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Opciones1.setBackground(new java.awt.Color(255, 255, 255));
        Opciones1.setForeground(new java.awt.Color(0, 153, 153));

        jBasignarasiento.setBackground(new java.awt.Color(0, 153, 204));
        jBasignarasiento.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBasignarasiento.setText("ASIGNAR AUTOMATICAMENTE");
        jBasignarasiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBasignarasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBasignarasientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Opciones1Layout = new javax.swing.GroupLayout(Opciones1);
        Opciones1.setLayout(Opciones1Layout);
        Opciones1Layout.setHorizontalGroup(
            Opciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opciones1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jBasignarasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Opciones1Layout.setVerticalGroup(
            Opciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBasignarasiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID AVION:");

        jTFidavion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFidavionKeyTyped(evt);
            }
        });

        JTasientos.setBackground(new java.awt.Color(0, 153, 204));
        JTasientos.setModel(new javax.swing.table.DefaultTableModel(
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
        JTasientos.setRowHeight(30);
        jScrollPane2.setViewportView(JTasientos);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TABLA DE ASIENTOS");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout ASIENTOSLayout = new javax.swing.GroupLayout(ASIENTOS);
        ASIENTOS.setLayout(ASIENTOSLayout);
        ASIENTOSLayout.setHorizontalGroup(
            ASIENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ASIENTOSLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Opciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ASIENTOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ASIENTOSLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFidavion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        ASIENTOSLayout.setVerticalGroup(
            ASIENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ASIENTOSLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ASIENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ASIENTOSLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(ASIENTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFidavion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBregresar.setBackground(new java.awt.Color(0, 153, 204));
        jBregresar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBregresar.setText("REGRESAR");
        jBregresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Avion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ASIENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Avion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ASIENTOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarActionPerformed
        JFEscritorio volver = new JFEscritorio();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBregresarActionPerformed

    private void jBagregarcompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarcompaActionPerformed
        if(this.jTFcompañia.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vacios, ingrese datos correctamente");
        } else {
            this.agregar.agregarDato("Avion", "Avionid", "",
                    "default," + this.jTFcompañia.getText());
            JOptionPane.showMessageDialog(null,"Ingreso exitoso");
            
            tablaAviones();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBagregarcompaActionPerformed

    private void jBmodificarcompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarcompaActionPerformed
        int fila = JTaviones.getSelectedRow();
        if(fila >= 0){
            //FUNCIONES BOTONES Y TEXTOS
            this.jBagregarcompa.setVisible(false);
            this.jBmodificarcompa.setVisible(false);
            this.jBeliminarcompa.setVisible(false);
            this.jBregresar.setVisible(false);
            this.jBactualizarcompa.setVisible(true);
            this.JTaviones.setFocusable(false);
            this.jBasignarasiento.setEnabled(false);
            //DATOS A ACTUALIZAR
            jTFidavion1.setText(JTaviones.getValueAt(fila, 0).toString());
            jTFcompañia.setText(JTaviones.getValueAt(fila, 1).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Busque la fila a modificar y haga un click en ella para usar esta funcion");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmodificarcompaActionPerformed

    private void jBactualizarcompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarcompaActionPerformed
        if(this.jTFcompañia.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vacios, ingrese datos correctamente");
        } else {
            //ACTUALIZACION
            this.actualizar.actualizarDato("Avion", "Compania",
                this.jTFcompañia.getText(), "Avionid", this.jTFidavion1.getText());
            //FUNCIONES BOTONES Y TEXTOS
            this.jBagregarcompa.setVisible(true);
            this.jBmodificarcompa.setVisible(true);
            this.jBeliminarcompa.setVisible(true);
            this.jBregresar.setVisible(true);
            this.jBactualizarcompa.setVisible(false);
            this.JTaviones.setFocusable(true);
            this.jBasignarasiento.setEnabled(true);
            tablaAviones();
            //LIMPIAR
            this.jTFidavion1.setText("");
            this.jTFcompañia.setText("");
        }
        // TODO add your handling code here:.
    }//GEN-LAST:event_jBactualizarcompaActionPerformed

    private void jBeliminarcompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarcompaActionPerformed
        int fila = JTaviones.getSelectedRow();
        if(fila >= 0){
            String[] comprobador = this.tabla.leerDatosAlguienExacto("Vuelo", JTaviones.getValueAt(fila, 0).toString(),
                        "Vueloid", "Avionid");
            
            if(comprobador[0] == null){
                int op = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro con id: " + JTaviones.getValueAt(fila, 0).toString() + "?", "Eliminar", JOptionPane.YES_NO_OPTION);
                if(op == JOptionPane.YES_OPTION ){
                    if(fila >= 0){
                        this.eliminar.eliminarRegistro("Avion", "Avionid", JTaviones.getValueAt(fila, 0).toString());
                    } 
                } 
            } else {
                JOptionPane.showMessageDialog(null, "El avion esta relacionado con algun vuelo, primero elimine el vuelo y todas las dependencias y vuelva a intentarlo");
            }
        } else {
                JOptionPane.showMessageDialog(null, "Busque la fila a modificar y haga un click en ella para usar esta funcion");
            
        }
        tablaAviones();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarcompaActionPerformed

    private void jBasignarasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBasignarasientoActionPerformed
        if (this.jTFidavion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vacios, ingrese datos correctamente");
            
        } else if (this.tabla.leerDatosAlguienExacto("Avion", this.jTFidavion.getText(), "Compania", "Avionid")[0] != null){
            if(this.tabla.leerDatosAlguienExacto("Asiento", this.jTFidavion.getText(), "Columna", "Avionid")[0] == null ){
                char fila = 65;
                //ASIENTOS VIP
                for(int i = 0; i < 3; i++){ 
                    this.agregar.agregarDato("Asiento", "Asientoid", "", "default,A," + (i + 1) + "," + this.jTFidavion.getText() + ",VIP,SI");
                    this.agregar.agregarDato("Asiento", "Asientoid", "", "default,B," + (i + 1) + "," + this.jTFidavion.getText() + ",VIP,SI");
                    this.agregar.agregarDato("Asiento", "Asientoid", "", "default,F," + (i + 1) + "," + this.jTFidavion.getText() + ",VIP,SI");
                    this.agregar.agregarDato("Asiento", "Asientoid", "", "default,E," + (i + 1) + "," + this.jTFidavion.getText() + ",VIP,SI");
                }
                //ASIENTOS VIP (COLUMNA 5), ASIENTOS TURISTA
                for(int i = 0; i < 6; i++){
                    for(int j = 0; j < 6; j++){
                        this.agregar.agregarDato("Asiento", "Asientoid", "", "default," + String.valueOf((char) (fila + j)) + "," + (i + 5) + "," + this.jTFidavion.getText() + (i == 0?",VIP,SI":",Turista,SI"));
                    }
                }
                //ASIENTOS ECONOMICOS
                this.agregar.agregarDato("Asiento", "Asientoid", "", "default,B,17," + this.jTFidavion.getText() + ",Economico,SI");
                this.agregar.agregarDato("Asiento", "Asientoid", "", "default,C,17," + this.jTFidavion.getText() + ",Economico,SI");
                this.agregar.agregarDato("Asiento", "Asientoid", "", "default,D,17," + this.jTFidavion.getText() + ",Economico,SI");
                this.agregar.agregarDato("Asiento", "Asientoid", "", "default,E,17," + this.jTFidavion.getText() + ",Economico,SI");

                for(int i = 0; i < 12; i++){
                    for(int j = 0; j < 6; j++){
                        this.agregar.agregarDato("Asiento", "Asientoid", "", "default," + String.valueOf((char) (fila + j)) + "," + (i + 18) + "," + this.jTFidavion.getText() + ",Economico,SI");
                    }
                }
            
            } else {
                JOptionPane.showMessageDialog(null, "Este avion ya tiene asientos asignados");
            }
            //TABLA ASIENTOS
            this.tabla.diseniarTabla("AsientoId,Fila,Columna,AvionId,Clase,Disponibilidad");
            this.tabla.mostrarTabla(JTasientos, "Asiento", this.jTFidavion.getText(), "", "Avionid");
                
        } else {
            JOptionPane.showMessageDialog(null, "El id del avion no existe, compruebe en la tabla de aviones");
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBasignarasientoActionPerformed

    private void JTavionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTavionesMouseClicked
        int a = JTaviones.getSelectedRow();
        this.jTFidavion.setText(JTaviones.getValueAt(a, 0).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_JTavionesMouseClicked

    private void jTFidavionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFidavionKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != KeyEvent.VK_TAB){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidavionKeyTyped

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
            java.util.logging.Logger.getLogger(JFAvion_Asiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAvion_Asiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAvion_Asiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAvion_Asiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAvion_Asiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ASIENTOS;
    private javax.swing.JPanel Avion;
    private javax.swing.JPanel BG;
    private javax.swing.JLabel JLicono;
    private javax.swing.JTable JTasientos;
    private javax.swing.JTable JTaviones;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel Opciones1;
    private javax.swing.JButton jBactualizarcompa;
    private javax.swing.JButton jBagregarcompa;
    private javax.swing.JButton jBasignarasiento;
    private javax.swing.JButton jBeliminarcompa;
    private javax.swing.JButton jBmodificarcompa;
    private javax.swing.JButton jBregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFcompañia;
    private javax.swing.JTextField jTFidavion;
    private javax.swing.JTextField jTFidavion1;
    // End of variables declaration//GEN-END:variables
}
