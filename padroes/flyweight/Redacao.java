package padroes.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Redacao {
	private String titulo;
	private FabricaPalavra fabrica = new FabricaPalavra();
	private List<Integer> inicios = new ArrayList<>();
	private List<Termo> termos = new ArrayList<>();
	public void mostrar() {
		int i=0;
		int pos=0;
		for (Termo t : termos) {	
			t.exibir(i==inicios.get(pos));
			i++;
			if(i>inicios.get(pos)) {
				pos++;
			}
		}
		
	}
	public void novaFrase(String f) {
		String v[] = f.split(" ");
		if(inicios.size()==0) {
			inicios.add(v.length);
		}else {
			inicios.add(inicios.get(inicios.size()-1)+v.length);
		}				
		for (int i = 0; i < v.length; i++) {
			try {
				double d = Double.parseDouble(v[i]);
				Numero n = new Numero();
				n.setValor(d);
				termos.add(n);
			}catch(NumberFormatException ex){
				termos.add(fabrica.getPalavra(v[i]));
				
			}
		}
	}
	//gets e sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public FabricaPalavra getFabrica() {
		return fabrica;
	}
	public void setFabrica(FabricaPalavra fabrica) {
		this.fabrica = fabrica;
	}
	public List<Integer> getInicios() {
		return inicios;
	}
	public void setInicios(List<Integer> inicios) {
		this.inicios = inicios;
	}
	public List<Termo> getTermos() {
		return termos;
	}
	public void setTermos(List<Termo> termos) {
		this.termos = termos;
	}	
}