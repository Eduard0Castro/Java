package padroes.flyweight;

public class App {
    public static void main (String args []){
        Redacao r = new Redacao();
        
        r.novaFrase("Ensaiei meu samba o ano inteiro");
        r.novaFrase("Comprei surdo e tamborim");
        r.novaFrase("Gastei tudo em fantasia");
        r.novaFrase("Era só o que eu queria");
        r.novaFrase("E ela jurou desfilar para mim");
        r.novaFrase("Minha escola estava tão bonita");
        r.novaFrase("Era tudo o que eu queria ver");
        r.novaFrase("Em retalhos de cetim eu dormi o ano inteiro");
        r.novaFrase("E ela jurou desfilar para mim...");

        r.mostrar();
        System.out.println();
        System.out.println("Quantidade de palavras: " + r.getFabrica().getPalavras().size());






        
    }
}
