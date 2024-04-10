package first_examples.people;


public class People {
    private String name;
    private float altura;
    private float peso;
    private static String josnei;
    public String teste = "Public";
    

    public String getNome(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public double imc(){
        return this.altura/this.peso*this.peso;
    }

    public static void setJosnei(String josnei){
        People.josnei = josnei;  
    }

    public static String getJosnei(){
        return josnei;
    }


}
