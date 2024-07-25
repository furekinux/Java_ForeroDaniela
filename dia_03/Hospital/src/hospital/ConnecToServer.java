/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author camper
 */
public class ConnecToServer {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Connection conn = null;
        try {
            
            DriverManager.registerDriver(new com.mysql.jdbc.SQLServerDriver());

            String dbURL = "jdbc:mysql://clever-host:3306/bclzsd9hip6j1proyaic-mysql.services.clever-cloud.com";
            String user = "uzwx5o0vu4wtu0ti";
            String pass = "OI8uB31cexc31UdLCabv";
            conn = DriverManager.getConnection(dbURL, user, pass);
            
            if (conn != null) {
                System.out.println("The connection has been successfully established.");
                
                DatabaseMetaData dm = conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }

        } catch (SQLException ex) {
            System.out.println("An error occurred while establishing the connection:");
            ex.printStackTrace();
        } finally {
            try {
           
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    }
    
}
