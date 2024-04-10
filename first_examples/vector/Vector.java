package first_examples.vector;

import java.util.Scanner;

public class Vector{
    private int va[] = new int [10];
    private int vb[] = new int [10];
    private int vc[] = new int [10];
    private Scanner s = new Scanner(System.in);

    public void insert(){
        for (int i = 0; i < 10; i++){
            System.out.print("Posicao " + i + " :");
            va[i] = s.nextInt();
            
        }

        for (int j = 0; j < 10; j++){
            System.out.print("Posicao " + j + " :");
            vb[j] = s.nextInt();

        }
    }

    public int [] subtract(){
        for (int i = 0; i < 10; i++){
            vc[i] = va[i] - vb[i];

        }

        return this.vc;
    }

    public void imprime(){
        for (int i = 0; i < 10; i++){
            System.out.print(vc[i] + " ");
        }
    }


}