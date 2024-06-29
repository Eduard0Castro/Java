package padroes.compositor.funcionarios;
import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    private String nome;
    private List<Integer> protocolos = new ArrayList<Integer>();

    public abstract void solucionarProtocolo(Integer protocolo);

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Integer> getProtocolos(){
        return protocolos;
    }

    public void setProtocolos(List<Integer> protocolos){
        this.protocolos = protocolos;
    }

}
