package Regras;

import Classes.EVENTO;
import java.util.ArrayList;

public class EventoREGRA {
    
    public boolean Acessa(int Escolha, EVENTO e){        
        switch(Escolha){
            case 1:
                return Cadastrar(e);
            case 2:
                return Editar(e.getNome());
            case 3:
                return Excluir(e.getNome());
            case 4:
                return ExcluirTodos();
            default:
                break;
        }
        return false;
    }
        
    public ArrayList<EVENTO> Acessa1(int Escolha, EVENTO e){
        switch(Escolha){
            case 1:
                return Consultar(e.getNome());
            case 2:
                return ConsultarTodos();
            default:
                break;
        }
        return null;
    }
    
    protected boolean Cadastrar(EVENTO e){
        return false;
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
    
    protected ArrayList<EVENTO> Consultar(String e){
        return null;
    }
    
    protected ArrayList<EVENTO> ConsultarTodos(){
        return null;
    }
}
