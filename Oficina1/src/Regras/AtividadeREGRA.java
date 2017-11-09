package Regras;

import BD.ConnectionFactory;
import Classes.ATIVIDADE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AtividadeREGRA {
        
    public void Cadastrar(ATIVIDADE e){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Administrador (ADM_login, ADM_senha) VALUES (?, ?)");
            stmt.setString(2, e.getNome());
            stmt.setString(3, e.getDescricao());            
            stmt.setString(4, e.getDataInicial().format(e.getDataInicial()));
            stmt.setString(5, e.getDataFinal().format(e.getDataFinal()));
            stmt.setString(5, e.getHorarioInicial().format(e.getHorarioInicial()));
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar !"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    protected boolean Editar(String e){
        return false;
    }
    
    protected boolean Excluir(String e){
        return false;
    }
    
    protected boolean ExcluirTodos(){
        return false;
    }
    
    protected ArrayList<ATIVIDADE> Consultar(String e){
        return null;
    }
    
    protected ArrayList<ATIVIDADE> ConsultarTodos(){
        return null;
    }
}
