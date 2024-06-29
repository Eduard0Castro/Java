package estudos.salgado;

public class Coxinharia implements Fabrica {

	@Override
	public Salgado novoSalgado() {
		return new Coxinha();
	}

}
