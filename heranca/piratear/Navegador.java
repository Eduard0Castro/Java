package piratear;
import java.util.List;
import java.util.ArrayList;

public class Navegador extends Tripulante {

    private List<Mapa> mapas = new ArrayList<Mapa>();

    public List<Mapa> getMapas() {
        return mapas;
    }

    public void setMapas(List<Mapa> mapas) {
        this.mapas = mapas;
    }

    public void addMapa(Mapa mapa){
        mapas.add(mapa);
    }


    
}
