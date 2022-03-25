package carro;

public class Carro {
    private int portas;
    private int rodas;
    private int parafusos;
    private String cor;
    private int setas;

    public Carro(int rodas, int parafusos, int setas){
        this.rodas = rodas;
        this.parafusos = parafusos;
        this.setas = setas;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getPortas(){
        return portas;
    }

    public int getRodas(){
        return rodas;
    }

    public int getParafusos(){
        return parafusos;
    }

    public String getCor(){
        return cor;
    }

    public int getSetas(){
        return setas;
    }



}
