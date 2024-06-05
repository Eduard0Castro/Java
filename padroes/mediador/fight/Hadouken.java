package padroes.mediador.fight;

public class Hadouken implements Golpe{

    private Ken ken;
    private Ryu ryu;
    

    public Ken getKen() {
        return ken;
    }


    public void setKen(Ken ken) {
        this.ken = ken;
    }


    public Ryu getRyu() {
        return ryu;
    }


    public void setRyu(Ryu ryu) {
        this.ryu = ryu;
    }


    public void luta(){
        if (ken.getBloqueio() > 50){ken.setDano(ken.getDano() -3);}
        else ken.setDano(ken.getDano()-5);

        if (ryu.getForca() > 50) ken.setImpulso(ken.getImpulso()-3);

        if (ryu.getVitalidade() > 50) ryu.setVitalidade(ryu.getVitalidade()-3);
        else ryu.setVitalidade(ryu.getVitalidade()-5);
        
    }
    
}
