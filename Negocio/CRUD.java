package Negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public abstract class CRUD {
    //ATRIBUTOS
    protected Conexion cn;
    protected Connection conexion;
    protected String codigo;
    protected Statement comando;
    protected ResultSet resultado;
    protected PreparedStatement comandoAPreparar;

    
    //CONSTRUCTORES
    public CRUD(){
        this.cn = new Conexion();
        this.conexion = cn.establecerConexion();
    }
}
