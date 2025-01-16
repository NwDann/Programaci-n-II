package Negocio;


import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class Agregar extends CRUD {
    //ATRIBUTOS
    private int cont;
    
    
    //CONSTRUCTORES
    public Agregar() {
    }

    
    //METODOS
    public boolean agregarDato(String nombreTabla, String primaryKey, String idDelDatoAIngresar, String datosAingresar){
        try {
            this.codigo = "";
            this.comando = conexion.createStatement();
            this.codigo = "SELECT * FROM " + nombreTabla + " WHERE " + primaryKey + " LIKE '" + idDelDatoAIngresar + "'";
            this.resultado = comando.executeQuery(this.codigo);
            
            if(resultado.next()){
                return false;
                
                
            } else {
                modificarCodigo(datosAingresar, nombreTabla);
                this.comando = this.conexion.createStatement();
                this.comando.execute(this.codigo);
                return true;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    private void modificarCodigo(String datosAIngresar, String tabla) {
        StringTokenizer st = new StringTokenizer(datosAIngresar, ",");
        this.cont = st.countTokens();
        this.codigo = "INSERT INTO " + tabla + " VALUES  (";
        for(int i = 0; i < this.cont; i++){
            String comprobador = st.nextToken();
            if(comprobador.equalsIgnoreCase("default")){
                this.codigo += "default" + (i == this.cont - 1?")":", ");
            } else {
                this.codigo += "'" + comprobador + "'" + (i == this.cont - 1?")":", ");
            }
        }
    }
    
}
