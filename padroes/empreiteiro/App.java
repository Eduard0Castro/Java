package padroes.empreiteiro;

public class App {
    public static void main(String args []){
        Producao producao = new Gamer();
        Montador montador = new Montador();
        montador.setProducao(producao);

        Computador computer = montador.construir(); 

        System.out.println("RAM do computador: " + computer.getCPU().getRam());

    }
}
