package piratear;

import java.sql.Date;

public abstract class Navio{

    private String nome, cidadeConstrucao;
    private float tamanho;
    private int mastros, velas;
    private Date dataOrigem, dataDestino, dataIntercept;
    private Localidade localOrigem, localDestino, localIntercept;

    public Navio(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidadeConstrucao() {
        return cidadeConstrucao;
    }
    public void setCidadeConstrucao(String cidadeConstrucao) {
        this.cidadeConstrucao = cidadeConstrucao;
    }
    public float getTamanho() {
        return tamanho;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public int getMastros() {
        return mastros;
    }
    public void setMastros(int mastros) {
        this.mastros = mastros;
    }
    public int getVelas() {
        return velas;
    }
    public void setVelas(int velas) {
        this.velas = velas;
    }
    public Date getDataOrigem() {
        return dataOrigem;
    }
    public void setDataOrigem(Date dataOrigem) {
        this.dataOrigem = dataOrigem;
    }
    public Date getDataDestino() {
        return dataDestino;
    }
    public void setDataDestino(Date dataDestino) {
        this.dataDestino = dataDestino;
    }
    public Date getDataIntercept() {
        return dataIntercept;
    }
    public void setDataIntercept(Date dataIntercept) {
        this.dataIntercept = dataIntercept;
    }
    public Localidade getLocalOrigem() {
        return localOrigem;
    }
    public void setLocalOrigem(Localidade localOrigem) {
        this.localOrigem = localOrigem;
    }
    public Localidade getLocalDestino() {
        return localDestino;
    }
    public void setLocalDestino(Localidade localDestino) {
        this.localDestino = localDestino;
    }
    public Localidade getLocalIntercept() {
        return localIntercept;
    }
    public void setLocalIntercept(Localidade localIntercept) {
        this.localIntercept = localIntercept;
    }

    public void setAll(String cidadeConstrucao, float tamanho,  int mastros, int velas){
        this.cidadeConstrucao = cidadeConstrucao;
        this.tamanho = tamanho;
        this. mastros = mastros;
        this.velas = velas;
    }

}