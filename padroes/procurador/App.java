package padroes.procurador;

public class App {
    public static void main(String args []){
        Empresa empresa = new Empresa();
        Empresa empresaCentral = new Empresa();
        Central central = new Central();
        Brasil bb = new Brasil();
        
        central.setDinheiro(500000.0f);
        empresa.setBanco(bb);
        bb.setCentral(central);

        System.out.println(empresa.pedirEmprestimo(500000));
        System.out.println(empresa.pedirEmprestimo(0.01f));

        empresaCentral.setBanco(central);
        central.setDinheiro(80000);

        System.out.println(String.format("Emprestimo concedido: %s \nDinheiro da central: %f",
                                    empresaCentral.pedirEmprestimo(54000), central.getDinheiro()));

    }
}
