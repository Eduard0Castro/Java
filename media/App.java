package media;
import java.util.Random;

public class App {

    public static void main(String args[]){
        Media andre = new Media("Andre", 10, 10);
        Random r = new Random();
        Media turma = new Media();
        System.out.println(andre.result());

        for (int i = 0; i < 40; i++){
            turma.read(String.format("Aluno%d", i+1), r.nextFloat(10f),
                       r.nextFloat(10f));
                       
            System.out.println(turma.result());
        }
    }
}