
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Caciel
 */
public class Conectar {
   Connection  con; 
    
    public Connection conexion(){

          try {
            //Class.forName("com.mysql.jdbc.Driver" 
            Class.forName("org.postgresql.Driver");

    //        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5486/Crud_java","postgres","Admin123");

            System.out.println("Conexion realizada!!");
        } catch (Exception e) {
                System.err.println(e.getMessage()); 
                JOptionPane.showMessageDialog(null,"Error al conectar la base de datos " +  e.toString());
        }
          return con;

    }   
}
