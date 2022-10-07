package Behavioural.MediatorPattern;
public class Main {

  public static void main(String[] args) {
    Mediator Mediator = new Mediator(new Plane(123));
    Mediator.takeOff();

  }

}
