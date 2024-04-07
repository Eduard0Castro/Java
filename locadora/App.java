package locadora;

import java.time.LocalDate;

public class App{
    public static void main(String args[]){
        
        Client joao = new Client("João");
        Funcionario ramiro = new Funcionario("Ramiro");
        Cupom cupom = new Cupom();
        Dvd spirit = new Dvd(), conexao = new Dvd(), LordofTheRings = new Dvd();

        LocalDate dataAloca = LocalDate.of(2024,04, 07);
        
        joao.setCupom(cupom);
        cupom.setDataAloca(dataAloca);
        cupom.setClient(joao);
        cupom.setFuncionario(ramiro);

        joao.rentDvd(spirit);
        joao.rentDvd(conexao);
        joao.rentDvd(LordofTheRings);

        System.out.println(cupom.finalizar());

    }
}