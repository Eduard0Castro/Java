package padroes.ponte.midia;

public class SuperLancamento extends Categoria{

    
    public SuperLancamento(){
        this.setTaxa(0.01f);
        this.setTempoAlcado(24);
    }

    public float calcularPreco(float precoMidia){
        return precoMidia*getTaxa();
        
    }
    
}
