package padroes.metododefabrica.roupa;

public class Confeccao implements Montagem<Camisa>{
    private String cnpj;

    public Camisa fabricaRoupa(){
        return new Camisa();

    }

    public String getCNPJ(){
        return this.cnpj;
    }

    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }
}
