package padroes.cadeiaresponsabilidade;

public class Nota10  extends Nota{

    public int soma(){
        if(this.getSucessor() != null) return 10 + getSucessor().soma();
        else return 10;
    }
    

    
}
