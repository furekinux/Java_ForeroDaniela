/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camper
 */
public class Departamento {
    public Departamento(){
    }
    
    public void departamento_read(){

        ConnecToServer cn;
        try {
            cn = new ConnecToServer();
            Statement st;
            ResultSet rs;
            try {
                st=cn.con.createStatement();
                rs=st.executeQuery("SELECT id_departamento,nombre_departamento,nombre_hospital"
                    + " FROM departamento "
                    + "INNER JOIN hospital USING(id_hospital);");
                while (rs.next()) {                
                    System.out.println("\n["+rs.getInt("id_departamento")+"]   "+rs.getString("nombre_departamento")+"   Hospital "+rs.getString("nombre_hospital"));
                }
                cn.con.close();
            } catch (SQLException e) {}
        } catch (IOException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}