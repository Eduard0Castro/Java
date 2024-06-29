package padroes.ponte.midia;

public class Dvd extends Midia{
    
    private String genero, idioma;

    public Dvd (Categoria categoria){
        super(categoria);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }


}
