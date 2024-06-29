package estudos.salgado;

public class Esfirraria implements Fabrica {

	@Override
	public Salgado novoSalgado() {
		return new Esfirra();
	}

}
