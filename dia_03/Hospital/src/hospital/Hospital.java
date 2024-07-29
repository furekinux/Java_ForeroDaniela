package hospital;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Daniela Forero Ballén 1.142.714.225
 */
public class Hospital {
    
    Scanner sc = new Scanner(System.in);
    
    public Hospital(){
    }
    
    public void hospital_read(){

        ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from hospital;");
            while (rs.next()) {                
                System.out.println("\n["+rs.getInt("id_hospital")+"]   "+rs.getString("nombre_hospital")+"   "+rs.getString("direccion_hospital"));
            }
            cn.con.close();
        } catch (SQLException e) {}
    }
    
    public void hospital_create(){
        String nombre_hospital;
        String direccion_hospital;
        System.out.println("\n------ Ingrese los siguientes datos para el nuevo hospital ------");
                                
        System.out.println("Nombre del Hospital:");
        nombre_hospital=sc.nextLine();
                                
        System.out.println("\nDirección del Hospital:");
        direccion_hospital=sc.nextLine();
        
        ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        PreparedStatement ps;
        
        try {
            ps=cn.con.prepareStatement("insert into hospital(nombre_hospital,direccion_hospital) values(?,?);");
            ps.setString(1, nombre_hospital);
            ps.setString(2, direccion_hospital);
            ps.executeUpdate();
            cn.con.close();

            System.out.println("\nSe ingresó el hospital correctamente.");
            
            Hospital hospital= new Hospital();
            hospital.hospital_read();
            
        } catch (SQLException e) {
            System.out.println("No se ingresó el hospital, vuelva a intentarlo.");
        }
        
        
    }
    
    public void hospital_read_especific(int id_hospital){
        ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from hospital where id="+id_hospital+";");
            while (rs.next()) {                
                System.out.println(rs.getInt("id_hospital")+" "+rs.getString("nombre_hospital")+" "+rs.getString("direccion_hospital"));
            }
            cn.con.close();
        } catch (SQLException e) {}
    }
}
