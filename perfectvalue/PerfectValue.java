package perfectvalue;

public class PerfectValue {
    private int value;

    public PerfectValue(int value){
        this.value = value;
    }

    public boolean verifyPerfect(){
        boolean verified = false;

        int inter = this.value - 1;
        int soma = 0;

        while (inter != 0){
            
            if (this.value%inter == 0){
                soma += inter;
            }
            inter--;
        }

        if (soma == this.value)
            verified = true;

        else    
            verified = false;

        return verified;
    }

    public int getValue(){

        return this.value;
    }
}
