package padroes.fachada.estacionar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class PararParque {

    private Cliente client;
    private Estaciona estaciona;
    private List<Vaga> vagas = new ArrayList<Vaga>();


    public int estacionar(String placa){
        client = new Cliente();
        Vaga vaga = new Vaga(); 
        estaciona = new Estaciona();

        client.setPlaca(placa);

        vaga.setNumero(new Random().nextInt(100));
        vagas.add(vaga);

        estaciona.setClient(client);
        estaciona.setVaga(vaga);
        estaciona.setEntrada(new Date());

        return vaga.getNumero();

    }


    public Cliente getClient() {
        return client;
    }


    public void setClient(Cliente client) {
        this.client = client;
    }


    public Estaciona getEstaciona() {
        return estaciona;
    }


    public void setEstaciona(Estaciona estaciona) {
        this.estaciona = estaciona;
    }


    public List<Vaga> getVagas() {
        return vagas;
    }


    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }
}
