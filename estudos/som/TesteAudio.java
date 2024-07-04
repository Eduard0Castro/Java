package estudos.som;
import java.io.File;
import javax.sound.sampled.*;


public class TesteAudio {
         public static void main(String[] args) throws Exception {
    
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    new File("C:\\Users\\sirle\\Downloads\\alvorada.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
            } catch (Exception ex) {
                System.out.println("Erro ao executar SOM!");
                ex.printStackTrace();
            }
        }
    
    
}
