package persistencia;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectToServer {
    Connection con;
    
    public ConnectToServer() throws IOException{
        Properties props = new Properties();
        try(InputStream input = getClass().getClassLoader().getResourceAsStream("Config.properties")) {
            
            if(input == null){
                throw new IllegalStateException("Archivo no existente :(");
            }
            
            props.load(input);
            
            String URL=props.getProperty("url");
            String USER=props.getProperty("user");
            String PSWRD=props.getProperty("password");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con=DriverManager.getConnection(URL,USER,PSWRD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error:" +e);
        }
    }
}