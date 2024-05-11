package padroes.observador.rendimento;
import java.util.List;
import java.util.ArrayList;
import padroes.observador.imposto.Imposto;


public abstract class Rendimento {


    private List<Imposto> impostos = new ArrayList<Imposto>();
    
    protected void notifica(float v){
        for (Imposto i: impostos){
            i.atualiza(v);
        }
    }

    public List<Imposto> getImpostos() {
        return impostos;
    }
    public void setImpostos(List<Imposto> impostos) {
        this.impostos = impostos;
    }


    
}
