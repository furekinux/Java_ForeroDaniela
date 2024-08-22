package persistencia;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class TarjetaConnection {
    
    private String tipo_tarjeta;
    
    public TarjetaConnection(){}
    
    public TarjetaConnection(String tipo_tarjeta){
        this.tipo_tarjeta=tipo_tarjeta;
    }
    
    public void readTarjetas(){
        
        ConnectToServer cn;
        try {
            
            cn = new ConnectToServer();
            Statement st;
            ResultSet rs;
            
            try {
                st=cn.con.createStatement();
                rs=st.executeQuery("select * from tarjeta where tipo='"+tipo_tarjeta+"';");
                while (rs.next()) {                
                    System.out.println("\nEl valor de la cuota de la Cuenta: "+rs.getString("numero_cuenta")+" es "+rs.getString("nombre_hospital")+"   "+rs.getString("direccion_hospital"));
                // es: $"+cuotaDeManejo()+" con tipo de tarjeta: "+this.getClass().getSimpleName()+" en el mes de: "+mes;

                
                }
                cn.con.close();
            } catch (SQLException e) {}
            
        } catch (IOException ex) {
            Logger.getLogger(TarjetaConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
