// Jana Grunewald
public class Pet {
  // instance variables 
  String name; 
    
  String breed; 
  
  String colour; 
    
  int age; 
  
  //constructor declaration of Class 

  /** This stuff is for the pet class.
   * @param name 
   * is the name of the pet.
   * @param breed
   * is the breed of the pet.
   * @param age 
   * is the age of the pet.
   * @param colour
   * is the colour of the pet.
   */
  public Pet(String name, String breed, 
             String colour, int age) {
    //header = public Pets
    //parameter name, breed, age, colour
    
    this.name = name; 
        
    this.breed = breed; 
    
    this.colour = colour;
        
    this.age = age; 

  } 
  
  //method 1 
  /** This method gets the name of the pet.
   * @return this returns the name of the pet
   */
  public String getName() {
    
    return name;
    
  }
  
  //method 2 
  /** this gets the breed of the pet.
   * @return this returns the breed of the pet
   */
  public String getBreed() {
    
    return breed; 
    
  } 
  
  //method 3 
  public int getAge() {
    
    return age; 
  } 
  
  //method 4 
  public String getColour() {
    
    return colour; 
  }

  //method 5
  /** this is a string.
   * @see java.lang.Object#toString() This is a string.
   */
  public String toString() {
    
    return ("Hi my name is " + this.getName() 
        + ".\nMy breed,age and colour are " 
        + this.getBreed() + "," + this.getAge() 
        + "," + this.getColour());
    
  }
  //prints the colour age breed of the pet 
  //\n makes a line break
}
