package padroes.ponte;

public class Livro extends Publicacao {

    private String autor;

    public Livro(Origem origem){
        super(origem);
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    
    
}
