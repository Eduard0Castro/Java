package viagem;

public class App {
    public static void main(String args[]){
        Passageiro anaMaria = new Passageiro("Ana Maria");
        Atendente joseCarlos = new Atendente("Jose Carlos");
        Onibus gio = new Onibus();
        Empresa gardenia = new Empresa("Gardenia");

        anaMaria.setAtendente(joseCarlos);
        anaMaria.setOnibus(gio);
        joseCarlos.setEmpresa(gardenia);

        System.out.println(anaMaria.buyTicket(9));


    }
}
