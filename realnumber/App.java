package realnumber;


public class App {
    public static void main(String args[]){

        RealNumber number = new RealNumber();
        number.number = 237.48f;
        System.out.println(number.getReal());
        System.out.println(number.getDecimal());

    }
}
