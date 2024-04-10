package first_examples.estoque;
import java.util.Scanner;

public class App{
    public void main(String args[]){
        Estoque compras = new Estoque();
        String codigo;
        int quant = 0;
        Scanner s = new Scanner(System.in);
        String vontade = "";

        //compras.comprar("1", 50);
        //compras.comprar("3", 20);
        //compras.comprar("2", 25);

        while (true){
            System.out.print("Gostaria de comprar?[S/N]: ");
            vontade = s.next();
            vontade = vontade.toUpperCase();
            System.out.println(vontade);

            if (vontade.charAt(0) == 'N'){
                break;
            }

            else if (vontade.charAt(0) == 'S'){
                System.out.print("Digite o codigo do produto para comprar: ");
                codigo = s.next();
                System.out.print("Digite a quantidade do produto a comprar: ");
                quant = s.nextInt();
                compras.comprar(codigo, quant);
            }

        }

        compras.finalizar();
        s.close();
    }
}