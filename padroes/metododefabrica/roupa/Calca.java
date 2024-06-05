package padroes.metododefabrica.roupa;

public class Calca extends Roupa{
    
    private boolean hasZiper;

    protected Calca(){

    }

    public boolean hasZiperFunc(){
        return this.hasZiper;
    }

    public void setHasZiper(boolean hasZiper){
        this.hasZiper = hasZiper;
    }

}
