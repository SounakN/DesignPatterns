package Behavioural.MediatorPattern;
public class Plane {

  private boolean isInTheAir;
  private int id;

  public Plane(int id) {
    this.id = id;   
  }

 
  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  public int getId() {
    return id;
  }
}
