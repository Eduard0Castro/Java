package padroes.ponte;

public class App{
    public static void main(String [] args){
        Nacional nacional = new Nacional();
        Estrangeiro estrangeiro = new Estrangeiro();

        Livro todaPoesia = new Livro(nacional);
        Revista time = new Revista(estrangeiro);

        System.out.println("O imposto será de " + todaPoesia.tax(42.50f));
        System.out.println("O imposto será de " + time.tax(50.0f));
    }
}