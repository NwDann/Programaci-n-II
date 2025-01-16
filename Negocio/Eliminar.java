
package Negocio;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Eliminar extends CRUD {
    //ATRIBUTOS
    
    
    //CONSTRUCTORES
    public Eliminar(){
        
    }
    
    
    //METODOS
    public void eliminarRegistro(String nombreTabla, String nombreDatoClave, String datoReferencial){
        try {
            this.codigo = "DELETE FROM " + nombreTabla + " WHERE " + nombreDatoClave + " = ?";
            this.comandoAPreparar = this.conexion.prepareStatement(this.codigo);
            this.comandoAPreparar.setString(1, datoReferencial);
            this.comandoAPreparar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            
        } catch (SQLException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar eliminarlo");
        }
    }
    
    
    public void eliminarTodoRegistroDeTabla(String nombreTabla){
        try {
            this.codigo = "TRUNCATE + ?";
            this.comandoAPreparar = this.conexion.prepareStatement(codigo);
            JOptionPane.showMessageDialog(null, "Todo registro de la tabla " + nombreTabla + "eliminado correctamente");
            
        } catch (SQLException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar eliminarlo");
        }
    }
    
}
