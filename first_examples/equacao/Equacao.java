package first_examples.equacao;

public class Equacao {
    private int a, b, c;

    public Equacao(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private float descriminante(){
        float descriminante = b*b - 4*a*c;
        return descriminante;
    }

    public double [] solution(){
        double solution []= new double [2];
        float descriminante = descriminante();
    
        if (descriminante < 0)
            throw new IllegalArgumentException("Discriminante menor que 0. Sem raizes reais");

        else{
            solution[0] = (-b + Math.sqrt(descriminante))/(2*a);
            solution[1] = (-b - Math.sqrt(descriminante))/(2*a);
        }
        return solution;
    }
}
