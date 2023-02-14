public class SmartTv {
  
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void on(){
      on = true;
    }

    public void increaseVolume(){
      System.out.println("Aumentando o volume para: " + volume);
      volume ++;
    }

    public void decreaseVolume(){
      System.out.println("Diminuindo o volume para: " + volume);
      volume --;
    }
  
    public void increaseChannel() {    
      channel ++;
    }

    public void decreaseChannel() {
      channel --;
    }

    public void changeChannel(int newChannel){
      channel = newChannel;
    }

    public void turnOff(){
      on = false;
    }

}
