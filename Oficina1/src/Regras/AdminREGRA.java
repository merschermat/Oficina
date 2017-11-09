package Regras;

import BD.ConnectionFactory;
import Classes.ADMIN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminREGRA {
    
    public void Cadastrar(ADMIN e){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Administrador (ADM_login, ADM_senha) VALUES (?, ?)");
            stmt.setString(1, e.getLogin());
            stmt.setString(2, e.getSenha());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar !"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    protected void Editar(String e){
    }
       
    protected void Excluir(String e){
    }
    
    protected void Logar(ADMIN e){
    }
    
    protected ADMIN Consultar(String e){
        return null;
    }
}
