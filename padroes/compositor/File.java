package padroes.compositor;

public class File extends Elemento{

    private float peso;

    public File (float espaco){
        peso = espaco;
    }

    public float memoria(){
        return peso;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }
    
}
