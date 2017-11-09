package Classes;

import Regras.TagREGRA;
import java.util.ArrayList;

public class TAG extends TagREGRA{
    private String Nome = "";
/*----------------------------------------------------------------------------*/
    public TAG() {
        this.Nome = "";
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
/*----------------------------------------------------------------------------*/
    public void preencherCampos(){
        
    }
    
    public boolean Regra(TAG e, int Escolha){
        switch (Escolha){
            case 1:
                return Cadastrar(e);
            case 2:
                return Editar(e.Nome);
            case 3:
                return Excluir(e.Nome);
            default:
                break;
        }
        return false;
    }
    
    public ArrayList<TAG> Consultar(TAG e, int Escolha){
        switch (Escolha){
            case 1:
                return Consultar(e.Nome);
            case 2:
                return ConsultarTodos();
            default:
                break;
        }
        return null;
    }
}
