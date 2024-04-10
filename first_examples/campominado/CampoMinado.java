package first_examples.campominado;

import java.util.Random;

public class CampoMinado {
	private char visual [][] = new char [10][10];
	private char gabarito [][] = new char [10][10];
	private int totalJogadas;
	private boolean fimJogo;
	
	public CampoMinado() {
		for (int i = 0; i<10;i++) {
			for (int j = 0; j<10; j++) {
				visual [i][j] = '?';
				gabarito [i][j] = ' ';
			}
		}
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			int l  = r.nextInt(10);
			int c = r.nextInt(10);
			
			if (gabarito [l][c] == ' ') {
				gabarito [l][c] = '*';
			}
			else {
				i--;
			}
		}
	}


	public void desarme (int l, int c) {
		if(!fimJogo) {
			visual[l][c] = gabarito[l][c];
			totalJogadas++;
			
			if (visual[l][c] == '*') {
				fimJogo = true;
				this.imprime();
			}
		}
		
	}
	public int getTotalJogadas() {
		return totalJogadas;
	}
	public boolean getFimJogo() {
		return fimJogo;
	}
	
	public void imprime() {
		for (int i = 0; i<10;i++) {
			for (int j = 0; j<10; j++) {
				System.out.print("[" + visual[i][j] + "]");
			}
			System.out.println();
		}
	}
}
