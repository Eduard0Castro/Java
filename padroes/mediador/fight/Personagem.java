package padroes.mediador.fight;

public abstract class Personagem {
    
    private Golpe golpe;

    protected void callFight(){
        golpe.luta();
    }

    public Golpe getGolpe() {
        return golpe;
    }

    public void setGolpe(Golpe golpe) {
        this.golpe = golpe;
    }

    
}
