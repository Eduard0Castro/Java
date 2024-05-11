package padroes.observador.imposto;

public class IRRF extends Imposto{
    
    public void atualiza(float value){
        this.value = value*0.20f;
    }

}
