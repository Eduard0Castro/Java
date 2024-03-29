package realnumber;

public class RealNumber {
    public float number;
    private int real;
    private float decimal;



    public int getReal(){
        this.real = (int) this.number;
        return this.real;
    }

    public float getDecimal(){
        this.decimal = this.number - this.real;
        return this.decimal;
    }

}
