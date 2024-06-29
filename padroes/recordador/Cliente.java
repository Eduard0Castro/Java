package padroes.recordador;

public class Cliente {
    private String nome, logradouro;

    public Endereco createEndereco(){
        return new Endereco(logradouro);
    }

    public void restauraEndereco(Endereco e){
        this.logradouro = e.getLogradouro();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    

}
