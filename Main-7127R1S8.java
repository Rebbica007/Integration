import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Jana Grunewald Integration Project
/*
 * I don't know what kind of program to make, so it is going to be a bunch of random code that I
 * have been learning.
 */
//floats are doubles just smaller memory
//ints are used for whole numbers e.g. 1
//strings are used for lines of text e.g. "What's your name?"
//chars are used for making a variable into the character class  
//booleans are used for true/false questions; only 2 options
//shorts are used for storing small numbers 
//longs are used for storing large numbers
//bytes are used to help clarify your code.
//doubles are used for numbers with a decimal point e.g. 2.5

/*P - parenthesis 
 * E - exponents
 * M - multiplication
 * D - division
 * A - addition
 * S - subtraction */
public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String userName = JOptionPane.showInputDialog("What is your name? ");
    //is a dialog for user input

    String substringForCapitalization1 = userName.substring(0, 1).toUpperCase();
    //is a substring that is used to make only the first letter capitalized.

    String userNameCapitalFirstLetter = substringForCapitalization1 + userName.substring(1);
    //makes the first letter capitalized.

    System.out.println("Welcome to my presentation on Java, " + userNameCapitalFirstLetter + ".");
    //prints the users name with a welcome statement.

    Pets name = new Pets("Sally", "Begal", 8, "White/black");
    //is a predetermined class
    //calls the method 
    //arguments of Sally, begal, 8, white/black

    System.out.println(name.toString());
    //Random class, shows the format needed

    final int finalDog = 105;
    //cannot make any more changes to the variable

    System.out.println(finalDog);
    //prints the final variable

    int int1 = 5;
    //first int

    int int2 = 25;
    //second int

    double double1 = 5.0;
    //first double

    double double2 = 25.0;
    //second double
    
    float float1 = (float) 2.3;
    //first float

    float float2 = (float) 4.5;
    //second float

    System.out.println(int1 + int2);
    //adds two ints

    System.out.println(int2 - int1);
    //subtracts two ints

    System.out.println(double2 / double1);
    //divides two doubles

    System.out.println(double1 * double2);
    //multiplies two doubles

    System.out.println(float1 + float2);
    //adds two floats
    
    String userAge = JOptionPane.showInputDialog("What is your age? ");
    //is a dialog for user input for age
    
    int result = Integer.parseInt(userAge);
    //converts the userAge string into an int
    
    System.out.println(result); 
    //prints the userAge as an int
   
    boolean booleanex1 = true;
    /*has one of two outputs: 
     * true/false 
     * yes/no
     * 0 or 1*/

     if ( booleanex1 == true) { 
     //if boop is true 
       
       System.out.println("TRUTHER"); 
       //prints "TRUTHER"
     }
      
     else {
        
       System.out.println("LIAR");
       //prints "LIAR"
        
     }
   
     StringBuilder stringBuilder1 = new StringBuilder();
     
     stringBuilder1.append("Yo yo yo ");
     
     stringBuilder1.append("what's up my dude?");
     
     System.out.println(stringBuilder1);
     //a StringBuilder is an alternative to a regular String that has more features and functionality.
     
     String charExample = "Give me apples";
     
     char[] charArray = charExample.toCharArray();
     
     for(char exampleCharArray: charArray) {
       
         System.out.println(exampleCharArray);
      //this code loops through the characters and gives off one line per letter
         
     }
     
     String palindromeExample = "Was it a cat I saw?";
     //palindrome is a sentance the same forwards and backwards
     
     int lengthExample = palindromeExample.length();
     //gives the length of the palindrome
     
     String strLength = String.valueOf(lengthExample);
     //also gives the length of the palindrome
     
     System.out.println(palindromeExample + " " + 
                         "\n" + lengthExample + " " + 
                         "\n" + strLength);
     //prints out the palindrom, then a new line for the length using int length 
     //then a new line for the length using String.valueof();
    
     double castingNum1 = 4.8;
     /*How to do casting:
     *dataType variableName = (dataType)variableToConvert;*/
     
     int castingNum2 = (int)castingNum1;
     //this changes the double to an int
     
     System.out.println(castingNum2);
     //prints castingNum2 as an int
     
     Random numberGenerator = new Random();
     
     System.out.println("LADIES AND GENTELMAN!\nWELCOME TO THE\nRANDOMMMMMMMMM NUUUUUMMMMBERRRRRRR GAME!");
     
     System.out.println(userNameCapitalFirstLetter + ", are you ready for your random number?");
     
     System.out.println("DRUM ROLL PLEASE!");
     
     System.out.println("...............");
     
     System.out.println("...............");
     
     System.out.println(userNameCapitalFirstLetter + 
                       ", your random number is... " + numberGenerator.nextInt(500));
     double radius;
     
     double volume;
     
     double diameter;

     diameter = 15.0; 

     radius = diameter / 2;

     volume = (5.0 / 3) * Math.PI * Math.pow(radius, 3);

     System.out.println("The radius for the sphere is "+ radius
                                     + " and the volume of the sphere is " + volume);
     System.out.println(++int1);
     
     System.out.println(--int2);
     
    if (int1 == int2)
      System.out.println("int1 == int2");
    if(int1 != int2)
      System.out.println("int1 != int2");
    if(int1 > int2)
      System.out.println("int1 > int2");
    if(int1 < int2)
      System.out.println("int1 < int2");
    if(int1 <= int2)
      System.out.println("int1 <= int2");
  
   if((int1 == 5) && (int2 == 2)) {
     System.out.println("int1 is 1 AND int2 is 2");}
   else {
     System.out.println("FALSE");
   }
     
   if((int1 == 5) || (int2 == 3)) {
     System.out.println("int1 is 5 OR int2 is 3");}
   else {
     System.out.println("FALSE");
   }
   
   System.out.println(int2 += int1);
   System.out.println(9 % 4);
   
   //SimpleArraySum test = new SimpleArraySum();
   
  /* System.out.println("Enter a number to make simple array sum");
   int arItem = KeyboardInput.nextInt();
   try {
     simpleArraySum(arItem);
   } catch (IOException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
   }
and put this as a mthod
public static int simpleArraySum(int arItem) throws IOException {
   

   int[] ar = new int[5];
   int sum = 0;
  

   for (int arItr = 0; arItr < ar.length; arItr++) {
   
     ar[arItr] = arItem;
     sum = sum + ar[arItr];
     System.out.println(sum);

   }
   return sum;
}
 class Animal{
   void walk(){
       System.out.println("I am walking");
   }
}
*/
       
       //while loop
         int count = 1;{
         while (count < 11) {
             System.out.println("Count is: " + count);
             count++;
         }
     }
        
         //do-while loop
         int potato = 1;
         do {
             System.out.println("Count is: " + potato);
             potato++;
         } 
         while (potato < 11);
     
         
         //for loop
         for(int i=1; i<11; i++){
           System.out.println("Count is: " + i);
      }
   
        scan.close();     
  }

/*public static class SwitchDemo {
  public static void grading(char grade){
    int success;
    Scanner grading = new Scanner(System.in);
    String grades = JOptionPane.showInputDialog("What is your letter grade? ");
    success = grading.nextInt();
    grade = ('A');
    grade = ('B');
    grade = ('C');
    grade = ('D');
    grade = ('F');
 switch (grade) {
   case 'A':
       System.out.println("Congradulations!");
       success = 1;
       break;
   case 'B':
       System.out.println("You almost had an A");
       success = 1;
       break;
   case 'C':
      System.out.println("Okay you need help");
      success = 1;
      break;
   case 'D':
   case 'F':
      System.out.println("Go to a tutor");
      success = 0;
      break;
   default:
      System.out.println("Invalid grade");
      success = -1;
      break;
 }
 passTheClass (success); 
 grading.close();
 System.out.println(grades);
}

public static void passTheClass(int success) {
  switch (success) {
    case -1:
        System.out.println("No result");
        break;
    case 0:
      System.out.println("FAIL");
      break;
    case 1:
      System.out.println("PASS");
      break;
    default: 
      System.out.println("Unknown");
      break;   
      
  } 
}
}*/
 
  /*
   System.out.println("Do you want to know what your initials are?");
   System.out.println("Type either y or n");
   String answer;
   // prompts user to enter y or n
   answer = KeyboardInput.nextLine();
   boolean yn;
   // this will get the first letter of the first name
   String Finitial = Fname.substring(0,1);
   // this will get the first letter of the last name
   String Linitial = Lname.substring(0,1);
   // this will concatnate the 2 first letters of the names
   String initial = Finitial + Linitial;
     OUTER:
     while (true) {
         switch (answer) {
             case "y":
             case "Y":
                 yn = true;
                 //if yes, it will give the initials
                 System.out.println("Your initials are " + initial);
                 break OUTER;
             case "n":
             case "N":
                 yn = false;
                 //if no, it will not find the initials
                 System.out.println("You probably already know your initials.");
                 break OUTER;
             default:
                 //this will prompt user to enter a y or n
                 System.out.println("Sorry, I didn't catch that. Please answer y/n");
                 // this will keep on asking for a y or n if it is not a y or n
                 answer = KeyboardInput.nextLine();
                 break;
         }
     }
   */

        int count = 1;{
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}

