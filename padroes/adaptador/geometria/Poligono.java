package padroes.adaptador.geometria;

public abstract class Poligono {

    private float centroX, centroY, lado;

    public abstract double area();

    public Poligono(float lado){
        this.lado = lado;
    }

    public float getCentroX(){
        return this.centroX;
    }

    public void setCentroX(float centroX){
        this.centroX = centroX;
    }

    public float getCentroY(){
        return this.centroY;
    }

    public void setCentroY(float centroY){
        this.centroY = centroY;
    }

    public float getLado(){
        return this.lado;
    }

    public void setLado(float lado){

        this.lado = lado;

    }


    
}
