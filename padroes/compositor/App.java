package padroes.compositor;

public class App {
    public static void main(String [] args){
        Diretorio principal = new Diretorio();
        File explicaPrincipal = new File(150.0f);

        Diretorio secundario = new Diretorio();
        File explicaSecundario = new File(200);
        File explicaSecundario2 = new File(200);
        
        Diretorio terciario = new Diretorio();
        File explicaTerciario = new File(100);

        principal.getElementos().add(explicaPrincipal);
        principal.getElementos().add(secundario);

        secundario.getElementos().add(explicaSecundario);
        secundario.getElementos().add(explicaSecundario2);
        secundario.getElementos().add(terciario);

        terciario.getElementos().add(explicaTerciario);

        System.out.println(principal.memoria());


    }
}
