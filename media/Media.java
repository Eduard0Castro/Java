package media;

public class Media{
    private String name;
    private float n_prova, n_trab, media;

    public Media(){

    }

    public Media(String name, float n_prova, float n_trab){
        this.name = name;
        this.n_prova = n_prova;
        this.n_trab = n_trab;
        this.calc_media();
    }

    public void read(String name, float n_prova, float n_trab){

        this.name = name;
        this.n_prova = n_prova;
        this.n_trab = n_trab;
        this.calc_media();
        
    }

    private void calc_media(){
        this.media = 0.8f*this.n_prova + 0.2f*this.n_trab;
    }

    public String result(){
        String result = "";
        if(this.media >= 5.0f)
            result = String.format("%s foi aprovado: %f", this.name, this.media);

        else    
            result =  String.format("%s foi reprovado: %f", this.name, this.media);

        return result;
        
    }
}