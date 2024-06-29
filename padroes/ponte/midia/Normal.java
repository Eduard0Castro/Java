package padroes.ponte.midia;

public class Normal extends Categoria{

    public Normal(){
        this.setTaxa(0.001f);
        this.setTempoAlcado(108);

    }

    public float calcularPreco(float precoMidia){
        return precoMidia*getTaxa();
    }
    
}
