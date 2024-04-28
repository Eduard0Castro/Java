package associacao.dependencia.examples.ser;
import java.util.Date;

public abstract class Ser {
    private String nome, especie;
    private Date nascimento;
    private int midichlorians;
    private Ordem ordem;

    public Ser (Ordem ordem){
        this.ordem = ordem;
    }

    public Ordem getOrdem() {
        return ordem;
    }

    public void setOrdem(Ordem ordem) {
        this.ordem = ordem;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Date getNascimento(){
        return this.nascimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getMidichlorians() {
        return midichlorians;
    }

    public void setMidichlorians(int midichlorians) {
        this.midichlorians = midichlorians;
    }
}
