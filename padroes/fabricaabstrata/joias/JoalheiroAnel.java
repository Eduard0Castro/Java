package padroes.fabricaabstrata.joias;

public class JoalheiroAnel implements Joalheiro{

    public Ouro newOuro(){
        return new AnelOuro();
    }

    public Bijuteria newBijuteria(){
        return new AnelBijuteria();
    }
    
}
