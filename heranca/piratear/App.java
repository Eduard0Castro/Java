package piratear;

public class App {
    public static void main(String args[]){
        Pirata perolaNegra = new Pirata("Pérola Negra");
        Navegador jackSparrow = new Navegador();
        MapaTesouro caminhoParaMorte = new MapaTesouro();
        Ilha pascoa = new Ilha();

        perolaNegra.setAll("Cracovia",109, 5, 28, 45);  

        jackSparrow.setApelido("Sparrow");
        jackSparrow.addMapa(caminhoParaMorte);

        caminhoParaMorte.setNome("Caminho para Morte");
        caminhoParaMorte.setAutor(jackSparrow);
        caminhoParaMorte.setIlha(pascoa);

        pascoa.setNome("Páscoa");
        pascoa.setPais("Chile");
        
        System.out.println(jackSparrow.getMapas().getFirst().getNome());

    }
}
