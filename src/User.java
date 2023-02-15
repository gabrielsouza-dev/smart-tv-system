public class User {
    public static void main(String[] args) throws Exception {
      SmartTv smartTv = new SmartTv();

      System.out.println("TV on? " + smartTv.on);
      System.out.println("Current channel: " + smartTv.channel);
      System.out.println("Volume atual: " + smartTv.volume);

      smartTv.on();
      System.out.println("New status -> TV on? " + smartTv.on);

      smartTv.decreaseVolume();
      smartTv.decreaseVolume();
      smartTv.decreaseVolume();
      smartTv.increaseVolume();

      System.out.println("Volume atual: " + smartTv.volume);

      System.out.println("Current channel: " + smartTv.channel);

      smartTv.changeChannel(13);
      
      System.out.println("Current channel: " + smartTv.channel);

      smartTv.turnOff();
      System.out.println("New status -> TV on? " + smartTv.on);
    }
}
