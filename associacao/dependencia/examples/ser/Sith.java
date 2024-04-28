package associacao.dependencia.examples.ser;

public class Sith extends Ordem {
    private String nomeSith;
    private float raiva;

    public String getNomeSith(){
        return this.nomeSith;
    }

    public void setNomeSith(String nomeSith){
        this.nomeSith = nomeSith;
    }

    public float getRaiva() {
        return raiva;
    }

    public void setRaiva(float raiva) {
        this.raiva = raiva;
    }
}
