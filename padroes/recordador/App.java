package padroes.recordador;

public class App {

    public static void main(String args []){
    Historico historico = new Historico();

    historico.setCliente(new Cliente());
    historico.getCliente().setNome("Zezinho");
    historico.getCliente().setLogradouro("Rua Andre Martins Andrade Filho");
    historico.getEnderecos().push(historico.getCliente().createEndereco());

    System.out.println(historico.getCliente().getLogradouro());

    //Não dei push na minha pilha com esse endereço novo:
    historico.getCliente().setLogradouro("Rua Dr. Romão Carneiro");

    System.out.println(historico.getCliente().getLogradouro());
    historico.desfazer();
    System.out.println(historico.getCliente().getLogradouro());

    }
}
