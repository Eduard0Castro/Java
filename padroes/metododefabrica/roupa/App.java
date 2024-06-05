package padroes.metododefabrica.roupa;

public class App {
    public static void main(String args []){
        Confeccao confeccao = new Confeccao();
        Camisa camisa = confeccao.fabricaRoupa();
        camisa.setMangaCurta(true);
        System.out.print(camisa.isMangaCurta());


    }
}
