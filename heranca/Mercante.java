package heranca;

import java.util.List;
import java.util.ArrayList;

public class Mercante extends Navio{
    private static String velocidade;
    private float capacidadeTransporte;
    private List<Produto> produtos = new ArrayList<Produto>();


    public Mercante(String nome){
        super(nome);
    }

    public static String getVelocidade() {
        return velocidade;
    }
    public static void setVelocidade(String velocidade) {
        Mercante.velocidade = velocidade;
    }
    public float getCapacidadeTransporte() {
        return capacidadeTransporte;
    }
    public void setCapacidadeTransporte(float capacidadeTransporte) {
        this.capacidadeTransporte = capacidadeTransporte;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
