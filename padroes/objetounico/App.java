package padroes.objetounico;

public class App {
    public static void main(String args []){
        
        Contador contador1 = Contador.getInstancia();
        Contador contador2 = Contador.getInstancia();

        contador1.incrementa();
        contador2.incrementa();
        contador1.incrementa();

        System.out.println(contador1.getNumero());

        contador2.setNumero(89);
        contador1.incrementa();

        System.out.println(contador1.getNumero());
        System.out.println(contador1 == contador2);


    }
}
