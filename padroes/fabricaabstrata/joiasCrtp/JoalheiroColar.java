package padroes.fabricaabstrata.joiasCrtp;

public class JoalheiroColar implements Joalheiro<ColarOuro, ColarBijuteria>{

    public ColarOuro newOuro(){
        return new ColarOuro();
    }

    public ColarBijuteria newBijuteria(){
        return new ColarBijuteria();
    }
    
}
