package padroes.metododefabrica.roupa;

public class Costureira implements Montagem<Calca>{
    private String nome;

    public Calca fabricaRoupa(){
        return new Calca();
    }

    public String getName(){
        return this.nome;
    }

    public void setName(String name){
        this.nome = name;
    }
}
