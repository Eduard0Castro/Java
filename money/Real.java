package money;

public class Real {
    private int value, cem, cinquenta, dez, cinco, um;

    public Real(int value){
        this.value = value;
        convert();
    }

    public void convert(){
        while (this.value >= 100){
            cem++;
            this.value -= 100;
        }

        while (this.value >= 50){
            cinquenta++;
            this.value -= 50;

        }

        while (this.value >= 10){
            dez++;
            this.value -= 10;
        }

        while (this.value >= 5){
            cinco++;
            this.value -= 5;
        }

        while (this.value >= 1){
            um++;
            this.value -= 1;
        }
    }

    public int getCem(){
        return cem;
    }

    public int getCinquenta(){
        return cinquenta;
    }

    public int getDez(){
        return dez;
    }

    public int getCinco(){
        return cinco;
    }

    public int getOne(){
        return um;
    }

    public void imprimir(){
        System.out.println("Cem: " + cem + "\nCinquenta: " + cinquenta + 
                           "\nDez: " + dez + "\nCinco: " + cinco + "\nUm: " + um);
    }
}
