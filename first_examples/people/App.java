package first_examples.people;

public class App{
    public static void main(String args[]){

        //Instanciando um objeto:
        People edu = new People();

        //Setando valores dos atributos:
        edu.setName("Eduardo");
        edu.setAltura(1.79f);
        edu.setPeso(80f);

        //Printando valores dos atributos:
        String result = String.format("%.2f", edu.imc());
        System.out.println(result);
        System.out.println(edu.getPeso());

        //Acessando e modificando valores de atributos públicos:
        System.out.println(edu.teste);
        edu.teste = "Mudando";
        System.out.println(edu.teste);

        //Acessando métodos estáticos pela classe:
        People.setJosnei("Josicleison");
        System.out.println(People.getJosnei());

    }
}