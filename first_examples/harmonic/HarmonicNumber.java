package first_examples.harmonic;

public class HarmonicNumber {
    private int number;

    public HarmonicNumber(int number){
        this.number = number;
    }

    public float somaHarmonica(){
        float h = 0;

        for (int i = 1; i <= this.number; i++)
            h += (float) 1/i;

            return h;
    }
    
}
