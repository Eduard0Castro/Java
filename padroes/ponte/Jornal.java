package padroes.ponte;
import java.util.Date;

public class Jornal extends Publicacao {


    Date data;
    
    public Jornal(Origem origem){super(origem);}

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    
    
}
