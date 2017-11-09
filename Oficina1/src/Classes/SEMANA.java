package Classes;

import Regras.SemanaREGRA;

public class SEMANA extends SemanaREGRA{
    private boolean Segunda;
    private boolean Terca;
    private boolean Quarta;
    private boolean Quinta;
    private boolean Sexta;
    private boolean Sabado;
    private boolean Domingo;
/*----------------------------------------------------------------------------*/
    public SEMANA(boolean Segunda, boolean Terca, boolean Quarta, boolean Quinta, boolean Sexta, boolean Sabado, boolean Domingo) {
        this.Segunda = Segunda;
        this.Terca = Terca;
        this.Quarta = Quarta;
        this.Quinta = Quinta;
        this.Sexta = Sexta;
        this.Sabado = Sabado;
        this.Domingo = Domingo;
    }

    public boolean isSegunda() {
        return Segunda;
    }

    public void setSegunda(boolean Segunda) {
        this.Segunda = Segunda;
    }

    public boolean isTerca() {
        return Terca;
    }

    public void setTerca(boolean Terca) {
        this.Terca = Terca;
    }

    public boolean isQuarta() {
        return Quarta;
    }

    public void setQuarta(boolean Quarta) {
        this.Quarta = Quarta;
    }

    public boolean isQuinta() {
        return Quinta;
    }

    public void setQuinta(boolean Quinta) {
        this.Quinta = Quinta;
    }

    public boolean isSexta() {
        return Sexta;
    }

    public void setSexta(boolean Sexta) {
        this.Sexta = Sexta;
    }

    public boolean isSabado() {
        return Sabado;
    }

    public void setSabado(boolean Sabado) {
        this.Sabado = Sabado;
    }

    public boolean isDomingo() {
        return Domingo;
    }

    public void setDomingo(boolean Domingo) {
        this.Domingo = Domingo;
    }
/*----------------------------------------------------------------------------*/
    public void duplicarSemana(){
        
    }    
}
