package padroes.ponte;

public class Estrangeiro implements Origem {

    public float getTax(float preco){
        return 0.5f*preco;
    }
    
}
