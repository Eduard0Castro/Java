package padroes.prototipo;

public abstract class  Midia<T extends Midia<T>> {

    private String titulo;

    public abstract T clone();

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    
}
