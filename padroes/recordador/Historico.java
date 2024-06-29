package padroes.recordador;
import java.util.Stack;

public class Historico {
    private Cliente cliente;
    private Stack<Endereco> enderecos = new Stack<Endereco>();

    public void desfazer(){
        cliente.restauraEndereco(enderecos.pop());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Stack<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Stack<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    
}
