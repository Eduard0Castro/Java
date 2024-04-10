package first_examples.retangulo;
import java.util.Scanner;

public class Retangulo{

    private int width, height;
    private String type;
    private Scanner s = new Scanner(System.in);
    
    public Retangulo(int width, int height){
        this.width = width;
        this.height = height;

    }

    public Retangulo(){
        System.out.println("Construindo objeto");

    }

    public void general_setter(){

        System.out.print("Digite o altura do quadrilátero: ");
        this.height = s.nextInt();
        System.out.print("Digite a largura do quadrilátero: ");
        this.width = s.nextInt();
        //s.close();

    }
    public String type(){
        if(this.width == this.height)
            this.type = "Square";

        else
            this.type = "Rectangle";

        return this.type;
    }

    public void imprimir(){
        for (int i = 0; i < this.height; i++){
            for (int j = 0; j < this.width; j++){
                if(i == 0 ||j == 0 ||i == this.height-1||j == this.width-1){
                    System.out.print("X");
                }

                else
                    System.out.print("-");
            }

            System.out.println();
        }
    }


}