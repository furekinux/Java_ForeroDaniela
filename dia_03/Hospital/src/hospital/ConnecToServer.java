/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author camper
 */
public class ConnecToServer {
    Connection con;

    public ConnecToServer(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            /**/
            con=DriverManager.getConnection("jdbc:mysql://bclzsd9hip6j1proyaic-mysql.services.clever-cloud.com:3306/bclzsd9hip6j1proyaic?useSSL=false","uzwx5o0vu4wtu0ti","OI8uB31cexc31UdLCabv");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error:" +e);
        }
    }
}
