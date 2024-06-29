package padroes.ponte.midia;

public class Game extends Midia{


    public Game(Categoria categoria) {
        super(categoria);
    }

    private String nomeConsole;

    public String getNomeConsole() {
        return nomeConsole;
    }

    public void setNomeConsole(String nomeConsole) {
        this.nomeConsole = nomeConsole;
    }

    

    
}
