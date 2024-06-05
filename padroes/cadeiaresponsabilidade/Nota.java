package padroes.cadeiaresponsabilidade;

public abstract class Nota{

    private long serie;
    private Nota sucessor;

    public abstract int soma();

    public long getSerie(){
        return this.serie;
    }

    public void setSerie(long serie){
        this.serie = serie;
    }

    public Nota getSucessor(){
        return this.sucessor;
    }

    public void setSucessor(Nota sucessor){
        this.sucessor = sucessor;

    }
    
}