package padroes.adaptador.geometria;
import padroes.adaptador.colmeia.FavoMel;

public class Hexagono  extends Poligono{

    private FavoMel favo;

    public Hexagono(float lado){
        super(lado);
        favo = new FavoMel(lado);
    }


    public double area(){

        return favo.superficie();
    }        
    
}
