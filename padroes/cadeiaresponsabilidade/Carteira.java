package padroes.cadeiaresponsabilidade;

public class Carteira {
    private Nota primeira;

    public int total(){
        return this.primeira.soma();
    }

    public Nota getPrimeiraNota(){
        return this.primeira;
    }

    public void setPrimeiraNota(Nota primeira){
        this.primeira = primeira;
    }
}

