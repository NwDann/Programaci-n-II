/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class Leer extends CRUD {
    //ATRIBUTOS
    private String[] datos;
    private DefaultTableModel model;
    private int cont;
    
    
    //CONSTRUCTORES
    public Leer(){
    }
    
    
    //METODOS
    public void diseniarTabla(String nombreColumnas){
        this.model = new DefaultTableModel();
        StringTokenizer columnas = new StringTokenizer(nombreColumnas, ",");
        this.cont = columnas.countTokens();
        while(columnas.hasMoreTokens()){
            this.model.addColumn(columnas.nextToken());      //AGREGA COLUMNAS A LA TABLA
        }
    }
    
    
    public void mostrarTabla(JTable tablaAModificar , String nombreTabla, String idOpcional, String columnasAMostrarOpcional, String key){
        //COLUMNAS DE DATOS A MOSTRAR
        this.codigo = "";
        
        if(columnasAMostrarOpcional.equals("")){
            mostrarTodasColumnas(idOpcional, nombreTabla, key);
        } else {
            mostrarCiertasColumnas(idOpcional, nombreTabla, columnasAMostrarOpcional, key);
        }
        this.datos = new String[cont];
        accesoADatos(cont);
        tablaAModificar.setModel(this.model);
    }
    
    
    public String[] leerDatosAlguienExacto(String nombreTabla, String idObligatorio, String columnasAMostrarOpcional, String key){
        this.codigo = "";
        
        if(columnasAMostrarOpcional.equals("")){
            mostrarTodasColumnas(idObligatorio, nombreTabla, key);
        } else {
            mostrarCiertasColumnas(idObligatorio, nombreTabla, columnasAMostrarOpcional, key);
        }
        StringTokenizer columnas = new StringTokenizer(columnasAMostrarOpcional, ",");
        this.cont = columnas.countTokens();
        this.datos = new String[cont];
        
        try {
            this.comando = this.conexion.createStatement();
            this.resultado = this.comando.executeQuery(this.codigo);
            if(this.resultado.next()){
                for(int i = 0; i < this.cont; i++){
                this.datos[i] = this.resultado.getString(i + 1);
            }
            }
            return datos;
        } catch (SQLException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private void mostrarCiertasColumnas(String idOpcional, String tabla, String columnasAMostrarOpcional, String key){
        this.codigo += "SELECT " + columnasAMostrarOpcional + " FROM ";
        if(idOpcional.equals("")){
            this.codigo += tabla;
        }else{
            this.codigo += tabla +" WHERE " + key + " LIKE '"+ idOpcional +"'";
        }
        
    }
    
    
    private void mostrarTodasColumnas(String idOpcional, String tabla, String key){
        this.codigo += "SELECT * FROM ";
        if(idOpcional.equals("")){
            this.codigo += tabla;
        }else{
            this.codigo += tabla +" WHERE " + key + " LIKE '"+ idOpcional +"'";
        }
        
    }
    
    
    private void accesoADatos(int cont){
        try {
            this.comando = this.conexion.createStatement();
            this.resultado = this.comando.executeQuery(this.codigo);
            while (this.resultado.next()){
                for(int i = 0; i < cont; i++){
                    this.datos[i]= this.resultado.getString(i + 1); 
                }
                this.model.addRow(datos);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion fallida");
        }               
    }
    
    
    //TABLAS DE BUSQUEDA
    public void mostrarTablaBusqueda(JTable tablaAModificar , String nombreTabla, String idOpcional, String columnasAMostrarOpcional, String key){
        //COLUMNAS DE DATOS A MOSTRAR
        this.codigo = "";
        
        if(columnasAMostrarOpcional.equals("")){
            mostrarTodasColumnasB(idOpcional, nombreTabla, key);
        } else {
            mostrarCiertasColumnasB(idOpcional, nombreTabla, columnasAMostrarOpcional, key);
        }
        this.datos = new String[cont];
        accesoADatos(cont);
        tablaAModificar.setModel(this.model);
    }
    
    
    private void mostrarCiertasColumnasB(String idOpcional, String tabla, String columnasAMostrarOpcional, String key){
        this.codigo += "SELECT " + columnasAMostrarOpcional + " FROM ";
        if(idOpcional.equals("")){
            this.codigo += tabla;
        }else{
            this.codigo += tabla +" WHERE " + key + " LIKE '%"+ idOpcional +"%'";
        }
        
    }
    
    
    private void mostrarTodasColumnasB(String idOpcional, String tabla, String key){
        this.codigo += "SELECT * FROM ";
        if(idOpcional.equals("")){
            this.codigo += tabla;
        }else{
            this.codigo += tabla +" WHERE " + key + " LIKE '%"+ idOpcional +"%'";
        }
        
    }
    
}
