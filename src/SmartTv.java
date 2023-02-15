public class SmartTv {
  
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void on(){
      on = true;
    }

    public void increaseVolume(){
      System.out.println("Increasing the volume to: " + volume);
      volume ++;
    }

    public void decreaseVolume(){
      System.out.println("Decreasing the volume to: " + volume);
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
