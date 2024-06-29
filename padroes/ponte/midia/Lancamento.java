package padroes.ponte.midia;

public class Lancamento extends Categoria{

    public Lancamento(){
        this.setTaxa(0.5f);
        this.setTempoAlcado(60);
    }


    public float calcularPreco(float precoMidia){

        return precoMidia*getTaxa();

    }
    
}
