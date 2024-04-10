package first_examples.campominado;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CampoMinado c = new CampoMinado();
		while(!c.getFimJogo()) {
			c.imprime();
			
			System.out.print("linha: ");
			int lin = s.nextInt();
			System.out.print("coluna: ");

			int col = s.nextInt();
			c.desarme(lin, col);
		}
		s.close();
	}

}
