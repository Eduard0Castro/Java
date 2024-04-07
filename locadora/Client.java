package locadora;

public class Client{
    private String nome;
    private int cpf, telefone;
    private Cupom cupom;

    public Client(){

    }
    
    public Client(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCpf(){
        return this.cpf;
    }

    public int getTelefone(){
        return this.telefone;
    }

    public Cupom getCupom(){
        return this.cupom;
    }

    public void setCupom(Cupom cupom){
        this.cupom = cupom;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public void rentDvd(Dvd dvd){
        cupom.addDvds(dvd);

    }
}