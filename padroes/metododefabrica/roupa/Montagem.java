package padroes.metododefabrica.roupa;

public interface Montagem <T extends Roupa>{
    
    public T fabricaRoupa();
}
