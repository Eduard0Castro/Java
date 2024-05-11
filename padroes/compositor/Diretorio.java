package padroes.compositor;
import java.util.List;
import java.util.ArrayList;

public class Diretorio extends Elemento {

    private List<Elemento> elementos  = new ArrayList<Elemento>();
    
    public float memoria(){
        float soma = 0;

        for (Elemento e: elementos){
            soma += e.memoria();
        }

        return soma;
    }

    public List<Elemento> getElementos(){
        return elementos;
    }

    public void setElementos(List<Elemento> lista){
        elementos = lista;
    }
}
