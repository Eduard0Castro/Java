package padroes.ponte;

public class Revista extends Publicacao{
    
    private int mes, ano;

    public Revista(Origem origem){super(origem);}

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
