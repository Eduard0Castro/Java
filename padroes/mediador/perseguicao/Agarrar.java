package padroes.mediador.perseguicao;
import padroes.mediador.animal.*;

public class Agarrar implements Perseguicao{

    private Gato gato;
    private Rato rato;
    public void perseguir(){
        
        gato.setFome(false);
        rato.setVivo(false);
    }

    public void setGato(Gato gato){
        this.gato = gato;
    }

    public Gato getGato(){
        return this.gato;
    }

    public void setRato(Rato rato){
        this.rato = rato;
    }

    public Rato getRato(Rato rato){
        return this.rato;
    }
}
