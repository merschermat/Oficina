package Classes;

import Regras.InteressadoREGRA;
import java.util.ArrayList;

public class INTERESSADO extends InteressadoREGRA{
    private int RA = 0;
/*----------------------------------------------------------------------------*/
    public INTERESSADO() {
        this.RA = 0;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
/*----------------------------------------------------------------------------*/
    public void validarRA(){
        
    }
    
    public boolean Regra(INTERESSADO e, int Escolha){
        switch(Escolha){
            case 1:
                return Cadastrar(e);
            case 2:
                return Excluir(e);
            default:
                break;
        }
        return false;
    }
    
    public ArrayList<INTERESSADO> Consultar(){
        return ConsultarTodos();
    }
}
