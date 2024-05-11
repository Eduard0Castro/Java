package padroes.objetounico;

public class Contador {
    private static Contador contador = new Contador();
    private int numero;

    private Contador(){}

    public static Contador getInstancia(){
        return Contador.contador;
    }


    public void incrementa(){
        numero ++;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int num){
        this.numero = num;
    }
}
