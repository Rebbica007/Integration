// Jana Grunewald
// from https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
public class MountainBike extends Bicycle {
        
  // the MountainBike subclass has
  // one field
  public int seatHeight;

  // the MountainBike subclass has
  // one constructor
  public MountainBike(int height, int cadence,
                        int speed, int gear) {
    super(cadence, speed, gear);
    seatHeight = height;
  }   
        
  // the MountainBike subclass has
  // one method
  public void setHeight(int height) {
    seatHeight = height;
  }
  
  public String toString() {
    
    return ("Seat Height: " + this.seatHeight());
  }

  private int seatHeight() {
    // TODO Auto-generated method stub
    return seatHeight;
  }
}