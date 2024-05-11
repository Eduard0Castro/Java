package padroes.fachada.main;
import padroes.fachada.estacionar.PararParque;
import java.util.Scanner;

public class ParadaAnonima {

    public static void main(String [] args){
        PararParque pp = new PararParque();
        Scanner scan = new Scanner(System.in);
        String placa;

        System.out.print("Digite a placa do carro: ");
        placa = scan.next();

        System.out.println(pp.estacionar(placa));

        scan.close();

    }
    
}
