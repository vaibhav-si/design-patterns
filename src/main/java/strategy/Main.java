package strategy;

public class Main {

  public static void main(String[] args) {
    showBehaviors(new MallardDuck());
    showBehaviors(new RubberDuck());
    showBehaviors(new DecoyDuck());
  }

  private static void showBehaviors(Duck duck) {
    duck.display();
    duck.fly();
    duck.quack();
    System.out.println();
  }
}
