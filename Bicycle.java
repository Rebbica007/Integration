// Jana Grunewald
// from https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
public class Bicycle {
  //the Bicycle class has three fields
  public int cadence;
  
  public int gear;
  
  public int speed;
      
  // the Bicycle class has one constructor
  /** This tells you the bike starting stats.
   * @param cadence - how many times you petal.
   * @param speed - how fast you're going
   * @param gear - what gear you're on
   */
  public Bicycle(int cadence, int speed, int gear) {
    
    this.gear = gear;
    
    this.cadence = cadence;
    
    this.speed = speed;
    
  }
  // the Bicycle class has
  // four methods
  
  public int getCadence(int cadence) {
    
    return cadence;
  }
  /** This shows the gear.
   * @param gear sets the gear
   * @return gives the gear
   */
  
  public int getGear(int gear) {
    return gear;
  }
  /** This shows the speed.
   * @param speed sets the speed
   * @return gives the speed
   */
  
  public int getSpeed(int speed) {
    return speed;
  }
  
  public void setCadence(int newValue) {
    
    cadence = newValue;
  }
      
  public void setGear(int newValue) {
    gear = newValue;
  }
      
  public void applyBrake(int decrement) {
    speed -= decrement;
  }
      
  public void speedUp(int increment) {
    speed += increment;
  }
  /** This prints the cadence, speed and gear as a string.
   * @see java.lang.Object#toString() allows the user to see this printed on their screen
   */
  
  public String toString() {
    
    return ("Cadence: " + this.cadence() 
        + " Gear: " + this.gear() + " Speed: "
        + this.speed());
  }

  private int speed() {
    // TODO Auto-generated method stub
    return speed;
  }

  private int gear() {
    // TODO Auto-generated method stub
    return gear;
  }

  private int cadence() {
    // TODO Auto-generated method stub
    return cadence;
  }
}

