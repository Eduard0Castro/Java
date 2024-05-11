package padroes.observador;
import padroes.observador.rendimento.*;
import padroes.observador.imposto.*;
import java.util.List;

public class App {
    public static void main(String args []){

        Salario salario = new Salario();
        IRRF ir = new IRRF();
        FGTS fgts = new FGTS();
        INSS inss = new INSS();


        salario.getImpostos().add(ir);
        salario.getImpostos().add(inss);
        salario.getImpostos().add(fgts);

        salario.setMensal(100.0f);
        imprimirValores(salario.getImpostos());

        salario.setMensal(10000.0f);
        imprimirValores(salario.getImpostos());

    }

    public static void imprimirValores(List<Imposto> impostos){

        for (Imposto i: impostos){
            System.out.println(i.getValue());
        }
        System.out.println();

    }
}
