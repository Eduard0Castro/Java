package associacao.locadora;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Cupom {
    private Client client = new Client();
    private Funcionario funcionario = new Funcionario();
    private List<Dvd> dvds= new ArrayList<Dvd>();
    private LocalDate dataAloca, dataDevolve;
    private float preco_unit = 10, preco_total;
    
    public Client getClient(){
        return this.client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public List<Dvd> getDvds(){
        return this.dvds;
    }

    public void addDvds(Dvd dvd){
        dvds.add(dvd);
    }

    public Funcionario getFuncionario(){
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }

    public void setDataAloca(LocalDate date){
        this.dataAloca = date;
    }

    public String finalizar(){
        this.preco_total = dvds.size()*this.preco_unit;
        this.setDevolucao();

        String msg = String.format("Cliente: %s \nValor total da locação: %.2f \nData de devolução: %s",
                                    this.client.getNome(), this.preco_total, this.dataDevolve);

        return msg;

    }

    private void setDevolucao(){
        boolean pagarAntecipado;
        Scanner s = new Scanner(System.in);
        if (dvds.size() > 1){
            System.out.print("Pagar no dia?[true or false]: ");
            pagarAntecipado = s.nextBoolean();
            if(pagarAntecipado == true)
                dataDevolve = dataAloca.plusDays(2);
            
            else
                dataDevolve = dataAloca.plusDays(1);
        }
        s.close();
    }

}
