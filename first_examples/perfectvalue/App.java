package first_examples.perfectvalue;

public class App {
    public static void main(String args[]){
        PerfectValue value = new PerfectValue(496);
        boolean verified = value.verifyPerfect();
        System.out.println(verified);
    }
}
