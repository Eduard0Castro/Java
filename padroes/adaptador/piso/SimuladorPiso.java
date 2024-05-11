package padroes.adaptador.piso;
import java.util.Scanner;
import padroes.adaptador.geometria.Hexagono;
import padroes.adaptador.geometria.Poligono;
import padroes.adaptador.geometria.Quadrado;

public class SimuladorPiso{
    public static void main(String args []){
        Poligono hexa = new Hexagono(20);
        Poligono quadrado = new Quadrado(20);
        Scanner s = new Scanner(System.in);
        double areaTotal, numPisos = 0, numPisosQuad = 0;

        System.out.println(hexa.area());
        System.out.println(quadrado.area());

        System.out.print("Digite a area total: ");
        areaTotal = s.nextDouble();
        numPisos = areaTotal/hexa.area();

        while (areaTotal > 0){
            areaTotal -= quadrado.area();
            numPisosQuad ++;

        }

        System.out.println("Numero de pisos: " + numPisos);
        System.out.println("Numero de pisos quadrados: " + numPisosQuad);

        s.close();




    }

    

}

