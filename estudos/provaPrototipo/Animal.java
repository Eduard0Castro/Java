package estudos.provaPrototipo;
import java.util.Date;

public abstract class Animal {

    private Date nascimento;

    public Date getNascimento(){
        return nascimento;
    }

    public void setNascimento(Date nascimento){
        this.nascimento = nascimento;
    }

    
}
