package padroes.cadeiaresponsabilidade;

public class Nota2 extends Nota{


    public int soma(){

        if(this.getSucessor() != null) return 2 + getSucessor().soma();
        else return 2;

    }


}