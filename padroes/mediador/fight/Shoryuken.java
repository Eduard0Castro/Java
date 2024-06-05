package padroes.mediador.fight;

public class Shoryuken implements Golpe{
    
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
        
        if (ryu.getDefesa() > 40) ryu.setVitalidade(ryu.getVitalidade()-2);
        else ryu.setVitalidade(ryu.getVitalidade()-4);

        if (ken.getImpulso() > 40) ryu.setForca(ryu.getForca()-4);

        if (ken.getDano() > 40) ken.setImpulso(ken.getImpulso()-2);
        else ken.setImpulso(ken.getImpulso()-4);

    }
}
