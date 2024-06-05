package padroes.flyweight;


public class Palavra implements Termo {

	private String letras;

	protected Palavra() {}

	@Override
	public void exibir(boolean inicio) {
		if (inicio) {
			System.out.print(". " + 
				Character.toUpperCase(letras.charAt(0)) + letras.substring(1));
		} else {
			System.out.print(" "+ letras);
		}
	}
	//gets e sets
	public String getLetras() {
		return letras;
	}

	public void setLetras(String letras) {
		this.letras = letras;
	}
	
	

}