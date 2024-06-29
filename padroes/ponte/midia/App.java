package padroes.ponte.midia;

public class App {
    public static void main(String args []){

        Lancamento lancamento = new Lancamento();
        Normal normal = new Normal();

        Game redDeadRedemption = new Game(lancamento);
        Dvd oreileao = new Dvd(normal);

        redDeadRedemption.alocar(90.0f);
        oreileao.alocar(15.00f);

        System.out.println(redDeadRedemption.getCategoria().getTempoAlcado());
        System.out.println(oreileao.getCategoria().getTempoAlcado());






    }

}
