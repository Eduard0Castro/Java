package padroes.prototipo;

public class Conserto {
    
    @SuppressWarnings("rawtypes")
    private Midia midia;

    public void reparar(){
        if (midia != null){
            midia = midia.clone();
        }
    }

    @SuppressWarnings("rawtypes")
    public Midia getMidia() {
        return midia;
    }

    public void setMidia(@SuppressWarnings("rawtypes") Midia midia) {
        this.midia = midia;
    }

    
}
