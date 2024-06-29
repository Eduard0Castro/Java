package padroes.recordador;

public class Endereco {
    private String logradouro;

    public Endereco (String logradouro){
        this.logradouro = logradouro;
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
}
