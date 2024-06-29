package padroes.prototipo;

public class Jogo extends Midia<Jogo>{

    private String fabricante, console;

    public Jogo clone(){
        Jogo jogo = new Jogo();

        jogo.setTitulo(this.getTitulo());
        jogo.fabricante = this.fabricante;
        jogo.console = this.console;

        return jogo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
    
}
