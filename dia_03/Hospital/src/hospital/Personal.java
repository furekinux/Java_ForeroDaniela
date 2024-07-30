package hospital;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela Forero Ballén 1.142.714.225
 */
public class Personal {
    Scanner sc = new Scanner(System.in);
    
    public Personal(){
    }
    
    public void personal_read(){

        ConnecToServer cn;
        try {
            cn = new ConnecToServer();
            Statement st;
            ResultSet rs;
            
            try {
                st=cn.con.createStatement();
                
                rs=st.executeQuery("SELECT id_personal, nombres_personal, apellidos_personal, nombre_departamento"
                        + " FROM personal "
                        + "INNER JOIN departamento USING(id_departamento);");
                
                while (rs.next()) {                
                    System.out.println("\n["+rs.getInt("id_personal")+"]   "+rs.getString("nombres_personal")+"   "+rs.getString("apellidos_personal")
                    +"   Departamento: "+rs.getString("nombre_departamento"));
                }
                cn.con.close();
            } catch (SQLException e) {}
        } catch (IOException ex) {
            Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
