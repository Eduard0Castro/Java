package padroes.adaptador.colmeia;

public class FavoMel {
    private float ladoParede;

    public FavoMel(float lado){
        this.ladoParede = lado;
    }

    public float getLadoParede() {
        return ladoParede;
    }

    public void setLadoParede(float ladoParede) {
        this.ladoParede = ladoParede;
    }

    public double superficie(){
        return (6*Math.pow(ladoParede, 2)*Math.sqrt(3)/4);
    }
}
