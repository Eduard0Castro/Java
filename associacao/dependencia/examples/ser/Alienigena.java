package associacao.dependencia.examples.ser;

public class Alienigena extends Ser{
    private String raca;

    public Alienigena(Ordem ordem){
        super(ordem);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}