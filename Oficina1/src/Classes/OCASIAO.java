package Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

abstract public class OCASIAO {
    private String Nome = "";
    private String Descricao = "";
    private ArrayList<INTERESSADO> Interesse = new ArrayList<>();
    private LOCAL Localizacao = new LOCAL();
    private TAG Tags = new TAG();
    private SimpleDateFormat DataInicial = new SimpleDateFormat("HH:mm");
    private SimpleDateFormat DataFinal = new SimpleDateFormat("HH:mm");
    private SimpleDateFormat HorarioInicial = new SimpleDateFormat("HH:mm");
    private SimpleDateFormat HorarioFinal = new SimpleDateFormat("HH:mm");
/*----------------------------------------------------------------------------*/         
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public ArrayList<INTERESSADO> getInteresse() {
        return Interesse;
    }

    public void setInteresse(ArrayList<INTERESSADO> Interesse) {
        this.Interesse = Interesse;
    }

    public LOCAL getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(LOCAL Localizacao) {
        this.Localizacao = Localizacao;
    }

    public TAG getTags() {
        return Tags;
    }

    public void setTags(TAG Tags) {
        this.Tags = Tags;
    }

    public SimpleDateFormat getDataInicial() {
        return DataInicial;
    }

    public void setDataInicial(SimpleDateFormat DataInicial) {
        this.DataInicial = DataInicial;
    }

    public SimpleDateFormat getDataFinal() {
        return DataFinal;
    }

    public void setDataFinal(SimpleDateFormat DataFinal) {
        this.DataFinal = DataFinal;
    }

    public SimpleDateFormat getHorarioInicial() {
        return HorarioInicial;
    }

    public void setHorarioInicial(SimpleDateFormat HorarioInicial) {
        this.HorarioInicial = HorarioInicial;
    }

    public SimpleDateFormat getHorarioFinal() {
        return HorarioFinal;
    }

    public void setHorarioFinal(SimpleDateFormat HorarioFinal) {
        this.HorarioFinal = HorarioFinal;
    }
    
}
