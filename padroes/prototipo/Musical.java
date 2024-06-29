package padroes.prototipo;

public class Musical extends Midia<Musical>{

    private String autor, produtora;

    public Musical clone(){
        Musical musical = new Musical();
        
        musical.setTitulo(this.getTitulo());
        musical.autor = this.autor;
        musical.produtora = this.produtora;

        return musical;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }


    
    
}
