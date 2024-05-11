package padroes.mediador;
import padroes.mediador.perseguicao.*;
import padroes.mediador.animal.*;

public class App {
    public static void main(String args[]){

        Agarrar agarra = new Agarrar();
        Foge foge = new Foge();
        Gato gato = new Gato();
        Rato rato = new Rato();

        agarra.setGato(gato);
        agarra.setRato(rato);
        foge.setGato(gato);
        foge.setRato(rato);
        gato.setPerseguicao(agarra);
        rato.setPerseguicao(foge);

        gato.chamarPerseguidor();
        System.out.println(gato.isFome());

        rato.chamarPerseguidor();
        System.out.println(rato.isVivo());

    }
}
