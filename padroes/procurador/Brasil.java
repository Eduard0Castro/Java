package padroes.procurador;

public class Brasil implements Banco{

    private Central central;

    public boolean emprestimo(float value){
        if (central!= null)
            return central.emprestimo(value);

        else return false;
    }

    public Central getCentral(){
        return this.central;
    }

    public void setCentral(Central central){
        this.central = central;
    }
}
