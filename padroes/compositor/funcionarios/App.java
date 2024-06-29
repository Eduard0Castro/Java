package padroes.compositor.funcionarios;

public class App {

    public static void main(String args []){ 

        Atendente atendente = new Atendente();
        Supervisor supervisor = new Supervisor();
        Gerente gerente = new Gerente();

        atendente.getProtocolos().add(1);
        atendente.getProtocolos().add(2);
        atendente.getProtocolos().add(3);
        atendente.setSupervisor(supervisor);

        supervisor.getProtocolos().add(4);
        supervisor.getProtocolos().add(5);
        supervisor.getProtocolos().add(6);
        supervisor.setGerente(gerente);

        gerente.getProtocolos().add(7);
        gerente.getProtocolos().add(8);
        gerente.getProtocolos().add(9);

        atendente.solucionarProtocolo(9);
        atendente.solucionarProtocolo(4);

    }
}
