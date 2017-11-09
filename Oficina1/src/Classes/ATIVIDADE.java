package Classes;

import java.util.ArrayList;
import Regras.AtividadeREGRA;

public class ATIVIDADE extends OCASIAO{
    AtividadeREGRA e;
    ATIVIDADE a = new ATIVIDADE();
    private ArrayList<SEMANA> Dia = new ArrayList<>();
/*----------------------------------------------------------------------------*/
    public ATIVIDADE() {
        this.Dia = null;
    }

    public ArrayList<SEMANA> getDia() {
        return Dia;
    }

    public void setDia(ArrayList<SEMANA> Dia) {
        this.Dia = Dia;
    }
/*----------------------------------------------------------------------------*/  
}
