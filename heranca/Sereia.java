package heranca;

public class Sereia extends SerMistico {
    private static boolean caldaPeixe = true;
    private String corCabelo;

    public static boolean hasCaldaPeixe() {
        return caldaPeixe;
    }
    public static void setCaldaPeixe(boolean caldaPeixe) {
        Sereia.caldaPeixe = caldaPeixe;
    }
    public String getCorCabelo() {
        return corCabelo;
    }
    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }
    
}
