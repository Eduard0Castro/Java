package padroes.fabricaabstrata.joiasCrtp;

public abstract class Ouro extends Material{
    private int quilate;

    public Ouro(){};



    public int getQuilate(){
        return this.quilate;
    }

    public void setQuilate(int quilate) {
        this.quilate = quilate;
    }

    
    
}
