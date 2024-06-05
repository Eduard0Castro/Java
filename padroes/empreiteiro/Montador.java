package padroes.empreiteiro;

public class Montador {
    
    private Producao producao;

    public Computador construir(){
        Computador computador = null;

        if (this.producao != null){
            computador = new Computador();
            producao.construirCPU(computador);
            producao.contruirVideo(computador);
        }

        return computador;
    }

    public Producao getProducao(){
        return this.producao;
    }

    public void setProducao(Producao producao){
        this.producao = producao;

    }
}
