package Regras;
import Classes.LOCAL;
import java.util.ArrayList;

public class LocalREGRA {
    
    protected boolean Cadastrar(LOCAL e){
        return true;
    }
    
    protected boolean Editar(int e){
        return true;
    }
        
    protected boolean Excluir(int e){
        return true;
    }
    
    protected ArrayList<LOCAL> Consultar(int e){
        return null;
    }
    
    protected ArrayList<LOCAL> ConsultarTodos(){
        return null;
    }
}
