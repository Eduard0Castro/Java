package padroes.empreiteiro;

public class Domestico implements Producao{

    @Override
    public void construirCPU(Computador c) {
        CPU cpu = new CPU();
        cpu.setClock(2.2f);
        cpu.setHd(500.0f);
        cpu.setRam(4096.0f);

        c.setCPU(cpu);
    }


    @Override
    public void contruirVideo(Computador c) {
        c.setVideo(new Video());
        c.getVideo().setHorizontal(1920);
        c.getVideo().setPolegada(22.0f);
        c.getVideo().setVertical(1080);
    }

}
