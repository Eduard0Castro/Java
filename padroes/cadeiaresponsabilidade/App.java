package padroes.cadeiaresponsabilidade;

public class App {
    public static void main(String args []){
        Carteira carteira = new Carteira();
        Nota1 notaUm = new Nota1();
        Nota2 notaDois = new Nota2();
        Nota5 notaCinco = new Nota5();
        Nota10 notaDez = new Nota10();


        carteira.setPrimeiraNota(notaCinco);

        notaCinco.setSucessor(notaDez);
        notaDois.setSucessor(notaUm);
        notaDez.setSucessor(notaDois);

        System.out.println(carteira.total());
    }
}
