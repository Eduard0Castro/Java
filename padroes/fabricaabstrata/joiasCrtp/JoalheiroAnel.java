package padroes.fabricaabstrata.joiasCrtp;

public class JoalheiroAnel implements Joalheiro<AnelOuro, AnelBijuteria>{

    public AnelOuro newOuro(){
        return new AnelOuro();
    }

    public AnelBijuteria newBijuteria(){
        return new AnelBijuteria();
    }
    
}
