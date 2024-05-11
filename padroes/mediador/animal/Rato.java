package padroes.mediador.animal;

public class Rato extends Animal{
    
    private boolean vivo;

    public void foge(){
        this.chamarPerseguidor();
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }


}
