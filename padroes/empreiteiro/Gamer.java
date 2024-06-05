package padroes.empreiteiro;

public class Gamer implements Producao{

    public void construirCPU(Computador c){
        CPU cpu = new CPU();
        cpu.setClock(3.2f);
        cpu.setHd(1000.0f);
        cpu.setRam(8192.0f);

        c.setCPU(cpu);
    }

    public void contruirVideo(Computador c ){
        c.setVideo(new Video());
        c.getVideo().setHorizontal(3840);
        c.getVideo().setPolegada(32.0f);
        c.getVideo().setVertical(2160);


    }
}
