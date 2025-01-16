/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaCliente;

import Negocio.Actualizar;
import Negocio.Agregar;
import Negocio.ColorearFilas;
import Negocio.DatosGenerales;
import Negocio.Icono;
import Negocio.Leer;
import VistaAdministracion.JFLoginAdministracion;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Vid
 */
public class JFEscritorioCliente extends javax.swing.JFrame {
    //ATRIBUTOS
    JFLoginUsuario login;
    JFboletosAdquiridos jboletos;
    Leer tabla;
    Icono i;
    Agregar agregar;
    Actualizar actualizar;
    int aux = 0;
    String Vueloid, Asientoid, origen, destino, horaSalida, Avionid, companiaA, asiento, claseAsiento;
    double precioGeneral, precioFinal;
    
    
    //CONSTRUCTORES
    public JFEscritorioCliente() {
        //INICIALIZAR OBJETOS
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.i = new Icono();
        this.tabla = new Leer();
        this.agregar = new Agregar();
        this.actualizar = new Actualizar();
        this.JPprecios.setBackground(Color.green);
        
        //OPERACIONES SECUNDARIAS
        this.i.setImageLabel(JLicono, "src//main//java//Imagenes//IconoPrincipal.png");
        this.i.setImageLabel(JLicono1, "src//main//java//Imagenes//Cliente.png");
        this.i.setImageLabel(JLicono2, "src//main//java//Imagenes//vuelo.png");
        this.i.setImageLabel(JLicono3, "src//main//java//Imagenes//asiento.png");
        this.i.setImageLabel(JLicono4, "src//main//java//Imagenes//usuario.png");
        this.i.setImageLabel(jLavionGrafica, "src//main//java//Imagenes//AsientosHD.jpg");
        this.i.setImageLabel(jLcaritaLike, "src//main//java//Imagenes//caritaLike.png");
        this.repaint();
        jTabbedPane1.setEnabledAt(0,false);
        jTabbedPane1.setEnabledAt(1,false);
        jTabbedPane1.setEnabledAt(2,false);
        jTabbedPane1.setEnabledAt(3,false);
        tablaRecorrido();
    }
    
    
    //METODOS
    private void tablaRecorrido(){
        this.jTabbedPane1.setSelectedIndex(0);
        this.tabla.diseniarTabla("Recorrido ID,Origen,Destino");
        this.tabla.mostrarTabla(jTrecorridos, "recorrido", "", "", "Recorridoid");
    }
    
    
    public void cargarDatosUsuario(){
        this.jLnombre.setText(DatosGenerales.getDatos()[0]);
        this.jLcedula.setText(DatosGenerales.getDatos()[1]);
    }
    
    
    private void calculoPrecios(int valorAgregadoPorClaseAsiento){
        //0 ----> ECONOMICO
        //1 ----> TURISTA
        //2 ----> VIP
        double a = (valorAgregadoPorClaseAsiento == 0?0:
                (valorAgregadoPorClaseAsiento == 1?(precioGeneral * 25)/100 : ((precioGeneral * 50)/100)));
        
        this.JLprecioMenor.setText(String.valueOf(Math.round(((precioGeneral * 80)/100 + a) * 100.0)/100.0));
        
        this.JLprecioAdulto.setText(String.valueOf(Math.round((precioGeneral + a) * 100.0)/100.0));
        
        this.JLprecioMayor.setText(String.valueOf(Math.round(((precioGeneral * 70)/100 + a) * 100.0)/100.0));
        
        this.JLprecioDiscapacitado.setText(String.valueOf(Math.round(((precioGeneral * 60)/100 + a) * 100.0)/100.0));
        
    } 
    
    
    private void precioFinal(){
        switch(this.JCBtipoPasajero.getSelectedIndex()){
            case 0 -> {
                this.precioFinal = Double.parseDouble(this.JLprecioMenor.getText());
                
            }
            
            case 1 -> {
                this.precioFinal = Double.parseDouble(this.JLprecioAdulto.getText());
                
            }
            
            case 2 -> {
                this.precioFinal = Double.parseDouble(this.JLprecioMayor.getText());
                
            }
            
            case 3 -> {
                this.precioFinal = Double.parseDouble(this.JLprecioDiscapacitado.getText());
                
            }
            
        }
    }
    
    
    private void imprimirBoleto(){
        String salida = "\tInformacion Boleto";
        salida += "\nCedula del usuario: " + this.jLcedula.getText();
        salida += "\nNombre del usuario: " + this.jLnombre.getText();
        salida += "\nTipo: " + this.JCBtipoPasajero.getSelectedItem().toString();
        salida += "\n\n ■ Datos del viaje desde " + this.origen + " hasta " + this.destino;
        salida += "\nHora de salida: " + this.horaSalida;
        salida += "\nNumero de avion: " + this.Avionid;
        this.companiaA = this.tabla.leerDatosAlguienExacto("Avion", this.Avionid, "Compania", "Avionid")[0];
        salida += "\nCompañia del avion: " + this.companiaA;
        salida += "\n\n ■ Datos del asiento: ";
        salida += "\nUbicacion del asiento: " + this.asiento;
        salida += "\nClase: " + this.claseAsiento;
        salida += "\n\nTotal a pagar por boleto: USD $$$ " + this.precioFinal;
        this.jTAfactura.setText(salida);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jBloggin = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jBAcomprarb = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTrecorridos = new javax.swing.JTable();
        JLicono4 = new javax.swing.JLabel();
        JBboletosAdquiridos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTvuelos = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTFidVuelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBregresarv = new javax.swing.JButton();
        jBsiguientev = new javax.swing.JButton();
        JLicono2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTFiasiento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jBregresarv1 = new javax.swing.JButton();
        jBsiguientea = new javax.swing.JButton();
        jLavionGrafica = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTasientos = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        JPprecios = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        JLprecioMenor = new javax.swing.JLabel();
        JLprecioAdulto = new javax.swing.JLabel();
        JLprecioMayor = new javax.swing.JLabel();
        JLprecioDiscapacitado = new javax.swing.JLabel();
        JLprecioMenor1 = new javax.swing.JLabel();
        JLprecioMenor2 = new javax.swing.JLabel();
        JLprecioMenor3 = new javax.swing.JLabel();
        JLprecioMenor4 = new javax.swing.JLabel();
        JCBtipoPasajero = new javax.swing.JComboBox<>();
        JLtipoPasajero = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLicono3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAfactura = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBfinalizar = new javax.swing.JButton();
        jBregresarf2 = new javax.swing.JButton();
        jBregresarf = new javax.swing.JButton();
        jLcaritaLike = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        JLicono1 = new javax.swing.JLabel();
        jLcedula = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        JLicono = new javax.swing.JLabel();
        JBadministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jBloggin.setBackground(new java.awt.Color(0, 204, 204));
        jBloggin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBloggin.setText("INGRESA O REGISTRATE");
        jBloggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlogginActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jBAcomprarb.setBackground(new java.awt.Color(0, 204, 204));
        jBAcomprarb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBAcomprarb.setText("COMPRAR BOLETO");
        jBAcomprarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcomprarbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Presione el boton para empezar con el proceso de compra");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Vuelos que podrian interesarte...");

        jTrecorridos.setBackground(new java.awt.Color(0, 204, 204));
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
        jTrecorridos.setRowHeight(45);
        jScrollPane1.setViewportView(jTrecorridos);
        if (jTrecorridos.getColumnModel().getColumnCount() > 0) {
            jTrecorridos.getColumnModel().getColumn(0).setResizable(false);
            jTrecorridos.getColumnModel().getColumn(1).setResizable(false);
            jTrecorridos.getColumnModel().getColumn(2).setResizable(false);
            jTrecorridos.getColumnModel().getColumn(3).setResizable(false);
        }

        JLicono4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JBboletosAdquiridos.setBackground(new java.awt.Color(0, 204, 204));
        JBboletosAdquiridos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBboletosAdquiridos.setText("BOLETOS ADQUIRIDOS");
        JBboletosAdquiridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBboletosAdquiridosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jBAcomprarb))
                        .addGap(479, 479, 479)
                        .addComponent(JBboletosAdquiridos)
                        .addGap(32, 32, 32)
                        .addComponent(JLicono4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAcomprarb)
                            .addComponent(JBboletosAdquiridos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(JLicono4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Seleccione el vuelo que desea tomar");

        jTvuelos.setBackground(new java.awt.Color(0, 204, 204));
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
        jTvuelos.setRowHeight(30);
        jTvuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTvuelosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTvuelos);

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setFocusCycleRoot(true);
        jPanel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VUELO SELECCIONADO");

        jTFidVuelo.setEditable(false);
        jTFidVuelo.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ID DE VUELO:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTFidVuelo)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFidVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jBregresarv.setBackground(new java.awt.Color(0, 204, 204));
        jBregresarv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBregresarv.setText("REGRESAR");
        jBregresarv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarvActionPerformed(evt);
            }
        });

        jBsiguientev.setBackground(new java.awt.Color(0, 204, 204));
        jBsiguientev.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBsiguientev.setText("SIGUIENTE");
        jBsiguientev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsiguientevActionPerformed(evt);
            }
        });

        JLicono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("(vuelos disponibles segun el recorrido elegido)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jBregresarv)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jBsiguientev)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(JLicono2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(37, 37, 37)
                        .addComponent(JLicono2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBregresarv)
                            .addComponent(jBsiguientev)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vuelo", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(0, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.setFocusCycleRoot(true);
        jPanel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ASIENTO SELECCIONADO (COLUMNA/FILA)");

        jTFiasiento.setFocusable(false);
        jTFiasiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFiasientoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFiasientoKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("ASIENTO:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jTFiasiento)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFiasiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jBregresarv1.setBackground(new java.awt.Color(0, 204, 204));
        jBregresarv1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBregresarv1.setText("REGRESAR");
        jBregresarv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarv1ActionPerformed(evt);
            }
        });

        jBsiguientea.setBackground(new java.awt.Color(0, 102, 0));
        jBsiguientea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBsiguientea.setText("COMPRAR");
        jBsiguientea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsiguienteaActionPerformed(evt);
            }
        });

        jTasientos.setBackground(new java.awt.Color(0, 204, 204));
        jTasientos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTasientos.setRowHeight(30);
        jTasientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTasientosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTasientos);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Seleccione el asiento que desea tomar");

        JPprecios.setBackground(new java.awt.Color(51, 153, 255));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Seleccione el tipo de pasajero:");

        jLabel1.setText("■ Menores de edad (Hasta 18 años):");

        jLabel2.setText("■ Adultos (Entre 18-64 años):");

        jLabel19.setText("■ Mayores de edad (64 años en adelante):");

        jLabel20.setText("■ Discapacitados:");

        JLprecioMenor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JLprecioAdulto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JLprecioMayor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JLprecioDiscapacitado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JLprecioMenor1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLprecioMenor1.setText("USD $");

        JLprecioMenor2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLprecioMenor2.setText("USD $");

        JLprecioMenor3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLprecioMenor3.setText("USD $");

        JLprecioMenor4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLprecioMenor4.setText("USD $");

        JCBtipoPasajero.setBackground(new java.awt.Color(0, 153, 153));
        JCBtipoPasajero.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        JCBtipoPasajero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menor de edad", "Adulto", "Mayor de edad", "Discapacitado" }));

        JLtipoPasajero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLtipoPasajero.setText("Precio (Economico)");

        javax.swing.GroupLayout JPpreciosLayout = new javax.swing.GroupLayout(JPprecios);
        JPprecios.setLayout(JPpreciosLayout);
        JPpreciosLayout.setHorizontalGroup(
            JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPpreciosLayout.createSequentialGroup()
                .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPpreciosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLtipoPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addGroup(JPpreciosLayout.createSequentialGroup()
                        .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPpreciosLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(JPpreciosLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLprecioAdulto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(JPpreciosLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLprecioMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPpreciosLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLprecioDiscapacitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(JPpreciosLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLprecioMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLprecioMenor1)
                                    .addComponent(JLprecioMenor2)
                                    .addComponent(JLprecioMenor3)
                                    .addComponent(JLprecioMenor4)))
                            .addGroup(JPpreciosLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(JCBtipoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPpreciosLayout.setVerticalGroup(
            JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPpreciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(JLtipoPasajero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLprecioDiscapacitado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPpreciosLayout.createSequentialGroup()
                        .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPpreciosLayout.createSequentialGroup()
                                .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(JPpreciosLayout.createSequentialGroup()
                                        .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(JLprecioMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(JPpreciosLayout.createSequentialGroup()
                                        .addComponent(JLprecioMenor1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JLprecioAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JLprecioMenor2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPpreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(JLprecioMenor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(JLprecioMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addComponent(JLprecioMenor4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(JCBtipoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JPprecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLavionGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jBregresarv1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jBsiguientea, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JPprecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLavionGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBregresarv1)
                    .addComponent(jBsiguientea))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Asiento", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("---------------------------------------------------------------------------------------------");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setText("---------------------------------------------------------------------------------------------");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Boleto AIRSCAPE");

        JLicono3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel9.setBackground(new java.awt.Color(255, 255, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTAfactura.setEditable(false);
        jTAfactura.setBackground(new java.awt.Color(255, 255, 102));
        jTAfactura.setColumns(20);
        jTAfactura.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTAfactura.setRows(5);
        jTAfactura.setFocusable(false);
        jScrollPane4.setViewportView(jTAfactura);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setText("---------------------------------------------------------------------------------------------");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("AIRSCAPE: El arte de volar en libertad. !Buen viaje!");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(JLicono3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(JLicono3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jBfinalizar.setBackground(new java.awt.Color(0, 204, 204));
        jBfinalizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBfinalizar.setText("FINALIZAR LA COMPRA");
        jBfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizarActionPerformed(evt);
            }
        });

        jBregresarf2.setBackground(new java.awt.Color(0, 204, 204));
        jBregresarf2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBregresarf2.setText("COMPRAR OTRO ASIENTO");
        jBregresarf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarf2ActionPerformed(evt);
            }
        });

        jBregresarf.setBackground(new java.awt.Color(0, 204, 204));
        jBregresarf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBregresarf.setText("REGRESAR AL MENU PRINCIPAL");
        jBregresarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBfinalizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBregresarf2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBregresarf, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLcaritaLike, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(316, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jBregresarf)
                        .addGap(81, 81, 81)
                        .addComponent(jLcaritaLike, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBregresarf2)
                        .addGap(18, 18, 18)
                        .addComponent(jBfinalizar)
                        .addGap(53, 53, 53))))
        );

        jTabbedPane1.addTab("Factura", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        JLicono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLcedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLcedula.setText("Cedula");

        jLnombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLnombre.setText("Nombre");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLicono1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLcedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(JLicono1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AIRSCAPE");

        JLicono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JLicono, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLicono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JBadministrador.setBackground(new java.awt.Color(0, 204, 204));
        JBadministrador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBadministrador.setText("INGRESAR COMO ADMINISTRADOR");
        JBadministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBadministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(JBadministrador)
                        .addGap(639, 639, 639)
                        .addComponent(jBloggin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBloggin)
                    .addComponent(JBadministrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAcomprarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcomprarbActionPerformed
        this.aux = jTrecorridos.getSelectedRow();
        
        if(this.aux >= 0){
            //EXTRACCION INFORMACION DE LA TABLA RECORRIDO
            this.origen = jTrecorridos.getValueAt(this.aux, 1).toString();
            this.destino = jTrecorridos.getValueAt(this.aux, 2).toString();
            this.aux = Integer.parseInt(jTrecorridos.getValueAt(aux, 0).toString());
            
            //INICIO DE LA TABLA VUELO
            this.tabla.diseniarTabla("Num. Vuelo,Hora de salida,Numero de avion,Precio General");
            this.tabla.mostrarTabla(jTvuelos, "Vuelo", String.valueOf(this.aux), "Vueloid,HoraSalida,AvionidV,Precio", "Recorridoid");
            this.jTabbedPane1.setSelectedIndex(1);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione en la tabla el recorrido");
        }
        //jTabbedPane1.setEnabledAt(0,false);
        //jTabbedPane1.setEnabledAt(1,true);   
    }//GEN-LAST:event_jBAcomprarbActionPerformed

    private void jBregresarvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarvActionPerformed
        this.jTabbedPane1.setSelectedIndex(0);
        //jTabbedPane1.setEnabledAt(0,true);
        //jTabbedPane1.setEnabledAt(1,false);
    }//GEN-LAST:event_jBregresarvActionPerformed

    private void jBsiguientevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsiguientevActionPerformed
        this.aux = jTvuelos.getSelectedRow();
        if(this.aux >= 0){
            //EXTRACCION INFORMACION DE LA TABLA VUELO
            this.Vueloid = jTvuelos.getValueAt(aux, 0).toString();
            this.horaSalida = jTvuelos.getValueAt(aux, 1).toString();
            this.precioGeneral = Double.parseDouble(jTvuelos.getValueAt(aux, 3).toString());
            this.aux = Integer.parseInt(jTvuelos.getValueAt(aux, 2).toString());
            this.Avionid = String.valueOf(aux);
            
            //CALCULO PRECIOS CON PORCENTAJES APLICADOS AL PRECIO GENERAL
            calculoPrecios(0);
            
            //INICIO DE LA TABLA ASIENTO
            this.tabla.diseniarTabla("Id Asiento,Fila,Columna,Clase,Disponibilidad");
            this.tabla.mostrarTabla(jTasientos, "Asiento", String.valueOf(this.aux), "Asientoid,Fila,Columna,Clase,Disp", "Avionid");
            this.jTasientos.setDefaultRenderer(jTasientos.getColumnClass(0), new ColorearFilas());
            this.jTabbedPane1.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione en la tabla el vuelo y vuelva a intentarlo");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsiguientevActionPerformed

    private void jBregresarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarfActionPerformed
        this.jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jBregresarfActionPerformed

    private void jBregresarf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarf2ActionPerformed
        this.tabla.diseniarTabla("Id Asiento,Fila,Columna,Clase,Disponibilidad");
        this.tabla.mostrarTabla(jTasientos, "Asiento", this.Avionid, "Asientoid,Fila,Columna,Clase,Disp", "Avionid");
        this.jTasientos.setDefaultRenderer(jTasientos.getColumnClass(0), new ColorearFilas());
        this.jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jBregresarf2ActionPerformed

    private void jBfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBfinalizarActionPerformed

    private void jTvuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTvuelosMouseClicked
        this.aux = jTvuelos.getSelectedRow();
        this.jTFidVuelo.setText(jTvuelos.getValueAt(aux, 0).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTvuelosMouseClicked

    private void jBregresarv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarv1ActionPerformed
        this.jTabbedPane1.setSelectedIndex(1);
        this.jTFiasiento.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jBregresarv1ActionPerformed

    private void jBsiguienteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsiguienteaActionPerformed
        this.aux = jTasientos.getSelectedRow();
        
        if(this.aux >= 0){
            //COMPROBADOR PARA CONOCER SI SE ELIGIO UN ASIENTO DISPONIBLE
            this.Asientoid = jTasientos.getValueAt(aux, 0).toString();
            String comprobador = this.tabla.leerDatosAlguienExacto("Asiento", this.Asientoid, "Disp", "Asientoid")[0];
            
            if(comprobador.equals("NO")){
                JOptionPane.showMessageDialog(null, "El asiento que ha sido elegido no se encuentra disponible, por favor, elija uno en color diferente del rojo (Disponible)");
                
            } else if (this.jLcedula.getText().equals("Cedula")){
                //COMPROBADOR PARA CONOCER SI NO INGRESO UNA CUENTA
                JOptionPane.showMessageDialog(null, "Cuenta no ingresada, ingrese como cliente o registrese");
                this.jBloggin.doClick();
                
            } else {
                //MUESTRA LOS DATOS FINALES PARA PROCESAR LA COMPRA QUE RECIBIRA UNA AFIRMACION O NEGACION
                precioFinal();
                this.aux = JOptionPane.showConfirmDialog(null, "Esta seguro de adquirir el boleto con las siguientes caracteristicas:\n\n ■"
                        + this.origen + " ----> " + this.destino 
                        + "\n--Hora de salida: " + this.horaSalida
                        + "\n--Numero de avion: " + this.Avionid 
                        + "\n--Ubicacion del asiento: " + this.asiento
                        + "\n--Clase: " + this.claseAsiento
                        + "\n--PRECIO: USD " + this.precioFinal + " $$"
                        + "\n\nAl confirmar usted acepta nuestros Terminos y Condiciones, ademas se cargara valores a pagar a su cuenta", "Confirmacion", JOptionPane.YES_NO_OPTION);
                
                if(this.aux == JOptionPane.YES_OPTION){
                    imprimirBoleto();
                    //SE AÑADE EL BOLETO A LA BASE DE DATOS
                    this.agregar.agregarDato("Boleto", "Boletoid", "", 
                            "default," + this.jLcedula.getText() + "," + this.Vueloid + "," + this.Asientoid + "," + this.precioFinal);
                    
                    //EL ASIENTO QUE SE COMPRO CAMBIA SU ESTADO DE DISPONIBILIDAD
                    this.actualizar.actualizarDato("Asiento", "Disp", "NO", "Asientoid", this.Asientoid);
                    this.jTabbedPane1.setSelectedIndex(3);
                        
                }
            
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione en la tabla el asiento a su gusto y vuelva a intentarlo");
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsiguienteaActionPerformed

    private void jTasientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTasientosMouseClicked
        this.aux = jTasientos.getSelectedRow();
        //COLOCA LA UBICACION DEL ASIENTO EN EL PANEL AZUL INFERIOR
        this.asiento = jTasientos.getValueAt(aux, 2).toString() + "/" + jTasientos.getValueAt(aux, 1);
        this.claseAsiento = jTasientos.getValueAt(aux, 3).toString();
        this.jTFiasiento.setText(this.asiento);
        
        if (this.claseAsiento.equals("Economico")){
            calculoPrecios(0);
            this.JLtipoPasajero.setText("Precio (Economico)");
            this.JPprecios.setBackground(Color.green);
            
        } else if(this.claseAsiento.equals("Turista")){
            calculoPrecios(1);
            this.JLtipoPasajero.setText("Precio (Turista)");
            this.JPprecios.setBackground(Color.cyan);
            
        } else {
            calculoPrecios(2);
            this.JLtipoPasajero.setText("Precio (VIP)");
            this.JPprecios.setBackground(Color.orange);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTasientosMouseClicked

    private void jBlogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlogginActionPerformed
        if(this.login == null){
            this.login = new JFLoginUsuario(this);
            this.login.setVisible(true);
            
        } else {
            this.login.setVisible(true);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBlogginActionPerformed

    private void JBadministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBadministradorActionPerformed
        JFLoginAdministracion u = new JFLoginAdministracion();
        u.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_JBadministradorActionPerformed

    private void JBboletosAdquiridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBboletosAdquiridosActionPerformed
        if(this.jLcedula.getText().equals("Cedula")){
            JOptionPane.showMessageDialog(null, "Cuenta no ingresada, ingrese como cliente o registrese");
            this.jBloggin.doClick();
            
        } else {
            if(this.jboletos == null){
                this.jboletos = new JFboletosAdquiridos();
                this.jboletos.setVisible(true);

            } else {
                this.jboletos.setVisible(true);
                
            }
            this.jboletos.setCedula(jLcedula.getText());
            
        }
        
    }//GEN-LAST:event_JBboletosAdquiridosActionPerformed

    private void jTFiasientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFiasientoKeyTyped
    }//GEN-LAST:event_jTFiasientoKeyTyped

    private void jTFiasientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFiasientoKeyReleased
    }//GEN-LAST:event_jTFiasientoKeyReleased

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
            java.util.logging.Logger.getLogger(JFEscritorioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEscritorioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEscritorioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEscritorioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEscritorioCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBadministrador;
    private javax.swing.JButton JBboletosAdquiridos;
    private javax.swing.JComboBox<String> JCBtipoPasajero;
    private javax.swing.JLabel JLicono;
    private javax.swing.JLabel JLicono1;
    private javax.swing.JLabel JLicono2;
    private javax.swing.JLabel JLicono3;
    private javax.swing.JLabel JLicono4;
    private javax.swing.JLabel JLprecioAdulto;
    private javax.swing.JLabel JLprecioDiscapacitado;
    private javax.swing.JLabel JLprecioMayor;
    private javax.swing.JLabel JLprecioMenor;
    private javax.swing.JLabel JLprecioMenor1;
    private javax.swing.JLabel JLprecioMenor2;
    private javax.swing.JLabel JLprecioMenor3;
    private javax.swing.JLabel JLprecioMenor4;
    private javax.swing.JLabel JLtipoPasajero;
    private javax.swing.JPanel JPprecios;
    private javax.swing.JButton jBAcomprarb;
    private javax.swing.JButton jBfinalizar;
    private javax.swing.JButton jBloggin;
    private javax.swing.JButton jBregresarf;
    private javax.swing.JButton jBregresarf2;
    private javax.swing.JButton jBregresarv;
    private javax.swing.JButton jBregresarv1;
    private javax.swing.JButton jBsiguientea;
    private javax.swing.JButton jBsiguientev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLavionGrafica;
    private javax.swing.JLabel jLcaritaLike;
    private javax.swing.JLabel jLcedula;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTAfactura;
    private javax.swing.JTextField jTFiasiento;
    private javax.swing.JTextField jTFidVuelo;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTasientos;
    private javax.swing.JTable jTrecorridos;
    private javax.swing.JTable jTvuelos;
    // End of variables declaration//GEN-END:variables
}
