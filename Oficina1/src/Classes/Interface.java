package Classes;

import Regras.AdminREGRA;

public class Interface {
    public static void main(String [] args){
        ADMIN adm = new ADMIN();
        AdminREGRA admR = new AdminREGRA();
        adm.setLogin("romero");
        adm.setSenha("iron");
        admR.Cadastrar(adm);
    }
}
