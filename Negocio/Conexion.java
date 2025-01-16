package Negocio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conectar = null;
    String bd = "bd_grupo3";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection establecerConexion(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, "root", "Ositogominola2012");
        }
        catch(SQLException e){
        }   
        return conectar;
    }

}
