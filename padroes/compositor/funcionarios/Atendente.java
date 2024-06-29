package padroes.compositor.funcionarios;

public class Atendente extends Funcionario{

    private String ramalTelefonico;
    private Supervisor supervisor;
    
    public void solucionarProtocolo(Integer protocolo){
        if (getProtocolos().contains(protocolo))
            System.out.println("Protocolo resolvido pelo atendente");

        else{
            System.out.println("Protocolo repassado para o supervisor");
            supervisor.solucionarProtocolo(protocolo);
        }
    }

    public String getRamalTelefonico(){
        return this.ramalTelefonico;
    }

    public void setRamalTelefonico(String ramal){
        this.ramalTelefonico = ramal;
    }

    public Supervisor getSupervisor(){
        return this.supervisor;
    }

    public void setSupervisor(Supervisor supervisor){
        this.supervisor = supervisor;
    }
}

