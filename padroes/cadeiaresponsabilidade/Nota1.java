package padroes.cadeiaresponsabilidade;

public class Nota1 extends Nota{
    
    public int soma(){
        if (getSucessor() != null) return 1 + this.getSucessor().soma();
        else return 1;
    }
}
