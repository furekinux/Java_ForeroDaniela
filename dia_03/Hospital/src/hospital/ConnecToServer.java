package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniela Forero Ballén 1.142.714.225
 */
public class ConnecToServer {
    Connection con;

    public ConnecToServer(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            /**/
            String port="3306";
            String direccion="bclzsd9hip6j1proyaic-mysql.services.clever-cloud.com";
            String base_datos="bclzsd9hip6j1proyaic";
            
            con=DriverManager.getConnection("jdbc:mysql://"+direccion+":"+port+"/"+base_datos+"?useSSL=false","uzwx5o0vu4wtu0ti","OI8uB31cexc31UdLCabv");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error:" +e);
        }
    }
}
