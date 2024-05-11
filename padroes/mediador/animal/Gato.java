package padroes.mediador.animal;

public class Gato extends Animal {

    private boolean fome;

    public void agarrar(){
        this.chamarPerseguidor();
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    
    
}
