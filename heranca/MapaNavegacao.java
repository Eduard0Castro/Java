package heranca;
import java.util.List;
import java.util.ArrayList;

public class MapaNavegacao extends Mapa {
    private int rotas;
    private String escala;
    private List<CostaContinental> costas = new ArrayList<CostaContinental>();


    public int getRotas() {
        return rotas;
    }

    public void setRotas(int rotas) {
        this.rotas = rotas;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public List<CostaContinental> getCostas(){
        return this.costas;
    }

    public void setCostas(List<CostaContinental> costas){
        this.costas = costas;
    }





    
}
