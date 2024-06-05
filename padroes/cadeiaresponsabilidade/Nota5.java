package padroes.cadeiaresponsabilidade;

public class Nota5 extends Nota{

    public int soma(){
        if (this.getSucessor() != null) return 5 + getSucessor().soma();
        else return 5;
    }

    
}
