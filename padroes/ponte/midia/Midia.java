package padroes.ponte.midia;

public abstract class Midia {
    
    private int numero, idadeCensura;
    private String titulo;
    private Categoria categoria;

    public Midia(Categoria categoria){
        this.categoria = categoria;
    }

    public float alocar(float precoFilme){
        return categoria.calcularPreco(precoFilme);
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getIdadeCensura() {
        return idadeCensura;
    }
    public void setIdadeCensura(int idadeCensura) {
        this.idadeCensura = idadeCensura;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    

}
