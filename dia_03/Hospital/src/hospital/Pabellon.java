/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author camper
 */
public class Pabellon {
    Scanner sc = new Scanner(System.in);
    
    public Pabellon(){
    }
    
    public void pabellon_read(){

        ConnecToServer cn;
        try {
            cn = new ConnecToServer();
            Statement st;
            ResultSet rs;
            try {
//                rs=st.executeQuery("SELECT id_departamento,nombre_departamento,nombre_hospital"
//                    + " FROM departamento "
//                    + "INNER JOIN hospital USING(id_hospital);");
                
                st=cn.con.createStatement();
                rs=st.executeQuery("SELECT id_pabellon,nombre_pabellon,capacidad,ubicacion,nombre_hospital"
                        + " FROM pabellon"+
                        " INNER JOIN hospital USING(id_hospital);");
                while (rs.next()) {                
                    System.out.println("\n["+rs.getInt("id_pabellon")+"]   "+rs.getString("nombre_pabellon")+
                        "   Capacidad disponible: "+rs.getInt("capacidad")+" pacientes   "+rs.getString("ubicacion")+"   Hospital "+rs.getString("nombre_hospital"));
                }
                cn.con.close();
            } catch (SQLException e) {}
        } catch (IOException ex) {
            Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
