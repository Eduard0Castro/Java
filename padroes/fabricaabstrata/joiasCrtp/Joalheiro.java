package padroes.fabricaabstrata.joiasCrtp;

public interface Joalheiro <T extends Material, J extends Material>{
    public T newOuro();
    public J newBijuteria();
    
}
