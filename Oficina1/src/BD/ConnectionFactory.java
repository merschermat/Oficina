package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
        
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/eae_utfpr?useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "irongabriel";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão ao BD", ex);
        }   
    }
    
    public static void closeConnection(Connection con){
        
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException ex){
            throw new RuntimeException("Erro na finalização ao BD", ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){  //importação feita por mim, pode da erro
        
        closeConnection(con);
        
        try {
            if(stmt != null){
                stmt.close();
            }
        } catch (SQLException ex){
            throw new RuntimeException("Erro na finalização ao BD", ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){  //importação feita por mim, pode da erro
        
        closeConnection(con, stmt);
        
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException ex){
            throw new RuntimeException("Erro na finalização ao BD", ex);
        }
    }
}
