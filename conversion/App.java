package conversion;


public class App {
    public static void main(String args[]){

        float conversion;
        Conversion c = new Conversion(20000);
        conversion = c.conversionFunction("ji", "km");
        System.out.println(conversion);

    }
}
