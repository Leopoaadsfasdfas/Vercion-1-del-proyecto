
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");//se define el driver par la conexion
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba1","root","");//se especifica los datos de la BD
        } catch (Exception e) {
        }
    }
    public Connection getConnection(){
   //retornamos la conexion
        return con;
    }
}
