package estudos.provaJurassicpark;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class C extends A{
    private int c1;
    private List<D> listD = new ArrayList<D>();



    public int getC1(){

        return this.c1;

    }

    public void setC1(int v){
        this.c1 = v;
    }

    public int sizeOfD(){
        return listD.size();
    }

    public Iterator<D> iteratorD(){

        return listD.iterator();

    }

    public boolean addD(D v){

        return this.listD.add(v);
        
    }

    public boolean removeD(int idx){

        D toRemove = this.listD.get(idx);
        return this.listD.remove(toRemove);

    }

    public int a2(){
        int soma = c1;

        for (D a: listD){
            soma += a.a2();
        }

        return soma;
    }

}