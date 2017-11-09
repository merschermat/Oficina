package Classes;

import Regras.AdminREGRA;

public class ADMIN extends AdminREGRA{
    private String Login = "";
    private String Senha = "";
/*----------------------------------------------------------------------------*/
    public ADMIN() {
        this.Login = "";
        this.Senha = "";
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
/*----------------------------------------------------------------------------*/  
}