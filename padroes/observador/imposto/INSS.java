package padroes.observador.imposto;

public class INSS extends Imposto{
    

    public void atualiza(float value){
        this.value = value*0.14f;
    }
}
