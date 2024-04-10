package associacao.viagem;

public class Passageiro{
    private String nome, endereco;
    private int rg;
    private Atendente atendente;
    private Onibus onibus;
    
    public Passageiro(String nome){
        this.nome = nome;
    }

    public Passageiro(){}

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public int getRg(){
        return this.rg;
    }

    public void setRg(int rg){
        this.rg = rg;
    }

    public Atendente getAtendente(){
        return this.atendente;
    }

    public void setAtendente(Atendente atendente){
        this.atendente = atendente;
    }

    public Onibus getOnibus(){
        return this.onibus;
    }

    public void setOnibus(Onibus onibus){
        this.onibus = onibus;
    }

    public String buyTicket(int numeropoltrona){
        this.onibus.setPoltronas(numeropoltrona);
        return String.format("Nome: %s \nPoltrona: %d \nAtendente: %s \nEmpresa: %s", this.nome, 
                                        this.onibus.getPoltronas(), this.atendente.getNome(), 
                                        this.atendente.getEmpresa().getNome());
    }
}