package Classes;

import Regras.LocalREGRA;
import java.util.ArrayList;

public class LOCAL extends LocalREGRA {   
    private int IDBloco = 0;
    private int IDSala = 0;
    private String Outro = "";
/*----------------------------------------------------------------------------*/
    public LOCAL() {
        this.IDBloco = 0;
        this.IDSala = 0;
        this.Outro = "";
    }

    public int getIDBloco() {
        return IDBloco;
    }

    public void setIDBloco(int IDBloco) {
        this.IDBloco = IDBloco;
    }

    public int getIDSala() {
        return IDSala;
    }

    public void setIDSala(int IDSala) {
        this.IDSala = IDSala;
    }

    public String getChar() {
        return Outro;
    }

    public void setChar(String Char) {
        this.Outro = Char;
    }
/*----------------------------------------------------------------------------*/    
    public void preencherCampos(){
        
    }
    
    public boolean Regra(LOCAL e, int Escolha){
        switch (Escolha){
            case 1:
                return Cadastrar(e);
            case 2:
                return Editar(e.IDSala);
            case 3:
                return Excluir(e.IDSala);
            default:
                break;
        }
        return false;
    }
    public ArrayList<LOCAL> Consultar(LOCAL e, int Escolha){
        switch (Escolha){
            case 1:
                return Consultar(e.IDSala);
            case 2:
                return ConsultarTodos();
            default:
                break;
        }
        return null;
    }
}
