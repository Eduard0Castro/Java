package padroes.fabricaabstrata.joiasCrtp;

public class App {
    public static void main(String args []){

        //Com programação genérica é possível instanciar os objetos sem 
        //Typecasting

        JoalheiroAnel joalheiro = new JoalheiroAnel();

        AnelOuro anelOuro = joalheiro.newOuro();
        AnelBijuteria anelBijuTwo = joalheiro.newBijuteria();

        System.out.println("Anel ouro sem typecast: " + anelOuro);
        System.out.println("Anel bijuteria sem typecast: " + anelBijuTwo);
        

    }
}
