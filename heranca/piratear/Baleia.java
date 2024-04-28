package piratear;

public class Baleia extends SerMistico{
    private static boolean grandeNadadeira = true;
    private String cor;
    
    public static boolean isGrandeNadadeira() {
        return grandeNadadeira;
    }
    public static void setGrandeNadadeira(boolean grandeNadadeira) {
        Baleia.grandeNadadeira = grandeNadadeira;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    

}
