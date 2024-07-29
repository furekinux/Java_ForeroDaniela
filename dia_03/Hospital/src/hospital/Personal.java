package hospital;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Daniela Forero Ballén 1.142.714.225
 */
public class Personal {
    Scanner sc = new Scanner(System.in);
    
    public Personal(){
    }
    
    public void personal_read(){

        ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from personal;");
            while (rs.next()) {                
                System.out.println("\n["+rs.getInt("id")+"]   "+rs.getString("nombre")+"   "+rs.getString("direccion"));
            }
            cn.con.close();
        } catch (SQLException e) {}
    }
}
