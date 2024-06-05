package padroes.metododefabrica.roupa;

public class Camisa extends Roupa{

    private boolean mangaCurta;

    protected Camisa(){

    }

    public boolean isMangaCurta() {
        return mangaCurta;
    }

    public void setMangaCurta(boolean mangaCurta) {
        this.mangaCurta = mangaCurta;
    }


}
