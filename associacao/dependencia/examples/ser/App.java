package associacao.dependencia.examples.ser;

public class App {
    public static void main(String args[]){

        Sith maldoso = new Sith();        

        //Devo passar a ordem para o construtor(o objeto depende da Ordem):
        Alienigena vilgax = new Alienigena(maldoso);
        vilgax.setNome("Vilgax");
        maldoso.setNomeSith("Maldoso");
        maldoso.setTelepatia(true);

        boolean hasTelepaty = vilgax.getOrdem().isTelepatia();
        System.out.println(hasTelepaty);


    }
}
