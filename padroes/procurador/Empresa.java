package padroes.procurador;

public class Empresa {
    private String cnpj;
    private float capital;
    private Banco banco;

    public boolean pedirEmprestimo(float value){

        if (banco != null && banco.emprestimo(value)){
            capital += value;
            return true;
        }

        else return false;

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    
}
