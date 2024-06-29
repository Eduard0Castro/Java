package padroes.ponte.midia;

public abstract class Categoria {
    private int tempoAlcado;
    private float taxa;

    public abstract float calcularPreco(float precoMidia);

    public int getTempoAlcado() {
        return tempoAlcado;
    }

    public void setTempoAlcado(int tempoAlcado) {
        this.tempoAlcado = tempoAlcado;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    
}
