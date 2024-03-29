package equacao;

public class App {
    public static void main(String args[]){
        Equacao equacao = new Equacao(1, 3, -10);

        double solutions [] = new double [2];
        solutions = equacao.solution();

        for (int i = 0; i < 2; i++){
            System.out.println(solutions[i]);
        }
    }
}
