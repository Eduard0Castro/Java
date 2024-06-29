package padroes.fabricaabstrata.joias;

public class AnelOuro extends Ouro{

    private String pedra;
    private int totalPedras;

    
    protected AnelOuro(){

    }


    public String getPedra() {
        return pedra;
    }


    public void setPedra(String pedra) {
        this.pedra = pedra;
    }


    public int getTotalPedras() {
        return totalPedras;
    }


    public void setTotalPedras(int totalPedras) {
        this.totalPedras = totalPedras;
    }

    

}
