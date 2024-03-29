package championship;

public class App {
    public static void main(String args[]){
    FootballLeague brasileiro = new FootballLeague("Flamengo", "Palmeiras");
    
    brasileiro.cadastrarPartida(0, 4);
    brasileiro.cadastrarPartida(7, 0);
    brasileiro.cadastrarPartida(0, 2);
    brasileiro.cadastrarPartida(1, 1);

    brasileiro.estatiscas();

    }
}
