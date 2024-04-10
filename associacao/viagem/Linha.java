package associacao.viagem;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Linha {
    private String nome;
    private LocalTime duracao;
    private List<Rodoviaria> rodoviarias = new ArrayList<Rodoviaria>();
    private List<LocalTime> horariosRodo = new ArrayList<LocalTime>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalTime getDuracao() {
        return duracao;
    }
    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }
    public List<Rodoviaria> getRodoviarias() {
        return this.rodoviarias;
    }
    public void setRodoviarias(List<Rodoviaria> rodoviarias) {
        this.rodoviarias = rodoviarias;
    }
    public List<LocalTime> getHorariosRodo() {
        return horariosRodo;
    }
    public void setHorariosRodo(List<LocalTime> horariosRodo) {
        this.horariosRodo = horariosRodo;
    }

}
