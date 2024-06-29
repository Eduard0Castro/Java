package padroes.fabricaabstrata.joias;

public abstract class Ouro {
    private float tamanho;
    private int quilate;

    public Ouro(){};

    public float getTamanho(){
        return this.tamanho;
    }

    public int getQuilate(){
        return this.quilate;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuilate(int quilate) {
        this.quilate = quilate;
    }

    
    
}
