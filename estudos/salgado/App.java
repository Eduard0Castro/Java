package estudos.salgado;

public class App {

	public static void main(String[] args) {
		//Coxinha c1 = new Coxinha();
		Coxinharia fab = new Coxinharia();
		Coxinha c1 = (Coxinha)fab.novoSalgado();
		c1.setRecheio(RecheioEnum.FRANGO);
		System.out.println(c1);
	}

}
