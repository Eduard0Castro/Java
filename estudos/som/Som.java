package estudos.som;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;
 
public class Som {
 
    public static void main(String[] args) throws Exception {
 
        // Carrega o arquivo de áudio (não funciona com .mp3, só .wav) 
        String resource = "alvorada.wav";
        InputStream input = Som.class.getResourceAsStream(resource);
        Clip oClip = AudioSystem.getClip();
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
        oClip.open(audioInput);
 
        oClip.loop(0); // Toca uma vez
        //oClip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de músicas)
 
        // Para a execução (senão o programa termina antes de você ouvir o som)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
          
            }
        });
    }
}
    

