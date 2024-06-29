package padroes.ponte.midia;

public class Cd extends Midia{

    private String nomeAutor;
    private int numMusica;

    
    public Cd(Categoria categoria) {
        super(categoria);
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public int getNumMusica() {
        return numMusica;
    }
    public void setNumMusica(int numMusica) {
        this.numMusica = numMusica;
    }

    
    
}
