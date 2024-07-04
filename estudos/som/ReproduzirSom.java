package estudos.som;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class ReproduzirSom {

    public static void main(String[] args) {
        String caminhoDoSom = "C:\\Users\\sirle\\Downloads\\alvorada.wav"; // Nome do arquivo de som

        try {
            // Obtendo o arquivo de som
            File arquivoSom = new File(caminhoDoSom);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivoSom);

            // Obter o formato de áudio do stream de entrada
            AudioFormat formatoAudio = audioStream.getFormat();

            // Obter uma linha do sistema de áudio para reproduzir o som
            DataLine.Info info = new DataLine.Info(Clip.class, formatoAudio);
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Abrir o clip e carregar o áudio
            clip.open(audioStream);

            // Iniciar a reprodução
            clip.start();

            // Manter a execução enquanto o som está sendo reproduzido
            System.out.println("Reproduzindo som...");
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Fechar recursos
            clip.close();
            audioStream.close();

            System.out.println("Reprodução concluída.");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Formato de arquivo de áudio não suportado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo de som.");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Linha de áudio não disponível.");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida.");
            e.printStackTrace();
        }
    }
}