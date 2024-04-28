package associacao.dependencia.examples.ser;

public class Humano extends Ser{
    private String sexo;

    
    public Humano(Ordem ordem){
        super(ordem);
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
