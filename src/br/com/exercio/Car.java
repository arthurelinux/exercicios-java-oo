package br.com.exercio;

public class Car {
    private boolean ligar = false;
    private double velocidade = 0.1;
    private int ano = 2001;

   public Car(){
        this.ligar = ligar;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void acelerar(double velocidade){
       if (isLigar() == true){
           while ( velocidade <= 160){
               velocidade++;
               System.out.println(velocidade);
           }
       }

    }
}
