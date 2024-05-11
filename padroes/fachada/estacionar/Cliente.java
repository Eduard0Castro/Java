package padroes.fachada.estacionar;

public class Cliente {
    private String nome, placa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
        System.out.println("Placa setada!");
    }

    
}
