package padroes.procurador;

public class Central implements Banco{

    private float dinheiro;
    

    public boolean emprestimo(float value){

        if (dinheiro >= value){
            dinheiro -= value;
            return true;
        }

        else 
            return false;
    }

    public void setDinheiro(float value){
        this.dinheiro = value;
    }

    public float getDinheiro(){
        return this.dinheiro;
    }
}
