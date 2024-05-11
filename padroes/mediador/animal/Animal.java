package padroes.mediador.animal;
import padroes.mediador.perseguicao.Perseguicao;

public abstract class Animal{

    private Perseguicao perseguicao;

    public Perseguicao getPerseguicao(){
        return this.perseguicao;
    }

    public void setPerseguicao(Perseguicao perseguicao){
        this.perseguicao = perseguicao;
    }

    public void chamarPerseguidor(){
        perseguicao.perseguir();
    }


}