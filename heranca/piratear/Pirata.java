package piratear;

public class Pirata extends Navio{

    private int canhoes;

    public Pirata(String nome){
        super(nome);
    }

    public int getCanhoes(){
        return this.canhoes;
    }

    public void setCanhoes(int canhoes){
        this.canhoes = canhoes;
    }

    public void setAll(String cidadeConstrucao, float tamanho, int mastros, int velas, int canhoes){
        super.setAll(cidadeConstrucao, tamanho, mastros, velas);
        this.canhoes = canhoes;
    }
    
}
