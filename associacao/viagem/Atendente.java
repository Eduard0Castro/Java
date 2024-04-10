package associacao.viagem;

public class Atendente {
    private int horaTrab;
    private Empresa empresa;
    private String nome;

    public Atendente(String nome){
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public int getHoraTrab() {
        return horaTrab;
    }
    public void setHoraTrab(int horaTrab) {
        this.horaTrab = horaTrab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
