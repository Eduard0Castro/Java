package associacao.dependencia.examples.ser;

public abstract class Ordem {
    private boolean telepatia, telecinese, persuasao;

    public boolean isTelepatia() {
        return telepatia;
    }

    public void setTelepatia(boolean telepatia) {
        this.telepatia = telepatia;
    }

    public boolean isTelecinese() {
        return telecinese;
    }

    public void setTelecinese(boolean telecinese) {
        this.telecinese = telecinese;
    }

    public boolean isPersuasao() {
        return persuasao;
    }

    public void setPersuasao(boolean persuasao) {
        this.persuasao = persuasao;
    }

    
}
