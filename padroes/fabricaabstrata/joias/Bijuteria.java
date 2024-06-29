package padroes.fabricaabstrata.joias;

public abstract class Bijuteria {

    private float tamanho;
    private String material;


    public Bijuteria(){}


    public float getTamanho() {
        return tamanho;
    }


    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    };

    
    

    
}
