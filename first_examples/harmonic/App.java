package first_examples.harmonic;

public class App {
    public static void main(String args[]){
        HarmonicNumber number = new HarmonicNumber(6);
        float result = number.somaHarmonica();
        System.out.println("Soma harmonica: " +  result);
    }
}
