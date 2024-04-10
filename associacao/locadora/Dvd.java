package associacao.locadora;

public class Dvd{
    private int numero, idade;
    private String titulo, genero, idioma;

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getIdioma(){
        return this.idioma;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

}