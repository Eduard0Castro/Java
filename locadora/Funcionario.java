package locadora;

public class Funcionario {

    private String nome, endereco, senha;
    private int telefone;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public Funcionario(){}

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    protected String getSenha(){
        return this.senha;
    }

    public int getTelefone(){
        return this.telefone;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
}
