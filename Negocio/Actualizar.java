/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.sql.SQLException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Actualizar extends CRUD {
    //ATRIBUTOS
    private int cont;
    

    //CONSTRUCTORES
    public Actualizar() {
    }


    //METODOS
    public void actualizarDato(String nombreTabla, String nombreExactoDatosAIngresar, String datosActualizados, String primaryKey, String key){
        try {
            modificarCodigo(nombreTabla, nombreExactoDatosAIngresar, datosActualizados, primaryKey, key);
            this.comando = this.conexion.createStatement();
            this.comando.execute(this.codigo);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al intentar actualizar datos");
        }
    }
    
    
    private void modificarCodigo(String nombreTabla, String nombreExactoDatosAIngresar, String datosActualizados, String primaryKey, String key){
        this.codigo = "UPDATE " + nombreTabla + " SET ";
        StringTokenizer nombreExacto = new StringTokenizer(nombreExactoDatosAIngresar, ",");
        StringTokenizer datosAct = new StringTokenizer(datosActualizados, ",");
        this.cont = datosAct.countTokens();
        for(int i = 0; i < this.cont; i++){
            this.codigo += nombreExacto.nextToken() + " = '" + datosAct.nextToken() + "'" + (i == this.cont - 1?" ":", ");
        }
        this.codigo += " WHERE " + primaryKey + " = '" + key + "'";
    }
    
}