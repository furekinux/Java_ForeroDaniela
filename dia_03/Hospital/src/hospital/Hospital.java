/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author camper
 */
public class Hospital {
    
    public Hospital(){
    }
    
    public void hospital_read(String nombre_hospital,String direccion_hospital){
        ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("insert into hospital(nombre,direccion) values("+nombre_hospital+","+direccion_hospital+");");
            cn.con.close();
            System.out.println("Se ingresó el hospital correctamente.");
        } catch (SQLException e) {
            System.out.println("Nos se ingresó el hospital, vuelva a intentarlo.");
        }
    }
    
    public void hospital_create(String nombre_hospital,String direccion_hospital){
        ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("insert into hospital(nombre,direccion) values("+nombre_hospital+","+direccion_hospital+");");
            cn.con.close();
            System.out.println("Se ingresó el hospital correctamente.");
        } catch (SQLException e) {
            System.out.println("Nos se ingresó el hospital, vuelva a intentarlo.");
        }
        
        hospital_read_especific(nombre_hospital,direccion_hospital);
    }
    
    public void hospital_read_especific(String nombre_hospital,String direccion_hospital){
        ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from hospital where nombre="+nombre_hospital+" and direccion="+direccion_hospital+";");
            while (rs.next()) {                
                System.out.println(rs.getInt("id")+" "+rs.getString("nombre"));
            }
            cn.con.close();
        } catch (SQLException e) {}
    }
}
