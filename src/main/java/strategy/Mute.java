package strategy;

public class Mute implements QuackBehavior {
  public void quack() { System.out.println("muted"); }
}
