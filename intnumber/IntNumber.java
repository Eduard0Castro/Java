package intnumber;

public class IntNumber {
    private int number;

    public IntNumber(int number){
        this.number = number;
    }

    public void mensagem(){

        int contagem = 1;
        int soma = 0;
        if(this.number%2 == 0)
            System.out.println("Numero par");
        else 
            System.out.println("Numero impar");

        if (this.number > 0){
            System.out.println("Numero positivo");
            
            while (contagem <= (int) Math.sqrt(this.number)){
                if (this.number%contagem == 0)
                    soma += 1;
                
                contagem++;
            }
        }
        else 
            System.out.println("Numero negativo");

        if (soma == 1)
            System.out.println("Numero primo");
        else
            System.out.println("Nao e numero primo");
        
    }
}
