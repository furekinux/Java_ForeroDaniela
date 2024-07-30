package hospital;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela Forero Ballén 1.142.714.225
 */
public class Paciente {
    Scanner sc = new Scanner(System.in);
    
    public Paciente(){
    }
    
    public void paciente_read(){
        
        ConnecToServer cn;
        try {
            cn = new ConnecToServer();
            Statement st;
            ResultSet rs;
            try {
                st=cn.con.createStatement();
                rs=st.executeQuery("select * from paciente;");
                while (rs.next()) {

                    Date fecha_actual = new Date(System.currentTimeMillis());
                    Date fecha_nacimiento=rs.getDate("fecha_nacimiento");

                    int edad = (int)(fecha_nacimiento.getTime()-fecha_actual.getTime());

                    System.out.println(rs.getInt("id_paciente")+" "+rs.getInt("id_doctor")+" "+rs.getInt("id_pabellon"));
                    System.out.println(rs.getInt("nombres_paciente")+" "+rs.getInt("apellidos_paciente")+" "+rs.getInt("direccion")+" "+edad);
                }
                cn.con.close();
            } catch (SQLException e) {}
        } catch (IOException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
