package padroes.ponte;

public abstract class Publicacao {

    private String nome;
    private float preco;
    private Origem origem;

    public Publicacao(Origem origem){
        this.origem = origem;
    }
    
    public float tax(float value){
        return origem.getTax(value);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getPreco() {
        return preco;
    }


    public void setPreco(float preco) {
        this.preco = preco;
    }


    public Origem getOrigem() {
        return origem;
    }


    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

}
