package estudos.provaJurassicpark;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class D extends A{

    private List<A> listA = new ArrayList<A>();

    public List<A> getListA() {
        return listA;
    }

    public void setListA(List<A> listA) {
        this.listA = listA;
    }

    public int sizeOfA(){
        return this.listA.size();
    }

    public Iterator<A> iteratorA(){

        return listA.iterator();
    }

    public boolean addA(A v){
        return listA.add(v);

    }

    public boolean removeA(int idx){
        A ateste = listA.get(idx);

        return listA.remove(ateste);
    }

    public int a2(){
        int soma = getA1();

        for ( A a : listA){
            soma += a.getA1();
        }

        return soma;
    }
}
