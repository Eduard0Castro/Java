package padroes.ponte;

public class Nacional implements Origem {

    public float getTax(float preco){
        return preco*0.1f;
    }

}
