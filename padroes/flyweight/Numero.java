package padroes.flyweight;

public class Numero implements Termo{

	private double valor;
	
	@Override
	public void exibir(boolean inicio) {
		if (inicio) {
			System.out.print(". " + valor);
		} else {
			System.out.print(" " + valor);
		}		
	}
	//gets e sets

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
}
