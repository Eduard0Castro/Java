package padroes.adaptador.geometria;

public class Quadrado extends Poligono{

    public Quadrado(float lado){
        super(lado);
    }

    public double area(){
        return this.getLado()*getLado();
    }


    
    
}