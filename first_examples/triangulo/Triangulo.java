package first_examples.triangulo;

public class Triangulo {
    private int a, b, c;

    public Triangulo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String verifica(){
        String msg = "";
        
        if (a + b + c == 180 && a != 0 && b != 0 && c != 0){
            if (a == b && b == c)
                msg = "Equilatero e isósceles";

            else if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a))
                msg = "Isosceles";

            else 
                msg = "Escaleno";
        }

        else 
            msg = "Triangulo invalido";
        
        return msg;
    }
}
