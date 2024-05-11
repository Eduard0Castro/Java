package padroes.observador.imposto;

public abstract class Imposto {

    protected float value;
    public abstract void atualiza(float value);

    public float getValue(){
        return this.value;
    }


    
}
