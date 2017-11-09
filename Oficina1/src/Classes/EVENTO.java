package Classes;

import Regras.EventoREGRA;

public class EVENTO extends OCASIAO{
    EventoREGRA e;
    EVENTO a = new EVENTO();
    public void test(){
        e.Acessa(1,a);
    }
}
