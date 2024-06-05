package padroes.mediador.fight;

public class App {
    public static void main(String args []){
        Hadouken hadouken = new Hadouken();
        Shoryuken shoryuken = new Shoryuken();

        Ken ken = new Ken();
        Ryu ryu = new Ryu();

        ken.setGolpe(shoryuken);
        ryu.setGolpe(hadouken);

        hadouken.setKen(ken);
        hadouken.setRyu(ryu);
        shoryuken.setKen(ken);
        shoryuken.setRyu(ryu);

        ken.callFight();
        System.out.println(String.format("Ryu vitalidade: %d \nRyu força: %d \nKen Impulso: %d",
                                        ryu.getVitalidade(), ryu.getForca(), ken.getImpulso()));

        ryu.callFight();
        System.out.println(String.format("Ken dano: %d \nKen impulso: %d \nRyu vitalidade: %d",
                                        ken.getDano(), ken.getImpulso(), ryu.getVitalidade()));



    }
}
