public class SmartTv {
  
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
      ligada = true;
    }

    public void aumentarVolume(){
      System.out.println("Aumentando o volume para: " + volume);
      volume ++;
    }

    public void diminuirVolume(){
      System.out.println("Diminuindo o volume para: " + volume);
      volume --;
    }
  
    public void aumentarCanal() {    
      canal ++;
    }

    public void diminuirCanal() {
      canal --;
    }

    public void mudarCanal(int novoCanal){
      canal = novoCanal;
    }

    public void desligar(){
      ligada = false;
    }

}
