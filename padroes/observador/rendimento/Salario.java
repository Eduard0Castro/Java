package padroes.observador.rendimento;

public class Salario extends Rendimento{

    private float mensal;

    public float getMensal(){
        return this.mensal;
    }
    
    public void setMensal(float value){
        this.mensal = value;
        this.notifica(value);
        
    }
}
