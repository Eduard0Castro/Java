package estudos.provaPrototipo;

public interface Prototipo <T extends Prototipo<T>>{

    public T clone();
    
    
}
