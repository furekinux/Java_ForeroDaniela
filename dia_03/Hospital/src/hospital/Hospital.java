package hospital;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author camper
 */
public class Hospital {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ConnecToServer cn=new ConnecToServer();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from hospital;");
            while (rs.next()) {                
                System.out.println(rs.getInt("id"));
            }
            cn.con.close();
        } catch (SQLException e) {}
        
        boolean menu = true;
        Scanner sc = new Scanner(System.in);
        
        while(menu){
            System.out.println("------ Menú Principal ------");
            System.out.println("Bienvenido, ¿Qué acción desea realizar?\n");
            int a = sc.nextInt();
            switch (a) {
                case 1->
                    System.out.println("--------- Menú Principal ---------\nBienvenido, ¿Qué acción desea realizar?");
                
                default->
                    System.out.println("--- No se reconoció la solucitud ---\n");
            }
        }
    }
    
}
