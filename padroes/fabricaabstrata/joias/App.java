package padroes.fabricaabstrata.joias;

public class App {
    public static void main(String args []){

        JoalheiroAnel joalheiro = new JoalheiroAnel();

        Ouro anel = joalheiro.newOuro();
        AnelOuro anelOuro = (AnelOuro)joalheiro.newOuro();

        Bijuteria anelBiju = joalheiro.newBijuteria();
        AnelBijuteria anelBijuTwo = (AnelBijuteria)joalheiro.newBijuteria();

        //Prints para ver que mesmo sem typecast o tipo do objeto é armazenado 
        //corretamento na memória
        System.out.println("Anel ouro sem typecast: " + anel);
        System.out.println("Anel ouro com typecast: " + anelOuro);
        System.out.println("Anel bijuteria sem typecast: " + anelBiju);
        System.out.println("Anel bijuteria com typecast: " + anelBijuTwo);

    }
}
