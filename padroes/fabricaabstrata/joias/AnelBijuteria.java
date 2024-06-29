package padroes.fabricaabstrata.joias;

public class AnelBijuteria extends Bijuteria{


    private String pedras;
    private int totalPedras;

    protected AnelBijuteria(){}


    public String getPedras() {
        return pedras;
    }
    public void setPedras(String pedras) {
        this.pedras = pedras;
    }
    public int getTotalPedras() {
        return totalPedras;
    }
    public void setTotalPedras(int totalPedras) {
        this.totalPedras = totalPedras;
    }

    
}
