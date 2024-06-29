package padroes.fabricaabstrata.joias;

public class JoalheiroColar implements Joalheiro{

    public Ouro newOuro(){
        return new ColarOuro();
    }

    public Bijuteria newBijuteria(){
        return new ColarBijuteria();
    }
    
}
