package padroes.compositor.funcionarios;
import java.util.List;
import java.util.ArrayList;


public class Gerente extends Funcionario{
    private String cursoEngenharia;
    private List<Supervisor> supervisores = new ArrayList<Supervisor>();

    public void solucionarProtocolo(Integer protocolo){

        System.out.println("Protocolo resolvido pelo gerente");
        
    }

    public String getCursoEngenharia(){
        return this.cursoEngenharia;
    }

    public void setCursoEngenharia(String cursoEngenharia) {
        this.cursoEngenharia = cursoEngenharia;
    }

    public List<Supervisor> getSupervisores() {
        return supervisores;
    }

    public void setSupervisores(List<Supervisor> supervisores) {
        this.supervisores = supervisores;
    }


}
