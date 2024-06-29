package padroes.fabricaabstrata.joias;

public class ColarOuro extends Ouro{

    private int totalArgolas;

    protected ColarOuro(){}

    public int getTotalArgolas(){
        return this.totalArgolas;
    }

    public void setTotalArgolas(int totalArgolas){
        this.totalArgolas = totalArgolas;
    }


}
