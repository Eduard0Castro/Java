package padroes.compositor.funcionarios;
import java.util.List;
import java.util.ArrayList;

public class Supervisor extends Funcionario{

    private String cursoSuperior;
    private Gerente gerente;
    private List<Atendente> atendentes = new ArrayList<Atendente> ();

    public void solucionarProtocolo(Integer protocolo){

        if (getProtocolos().contains(protocolo))
            System.out.println("Protocolo resolvido pelo supervisor");

        else {
            System.out.println("Protocolo repassado para gerente");
            gerente.solucionarProtocolo(protocolo);
        }
    }

    public String getCursoSuperior(){
        return this.cursoSuperior;
    }

    public void setCursoSuperior(String cursoSuperior){
        this.cursoSuperior = cursoSuperior;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Atendente> getAtendentes() {
        return atendentes;
    }

    public void setAtendentes(List<Atendente> atendentes) {
        this.atendentes = atendentes;
    }

    
    
}
