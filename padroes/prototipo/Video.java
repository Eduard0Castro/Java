package padroes.prototipo;

public class Video extends Midia<Video>{

    private String produtora, diretor;


    public Video clone(){

        Video video = new Video();
        video.setTitulo(this.getTitulo());
        video.produtora = this.produtora;
        video.diretor = this.diretor;

        return video;

    }


    public String getProdutora() {
        return produtora;
    }


    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }


    public String getDiretor() {
        return diretor;
    }


    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    
    
}
