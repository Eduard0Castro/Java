package estudos.provaPrototipo;

public class Ovelha extends Animal implements Prototipo<Ovelha>, DietaAlimentar<Ovelha>{


    private String corLa;

    public Ovelha clone(){
        Ovelha novaOvelha = new Ovelha();
        novaOvelha.corLa = corLa;

        return novaOvelha;
    }

    public void comer(){
        
    }
    
}
