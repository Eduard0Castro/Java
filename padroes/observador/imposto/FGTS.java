package padroes.observador.imposto;

public class FGTS extends Imposto {
    
    public void atualiza(float value){
        this.value = value*0.08f;
    }
}
