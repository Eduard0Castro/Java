package padroes.empreiteiro;

public class Computador {
    private int serie;
    private CPU cpu;
    private Video video;

    public int getSerie(){
        return this.serie;
    }

    public void setSerie(int serie){
        this.serie = serie;
    }

    public CPU getCPU(){
        return this.cpu;
    }

    public void setCPU(CPU CPU){
        this.cpu = CPU;
    }

    public Video getVideo(){
        return this.video;
    }

    public void setVideo(Video video){
        this.video = video;
    }
}


