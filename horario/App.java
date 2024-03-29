package horario;

public class App{
    public static void main(String args[]){
        Horario hor = new Horario();
        hor.insert(6, 3, "  Teste  ");
        hor.insert(2, 2, "   Telc  ");
        hor.insert(6, 9, "   POO   ");
        hor.imprime();
    }
}