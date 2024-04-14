package heranca;

public abstract class Mapa {
    private String nome;
    private Navegador autor;

    public Navegador getAutor() {
        return autor;
    }

    public void setAutor(Navegador autor) {
        this.autor = autor;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
