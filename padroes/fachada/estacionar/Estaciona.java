package padroes.fachada.estacionar;
import java.util.Date;

public class Estaciona {
    private Date entrada, saida;
    private Cliente client;
    private Vaga vaga;

    public Cliente getClient() {
        return client;
    }


    public void setClient(Cliente client) {
        this.client = client;
    }



    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    
}
