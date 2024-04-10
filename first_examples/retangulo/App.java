package first_examples.retangulo;

public class App {
    public static void main(String args[]){
        Retangulo re1 = new Retangulo(), re2 = new Retangulo(), re3 = new Retangulo();
        Retangulo rectangle [] = {re1, re2, re3};

        for (int i = 0; i < rectangle.length; i++){
            System.out.println("\nNew rectangle: ");
            rectangle[i].general_setter();
        }
        System.out.println();

        for (int j = 0; j < rectangle.length; j++){
            rectangle[j].imprimir();
            System.out.println();
        }
    }
}
