package padroes.flyweight;


import java.util.HashMap;

public class FabricaPalavra {

	private HashMap<String, Palavra> palavras = new HashMap<>();
	
	public Palavra getPalavra(String v) {
		Palavra p = palavras.get(v);
		if(p==null) {
			p=new Palavra();
			p.setLetras(v);
			palavras.put(v, p);
		}
		return p;			
	}
	//gets e sets

	public HashMap<String, Palavra> getPalavras() {
		return palavras;
	}

	public void setPalavras(HashMap<String, Palavra> palavras) {
		this.palavras = palavras;
	}
	
}

