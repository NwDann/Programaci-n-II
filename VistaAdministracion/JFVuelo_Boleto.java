/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaAdministracion;

import Negocio.Actualizar;
import Negocio.Agregar;
import Negocio.Eliminar;
import Negocio.Leer;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



public class JFVuelo_Boleto extends javax.swing.JFrame {    
    //ATRIBUTOS
    Leer tabla;
    Agregar agregar;
    Eliminar eliminar;
    Actualizar actualizar;
    boolean bandera;
    
    
    //CONSTRUCTORES
    public JFVuelo_Boleto() {
        //INICIALIZAR OBJETOS
        initComponents();
        this.setLocationRelativeTo(this);
        this.tabla = new Leer();
        this.agregar = new Agregar();
        this.eliminar = new Eliminar();
        this.actualizar = new Actualizar();
        this.jBactualizar.setVisible(false);
        this.JLadvertencia1.setForeground(Color.red);
        
        //OPERACIONES SECUNDARIAS
        tablaVuelos();
        tablaBoletos();
        //TABLA AVIONES
        this.tabla.diseniarTabla("Id del Avion,Compañia");
        this.tabla.mostrarTabla(this.jTaviones, "Avion", "", "", "Avionid");
        //TABLA RECORRIDOS
        this.tabla.diseniarTabla("Recorrido ID,Origen,Destino");
        this.tabla.mostrarTabla(this.jTrecorridos, "Recorrido", "", "", "Recorridoid");
    }

    
    //METODOS
    private void tablaVuelos(){
        this.tabla.diseniarTabla("VueloId,Hora de salida,AvionId,RecorridoId,Precio General");
        this.tabla.mostrarTabla(this.jTvuelos, "Vuelo", "", "", "Vueloid");
    }
    
    
    private void tablaBoletos(){
        this.tabla.diseniarTabla("BoletoId,Cedula,Id de Vuelo,Id de Asiento,Costo");
        this.tabla.mostrarTabla(this.jTboletos, "Boleto", "", "", "Boletoid");
    }
    
    
    private void limpiar(){
        this.jTFidVuelo.setText("");
        this.jTFhoraSalida.setText("");
        this.jTFidAvion.setText("");
        this.jTFidRecorrido.setText("");
        this.jTFvueloPrecio.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BG = new javax.swing.JPanel();
        VUELO = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFhoraSalida = new javax.swing.JTextField();
        jTFidAvion = new javax.swing.JTextField();
        jTFidRecorrido = new javax.swing.JTextField();
        JLadvertencia = new javax.swing.JLabel();
        Opciones = new javax.swing.JPanel();
        jBagregar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTvuelos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTFbuscarvuelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFidVuelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFvueloPrecio = new javax.swing.JTextField();
        JLadvertencia1 = new javax.swing.JLabel();
        TABLASINFO = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTaviones = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTrecorridos = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTFbuscarAvion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTFbuscarRecorrido = new javax.swing.JTextField();
        BOLETO = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Opciones1 = new javax.swing.JPanel();
        jBeliminarboleto = new javax.swing.JButton();
        jBregresar = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTboletos = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jTFbuscarboleto = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vuelo");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(0, 204, 204));

        VUELO.setBackground(new java.awt.Color(0, 153, 153));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VUELO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HORA DE SALIDA:");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID AVION:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID RECORRIDO:");

        jTFhoraSalida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFhoraSalidaFocusLost(evt);
            }
        });
        jTFhoraSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFhoraSalidaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFhoraSalidaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFhoraSalidaKeyTyped(evt);
            }
        });

        jTFidAvion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFidAvionFocusLost(evt);
            }
        });
        jTFidAvion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFidAvionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFidAvionKeyTyped(evt);
            }
        });

        jTFidRecorrido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFidRecorridoFocusLost(evt);
            }
        });
        jTFidRecorrido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFidRecorridoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFidRecorridoKeyTyped(evt);
            }
        });

        JLadvertencia.setText("Formato: (HH:MM, 24 horas) ");

        Opciones.setBackground(new java.awt.Color(255, 255, 255));
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
                    .addComponent(jBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TABLA DE VUELOS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
        );

        jTvuelos.setBackground(new java.awt.Color(0, 153, 204));
        jTvuelos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTvuelos.setRowHeight(25);
        jScrollPane1.setViewportView(jTvuelos);

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BUSCAR ID DE VUELO:");

        jTFbuscarvuelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscarvueloKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFbuscarvueloKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID VUELO:");

        jTFidVuelo.setBackground(new java.awt.Color(204, 204, 204));
        jTFidVuelo.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRECIO GENERAL:");

        jTFvueloPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFvueloPrecioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFvueloPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFvueloPrecioKeyTyped(evt);
            }
        });

        JLadvertencia1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout VUELOLayout = new javax.swing.GroupLayout(VUELO);
        VUELO.setLayout(VUELOLayout);
        VUELOLayout.setHorizontalGroup(
            VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(VUELOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addGroup(VUELOLayout.createSequentialGroup()
                        .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFhoraSalida)
                            .addComponent(jTFidAvion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTFidRecorrido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFvueloPrecio))
                        .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VUELOLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTFidVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(VUELOLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLadvertencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLadvertencia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(VUELOLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFbuscarvuelo)
                .addGap(9, 9, 9))
            .addComponent(Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VUELOLayout.setVerticalGroup(
            VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VUELOLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFhoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLadvertencia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VUELOLayout.createSequentialGroup()
                        .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTFidAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTFidRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTFvueloPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(VUELOLayout.createSequentialGroup()
                        .addComponent(JLadvertencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFidVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VUELOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFbuscarvuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TABLASINFO.setBackground(new java.awt.Color(0, 153, 153));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TABLAS DE INFORMACIÓN");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTaviones.setBackground(new java.awt.Color(0, 153, 204));
        jTaviones.setModel(new javax.swing.table.DefaultTableModel(
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
        jTaviones.setRowHeight(25);
        jTaviones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTavionesMouseClicked(evt);
            }
        });
        jTaviones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTavionesKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTaviones);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TABLA DE AVIONES");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTrecorridos.setBackground(new java.awt.Color(0, 153, 204));
        jTrecorridos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTrecorridos.setRowHeight(25);
        jTrecorridos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTrecorridosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTrecorridos);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TABLA DE RECORRIDOS");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("BUSCAR ID AVION:");

        jTFbuscarAvion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscarAvionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFbuscarAvionKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("BUSCAR ID DE RECORRIDO:");

        jTFbuscarRecorrido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscarRecorridoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFbuscarRecorridoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TABLASINFOLayout = new javax.swing.GroupLayout(TABLASINFO);
        TABLASINFO.setLayout(TABLASINFOLayout);
        TABLASINFOLayout.setHorizontalGroup(
            TABLASINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TABLASINFOLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(TABLASINFOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TABLASINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TABLASINFOLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TABLASINFOLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFbuscarAvion)
                        .addGap(47, 47, 47)))
                .addGroup(TABLASINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TABLASINFOLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFbuscarRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        TABLASINFOLayout.setVerticalGroup(
            TABLASINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TABLASINFOLayout.createSequentialGroup()
                .addGroup(TABLASINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TABLASINFOLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(TABLASINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TABLASINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFbuscarAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TABLASINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFbuscarRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        BOLETO.setBackground(new java.awt.Color(0, 153, 153));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("BOLETO");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Opciones1.setBackground(new java.awt.Color(255, 255, 255));
        Opciones1.setForeground(new java.awt.Color(0, 153, 153));

        jBeliminarboleto.setBackground(new java.awt.Color(0, 153, 204));
        jBeliminarboleto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jBeliminarboleto.setText("ELIMINAR BOLETO");
        jBeliminarboleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jBeliminarboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarboletoActionPerformed(evt);
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

        javax.swing.GroupLayout Opciones1Layout = new javax.swing.GroupLayout(Opciones1);
        Opciones1.setLayout(Opciones1Layout);
        Opciones1Layout.setHorizontalGroup(
            Opciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBeliminarboleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Opciones1Layout.setVerticalGroup(
            Opciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Opciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminarboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("TABLA DE BOLETOS");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTboletos.setBackground(new java.awt.Color(0, 153, 204));
        jTboletos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTboletos.setRowHeight(30);
        jScrollPane5.setViewportView(jTboletos);

        jLabel19.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("BUSCAR ID DE BOLETO:");

        jTFbuscarboleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFbuscarboletoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFbuscarboletoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout BOLETOLayout = new javax.swing.GroupLayout(BOLETO);
        BOLETO.setLayout(BOLETOLayout);
        BOLETOLayout.setHorizontalGroup(
            BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Opciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BOLETOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addGroup(BOLETOLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFbuscarboleto)))
                .addContainerGap())
        );
        BOLETOLayout.setVerticalGroup(
            BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BOLETOLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BOLETOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFbuscarboleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TABLASINFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(VUELO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BOLETO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BOLETO, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VUELO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TABLASINFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarActionPerformed
        JFEscritorio volver = new JFEscritorio();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBregresarActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        if (this.jTFhoraSalida.getText().isEmpty() || this.jTFidAvion.getText().isEmpty() || this.jTFidRecorrido.getText().isEmpty() || this.jTFvueloPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vacios, ingrese datos correctamente");
        } else if (this.bandera){
            double precioRedondeado = Math.round(Double.parseDouble(this.jTFvueloPrecio.getText()) * 100.0)/100.0;
            this.agregar.agregarDato("Vuelo", "Vueloid", "",
                    "default," + this.jTFhoraSalida.getText() + "," + this.jTFidAvion.getText() + "," + this.jTFidRecorrido.getText() + "," + precioRedondeado);
            JOptionPane.showMessageDialog(null,"Ingreso exitoso");
            
            tablaVuelos();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "La hora de salida o precio no es valido, compruebe y vuelva a intentarlo");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        int fila = jTvuelos.getSelectedRow();
        if(fila >= 0){
            //FUNCIONES BOTONES Y TEXTOS
            this.jBagregar.setVisible(false);
            this.jBmodificar.setVisible(false);
            this.jBeliminar.setVisible(false);
            this.jBregresar.setVisible(false);
            this.jBactualizar.setVisible(true);
            this.jTvuelos.setFocusable(false);
            this.jBeliminarboleto.setEnabled(false);
            this.jTFbuscarvuelo.setFocusable(false);
            this.jTFbuscarboleto.setFocusable(false);
            //DATOS A ACTUALIZAR
            jTFidVuelo.setText(jTvuelos.getValueAt(fila, 0).toString());
            jTFhoraSalida.setText(jTvuelos.getValueAt(fila, 1).toString());
            jTFidAvion.setText(jTvuelos.getValueAt(fila, 2).toString());
            jTFidRecorrido.setText(jTvuelos.getValueAt(fila, 3).toString());
            jTFvueloPrecio.setText(jTvuelos.getValueAt(fila, 4).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Busque la fila a modificar y haga un click en ella para usar esta funcion");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        if(this.jTFhoraSalida.getText().isEmpty() || this.jTFidAvion.getText().isEmpty() || this.jTFidRecorrido.getText().isEmpty() || this.jTFvueloPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vacios, ingrese datos correctamente");
        } else {
            //ACTUALIZACION
            this.actualizar.actualizarDato("Vuelo", "HoraSalida,AvionidV,Recorridoid,Precio",
                this.jTFhoraSalida.getText() + "," + this.jTFidAvion.getText() + "," + this.jTFidRecorrido.getText() + "," + this.jTFvueloPrecio.getText(),
                "Vueloid", this.jTFidVuelo.getText());
            //FUNCIONES BOTONES Y TEXTOS
            this.jBagregar.setVisible(true);
            this.jBmodificar.setVisible(true);
            this.jBeliminar.setVisible(true);
            this.jBregresar.setVisible(true);
            this.jBactualizar.setVisible(false);
            this.jTvuelos.setFocusable(true);
            this.jBeliminarboleto.setEnabled(true);
            this.jTFbuscarvuelo.setFocusable(true);
            this.jTFbuscarboleto.setFocusable(true);
            //LIMPIAR Y TABLA ACTUALIZADA
            tablaVuelos();
            limpiar();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        int fila = jTvuelos.getSelectedRow();
        
        if(fila >= 0){
            String[] comprobador = this.tabla.leerDatosAlguienExacto("Boleto", jTvuelos.getValueAt(fila, 0).toString(), "Boletoid", "VueloidB");
            if(comprobador[0] == null){
                int op = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro con id: " + jTvuelos.getValueAt(fila, 0).toString() + "?", "Eliminar", JOptionPane.YES_NO_OPTION);
                if(op == JOptionPane.YES_OPTION ){
                    this.eliminar.eliminarRegistro("Vuelo", "Vueloid", jTvuelos.getValueAt(fila, 0).toString());

                } 
            } else {
                JOptionPane.showMessageDialog(null, "El vuelo esta ligado con uno o varios boletos, es delicado pero debe eliminar los boletos que tienen el vuelo actual.\nSi lo hace, intente eliminarlo de nuevo");
            }
                
        } else {
                JOptionPane.showMessageDialog(null, "Busque la fila a modificar y haga un click en ella para usar esta funcion");
            
        }
        tablaVuelos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jTFbuscarvueloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarvueloKeyReleased
        this.tabla.diseniarTabla("VueloId,Hora de salida,AvionId,RecorridoId,Precio General");
        this.tabla.mostrarTablaBusqueda(this.jTvuelos, "Vuelo", this.jTFbuscarvuelo.getText(), "", "Vueloid");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarvueloKeyReleased

    private void jTFbuscarvueloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarvueloKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != KeyEvent.VK_TAB){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarvueloKeyTyped

    private void jBeliminarboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarboletoActionPerformed
        int fila = jTboletos.getSelectedRow();
        int op = JOptionPane.showConfirmDialog(null, "Desea eliminar el registro con id: " + jTboletos.getValueAt(fila, 0).toString() + "?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if(op == JOptionPane.YES_OPTION ){
            if(fila >= 0){
                this.actualizar.actualizarDato("Asiento", "Disp", "SI", "Asientoid", jTboletos.getValueAt(fila, 3).toString());
                this.eliminar.eliminarRegistro("Boleto", "Boletoid", jTboletos.getValueAt(fila, 0).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Busque la fila a modificar y haga un click en ella para usar esta funcion");
            }
        }
        tablaBoletos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarboletoActionPerformed

    private void jTFbuscarboletoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarboletoKeyReleased
        this.tabla.diseniarTabla("BoletoId,Cedula,Id de Vuelo,Id de Asiento,Costo");
        this.tabla.mostrarTablaBusqueda(this.jTboletos, "Boleto", this.jTFbuscarboleto.getText(), "", "Boletoid");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarboletoKeyReleased

    private void jTFbuscarboletoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarboletoKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != KeyEvent.VK_TAB){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarboletoKeyTyped

    private void jTFhoraSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFhoraSalidaKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != ':' && hola != KeyEvent.VK_TAB){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos, use : como separador de horas y minutos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFhoraSalidaKeyTyped

    private void jTFhoraSalidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFhoraSalidaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFhoraSalidaFocusLost

    private void jTFidAvionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFidAvionKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != KeyEvent.VK_TAB){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidAvionKeyTyped

    private void jTFidRecorridoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFidRecorridoKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != KeyEvent.VK_TAB){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidRecorridoKeyTyped

    private void jTFidAvionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFidAvionFocusLost
        if(this.jTFidAvion.getText().isEmpty()){
        } else if(this.tabla.leerDatosAlguienExacto("Avion", this.jTFidAvion.getText(), "Compania", "Avionid")[0] == null){
            JOptionPane.showMessageDialog(null, "La id del avion proporcionada no existe en la base de datos");
            this.jTFidAvion.setText("");
            this.jTFidAvion.requestFocus();
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidAvionFocusLost

    private void jTFidRecorridoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFidRecorridoFocusLost
        if(this.jTFidRecorrido.getText().isEmpty()){
        } else if(this.tabla.leerDatosAlguienExacto("Recorrido", this.jTFidRecorrido.getText(), "Origen", "Recorridoid")[0] == null){
            JOptionPane.showMessageDialog(null, "La id del recorrido proporcionado no existe en la base de datos");
            this.jTFidRecorrido.setText("");
            this.jTFidRecorrido.requestFocus();
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidRecorridoFocusLost

    private void jTFhoraSalidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFhoraSalidaKeyReleased
        Pattern si = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$");
        Matcher no = si.matcher(this.jTFhoraSalida.getText());
        
        if(this.jTFhoraSalida.getText().isEmpty()){
            this.jTFhoraSalida.setForeground(Color.black);
            this.JLadvertencia.setForeground(Color.black);
            this.JLadvertencia1.setText("");
        } else if(!no.matches()){
            this.jTFhoraSalida.setForeground(Color.red);
            this.JLadvertencia.setForeground(Color.red);
            this.JLadvertencia1.setText("INGRESO INCORRECTO DE HORA");
            this.bandera = false;
        } else {
            this.jTFhoraSalida.setForeground(Color.red);
            this.JLadvertencia.setForeground(Color.black);
            this.JLadvertencia1.setText("");
            this.bandera = true;
        }
    }//GEN-LAST:event_jTFhoraSalidaKeyReleased

    private void jTFhoraSalidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFhoraSalidaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.jTFidAvion.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFhoraSalidaKeyPressed

    private void jTFidAvionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFidAvionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.jTFidRecorrido.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidAvionKeyPressed

    private void jTFidRecorridoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFidRecorridoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.jTFvueloPrecio.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidRecorridoKeyPressed

    private void jTrecorridosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTrecorridosMouseClicked
        int a = jTrecorridos.getSelectedRow();
        this.jTFidRecorrido.setText(jTrecorridos.getValueAt(a, 0).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTrecorridosMouseClicked

    private void jTavionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTavionesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTavionesKeyPressed

    private void jTavionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTavionesMouseClicked
        int a = jTaviones.getSelectedRow();
        this.jTFidAvion.setText(jTaviones.getValueAt(a, 0).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTavionesMouseClicked

    private void jTFbuscarAvionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarAvionKeyReleased
        this.tabla.diseniarTabla("Id del Avion,Compañia");
        this.tabla.mostrarTablaBusqueda(this.jTaviones, "Avion", this.jTFbuscarAvion.getText(), "", "Avionid");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarAvionKeyReleased

    private void jTFbuscarAvionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarAvionKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != KeyEvent.VK_TAB){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarAvionKeyTyped

    private void jTFbuscarRecorridoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarRecorridoKeyReleased
        this.tabla.diseniarTabla("Recorrido ID,Origen,Destino");
        this.tabla.mostrarTablaBusqueda(this.jTrecorridos, "Recorrido", this.jTFbuscarRecorrido.getText(), "", "Recorridoid");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarRecorridoKeyReleased

    private void jTFbuscarRecorridoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFbuscarRecorridoKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != KeyEvent.VK_TAB){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbuscarRecorridoKeyTyped

    private void jTFvueloPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFvueloPrecioKeyTyped
        char hola = evt.getKeyChar();
        if(!Character.isDigit(hola) && hola != KeyEvent.VK_ENTER && hola != KeyEvent.VK_BACK_SPACE && hola != KeyEvent.VK_TAB && hola != '.'){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo digitos, use el punto como separador de decimales");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFvueloPrecioKeyTyped

    private void jTFvueloPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFvueloPrecioKeyPressed
    }//GEN-LAST:event_jTFvueloPrecioKeyPressed

    private void jTFvueloPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFvueloPrecioKeyReleased
        Pattern si = Pattern.compile("^\\d+(\\.\\d+)?$");
        Matcher no = si.matcher(this.jTFvueloPrecio.getText());
        
        if (this.jTFvueloPrecio.getText().isEmpty()){
        } else if (no.matches()){
            this.jTFvueloPrecio.setForeground(Color.BLACK);
        } else {
            this.jTFvueloPrecio.setForeground(Color.red);
            this.bandera = false;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFvueloPrecioKeyReleased

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
            java.util.logging.Logger.getLogger(JFVuelo_Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVuelo_Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVuelo_Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVuelo_Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVuelo_Boleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel BOLETO;
    private javax.swing.JLabel JLadvertencia;
    private javax.swing.JLabel JLadvertencia1;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel Opciones1;
    private javax.swing.JPanel TABLASINFO;
    private javax.swing.JPanel VUELO;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBeliminarboleto;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTFbuscarAvion;
    private javax.swing.JTextField jTFbuscarRecorrido;
    private javax.swing.JTextField jTFbuscarboleto;
    private javax.swing.JTextField jTFbuscarvuelo;
    private javax.swing.JTextField jTFhoraSalida;
    private javax.swing.JTextField jTFidAvion;
    private javax.swing.JTextField jTFidRecorrido;
    private javax.swing.JTextField jTFidVuelo;
    private javax.swing.JTextField jTFvueloPrecio;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTaviones;
    private javax.swing.JTable jTboletos;
    private javax.swing.JTable jTrecorridos;
    private javax.swing.JTable jTvuelos;
    // End of variables declaration//GEN-END:variables
}
