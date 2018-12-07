import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/* Create project - executable Java application with a main method
 * Add your name as a comment at top
 * Add a description of the program as a comment at top
 * Produce console output - display a greeting / introduction to the user*/
// Jana Grunewald 
// A presentation on everything I know how to do in Java.
public class Main {
  
  static Scanner scan;
  
  /**This is the main method of the program. 
   * @param args this is where the program happens
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    scan = new Scanner(System.in);
    
    String userName = JOptionPane.showInputDialog("What is your name? ");
    // is a dialog for user input

    String substringForCapitalization = userName.substring(0, 1).toUpperCase();
    // is a substring that is used to make only the first letter capitalized.

    String userNameCapitalFirstLetter = substringForCapitalization + userName.substring(1);
    // makes the first letter capitalized.

    System.out.println("Welcome to my presentation on Java, " + userNameCapitalFirstLetter + ".");
    // prints the users name with a welcome statement.
    
    /*A list and description of Java built-in data types within the user interface or in comments
     * Use the four main types of variables (boolean, int, double, String) 
     * with appropriate names and define (in English) variable and scope
     * Use final and describe what it means in a comment*/
    
    System.out.println("A boolean is used for true/false questions "
        + "where it only has 2 answers. e.g. ");
    // description of a boolean
    
    System.out.println("Let's see if you are an adult!");
    
    String userAge = JOptionPane.showInputDialog("What is your age? ");
    // is a dialog for user input for age

    int result = Integer.parseInt(userAge);
    // converts the userAge string into an int
    
    System.out.println("You entered the age: " + result);
    // prints the usersAge as an int
    
    boolean adult;
    
    if (result > 17) {
      
      adult = true;
    } else {
      
      adult = false;
      
    }
    
    System.out.println("Are you an adult " + "= " + adult);
    // prints the result of the boolean
    
    System.out.println("Bytes are 8 bits long and help increase the efficiency of your code.");
    // description of a byte
    
    System.out.println("A char is used for making a variable into a character class. e.g. ");
    // description of a char
    
    char firstInitial = userName.charAt(0);
    // gets the first letter of the username and sets it as a char
    
    System.out.println("Your first initial is: " + firstInitial);
    // prints the first initial of the name they entered
    
    double doubleExample = 2.5;
    // double example c: 
    
    System.out.println("Doubles are used for numbers with decimal points. e.g. " + doubleExample);
    // description of a double
    
    float floatExample = 1501204563;
    // float example c:
    
    System.out.println("A float is used when the number is long and you need to save memory. e.g. "
        + floatExample);
    // description of a float
    
    int intExample = 25;
    
    System.out.println("Ints are used for whole numbers. e.g " + intExample);
    // description of an int
    
    long longExample = 900;
    // long example c:
    
    System.out.println("Longs are used for storing large numbers. e.g. " + longExample);
    // description of a long
    
    String stringExample = "This is a line of text!";
    // string example c:
    
    System.out.println("Strings are used for lines of text. e.g. " + stringExample);
    // description of a string
    
    short shortExample = 400;
    // short example c:
    
    System.out.println("Shorts are used for storing small numbers "
        + "that are larger than an int. e.g. " + shortExample);
    // description of a short
    
    final int NUm = 9;
    /* final variables are suppose to be all caps and cannot be changed
     * However, checkstyles doesn't like the all caps.*/
    
    System.out.println("An example of a final int is: " + NUm);
    // prints the final number
    
    /* Use at least three methods from the String class and describe how they work in comments
     * Format strings using escape sequences
     * Use casting and describe what it means in a comment */

    
    StringBuilder stringBuilderExample = new StringBuilder();
    // string method for allowing you to have more than one line for a string.

    stringBuilderExample.append("This is a StringBuilder. It ");
    // this is the first part for the string builder

    stringBuilderExample.append("allows you to split your strings but make one coherent sentence.");
    // this is the second part for the string builder

    System.out.println(stringBuilderExample);
    /* a StringBuilder is an alternative to a regular String that has more 
     * features and functionality*/
    
    System.out.println("I will show you how a charArray works! e.g. ");
    
    String charExample = "Array";
    // this is an example of using an array

    char[] charArray = charExample.toCharArray();
    // this makes the charExample into an array

    for (char exampleCharArray : charArray) {

      System.out.println(exampleCharArray);
      // this code loops through the characters and gives off one line per letter

    }

    System.out.println("Next up is an example of a palindrome. "
        + "That is a sentence which is the same forwards and backwards!");
    
    String palindromeExample = "Was it a cat I saw?";
    // palindrome is a sentence the same forwards and backwards

    int lengthExample = palindromeExample.length();
    // gives the length of the palindrome

    String strLength = String.valueOf(lengthExample);
    // also gives the length of the palindrome

    System.out.println(palindromeExample + " " + "\n" +  "The length of the palindrome is: " 
        + lengthExample + " " + "\n" + "The length of the string is: " + strLength);
    /* prints out the palindrom, then a new line for the length using int length
    * then a new line for the length using String.valueof(); */
    
    System.out.println("The following is an example of "
        + "casting from one data type to the next.");
    
    double castingNum1 = 4.8;
    // How to do casting: dataType variableName = (dataType)variableToConvert;

    int castingNum2 = (int) castingNum1;
    // this changes the double to an int

    System.out.println("Casting from a double to an int: " + castingNum2);
    // prints castingNum2 as an int
  
    /* Create methods with arguments and return values
     * identify a method call and argument
     * identify a header and parameter */
    
    Pet myPet = new Pet("Sally", "Begal", "White/black", 8);
    /* is a predetermined class that calls the method with the arguments 
     * of Sally, begal, 8, white/black */
    
    System.out.println("This is an example of a class. "
        + "This happens to show you my pet information: " 
          + myPet.toString());
    /* prints out my pet information as an example class. 
     * Also shows the format needed to properly print the class. */
    
    /* Generate and use a random number
     * Utilize a method from the Math class */
    
    System.out.println("Next, I will show you the random number generator, "
        + "but in an interesting fashion!");

    Random numberGenerator = new Random();
    // this is used to generate a random number

    System.out.println("LADIES AND GENTELMAN!" 
        + "\nWELCOME TO THE" 
        + "\nRANDOMMMMMMMMM NUUUUUMMMMBERRRRRRR GAME!");
    // this is a prompt for introducing the random number game

    System.out.println(userNameCapitalFirstLetter + ", are you ready for your random number?");
    // asks the user if they are ready (doesn't require user input)

    System.out.println("DRUM ROLL PLEASE!");
    // some more fun things to say

    System.out.println("...............");
    // the wait

    System.out.println("...............");
    // it's suspensful

    System.out.println(userNameCapitalFirstLetter 
        + ", your random number is... " 
        + numberGenerator.nextInt(500));
    // prints out the user's random number

    System.out.println("Next up, we have the Math class. I will do a little "
        + "demonstration of how to use the methods from this class!");
    
    double radius;
    // this will be used for the Math package

    double volume;
    // this will be used for the Math package

    double diameter;
    // this will be used for the Math package

    diameter = 15.0;
    // used to find the volume

    radius = diameter / 2;
    // used to find the volume 

    volume = (5.0 / 3) * Math.PI * Math.pow(radius, 3);
    // uses the Math.PI and Math.pow to calculate the volume

    System.out.println("The radius for the sphere is " + radius 
        + " and the volume of the sphere is " + volume);
    // prints out the radius and the volume
    
    /* Create if and if/else and ternary constructs  
     * Use a switch statement 
     * Compare two String objects by using the compareTo 
     * and equals methods and make a comment describing how == works with objects
     * Use +, -, *, /, and %
     * Use ++ and --
     * Use a relational operator
     * Use += 
     * Use a conditional operator 
     * Describe operator precedence as a comment */
    
    System.out.println("Let's take a look at a Ternary construct.");
    
    int ternaryUserAge = 18;
    
    System.out.println("The initial ternartyUserAge is: " + ternaryUserAge);
    
    if (ternaryUserAge > 15) {
      
      System.out.println("Since you are over 15, you can drive");
      
    } else {
      
      System.out.println("Since you are younger than 15, you can't drive");
    }
    
    /* The above is a ternary method. This tells the user if they can or can't drive
    * does not ask for user input */
    
    System.out.println("Next up is the String CompareTo method!");
    
    String stringCompareTo = "Alpha"; 
    
    int stringCompareExample = stringCompareTo.compareTo("Beta");
    
    System.out.println("This will print 1 if the second string comes "
        + "first alphabetically and -1 for the opposite. "
        + "When comparing 'Alpha' to 'Beta' you get: " + stringCompareExample);
    
    /* The above system uses a string compareTo system with strings
     * compareTo use either -1 or 1 to evaluate the order of the 
     * strings. == is the .equals() method for objects.*/
    
    System.out.println("We are going to take a look at a Switch statement. "
        + "In order for this to go through, I will need to know your grade!");
    
    grading(); 
    
    System.out.println("I am sure you all remember PEMDAS right? "
        + "Haha of course you do! Let's take a look at how to "
        + "use the operators +, *, /, -");
    /* P - Parenthesis 
     * E - Exponents 
     * M - Multiplication 
     * D - Division 
     * A - Addition 
     * S - Subtraction */
    
    int operationsInt1 = 5;
    // initialises an int for operations
    
    int operationsInt2 = 25;
    // initialises a second int for operations
    
    int operationsInt3 = operationsInt2 - operationsInt1;
    // subtracts two ints 
    
    int operationsInt4 = operationsInt3 + operationsInt2;
    // adds two ints
    
    int operationsInt5 = operationsInt2 / operationsInt1;
    // divides two ints
    
    int operationsInt6 = operationsInt3 * operationsInt4;
    // mumltiplies two ints
    
    System.out.println("Int 2 - int 1 = " + operationsInt3);
    // prints the subtraction
    
    System.out.println("Int 3 + int 2 = " + operationsInt4);
    // prints the addition
    
    System.out.println("Int 2 / int 1 = " + operationsInt5);
    // prints the division
    
    System.out.println("Int 3 * int 4 = " + operationsInt6);
    // prints the multiplication
    
    System.out.println("9 % 4 has a remainder of: " + (9 % 4));
    // prints out a remainder
    
    System.out.println("Let's take a look at the contitional operators! "
        + "&& means AND - both things have to be true for the statement to be true. "
        + "|| means OR - one thing has to be true for the statement to be true. e.g. ");
    
    int int1 = 5;
    
    int int2 = 2;
    
    System.out.println("Is int 1 = 5 AND int 2 = 2?");
    
    if ((int1 == 5) && (int2 == 2)) {
      
      System.out.println("YES");
      
    } else {
      
      System.out.println("NO");
      
    }
    
    System.out.println("Is int 1 = 5 OR is int 2 = 3?");

    if ((int1 == 5) || (int2 == 3)) {
      
      System.out.println("YES");
      
    } else {
      
      System.out.println("NO");
      
    }
    
    /* This whole system shows the conditional operators 
     * AND (&&) and OR (||) while printing out whether the
     * statement is true or false by answering a yes or no
     * question */
    
    System.out.println("Next, let's look at the relational operators! "
        + "!= - does not equal \n <= - less than or equal to \n "
        + "== - equal to \n > - greater than \n < - less than \n"
        + " >= - greater than or equal to");
    
    int relationalInt1 = 5;
    
    int relationalInt2 = 7;
    
    boolean relationalBoolean1 = relationalInt1 >= relationalInt2;
    
    boolean relationalBoolean2 = relationalInt1 != relationalInt2;
    
    boolean relationalBoolean3 = relationalInt1 <= relationalInt2;
    
    boolean relationalBoolean4 = relationalInt1 < relationalInt2;
    
    boolean relationalBoolean5 = relationalInt1 > relationalInt2;
    
    boolean relationalBoolean6 = relationalInt1 == relationalInt2;
    
    System.out.println("Int 1 = " + relationalInt1 + "\n Int 2 = " 
        + relationalInt2);
    
    System.out.println("Int 1 >= Int 2: " + relationalBoolean1);
    
    System.out.println("Int 1 != Int 2: " + relationalBoolean2);
    
    System.out.println("Int 1 <= Int 2: " + relationalBoolean3);
    
    System.out.println("Int 1 < Int 2: " + relationalBoolean4);
    
    System.out.println("Int 1 > Int 2: " + relationalBoolean5);
    
    System.out.println("Int 1 == Int 2: " + relationalBoolean6);
    
    /* Whole system above shows the relational operators
     * and describes what the different signs mean. */
    
    int plusEqualsInt1 = 5;
    
    int plusEqualsInt2 = 6;
    
    System.out.println("Int 1 = " + plusEqualsInt1 + " Int 2 = " 
         + plusEqualsInt2); 
    
    int plusEqualsInt3 = plusEqualsInt1 += plusEqualsInt2;
    
    System.out.println("Int 1 += Int 2 is " + plusEqualsInt3);
    
    /* above system uses the += operator which adds two numbers or things together*/
    
    System.out.println("Next we will look at a while loop, do-while loop and a "
        + "for loop!");
    
    loopDemo();
    
    /*Make a class in a separate file with private fields, public getters and setters, 
     * a constructor with and without parameters */
    
    System.out.println("Let's take a look at a class with private and public modifiers!");
    
    Bicycle myBike = new Bicycle(5,8,3);
    
    System.out.println(myBike);

    /* Inheritance is used when you want to make sub classes
     * of a big class. For example, we have Bicycle and 
     * MountainBike. Instead of having to write the 
     * methods from Bicycle again, we can use inheritance
     * to let MountainBike get all the methods from
     * Bicycle and also add more methods to MountainBike. */
  }
  
  /** This is a method.
  * using a switch
  */
  
  public static void grading() {

    String grade = JOptionPane.showInputDialog("What is your letter grade? ");
    
    String grades = grade.toUpperCase();

    switch (grades) {
        
      case "A":
          
        System.out.println("Congradulations!");

        break;
          
      case "B":
          
        System.out.println("You almost had an A");

        break;
          
      case "C":
          
        System.out.println("Okay you need help");

        break;
          
      case "D":
          
      case "F":
          
        System.out.println("Go to a tutor");

        break;
          
      default:
          
        System.out.println("Invalid grade");

        break;
    }

    System.out.println("Your grade is an: " + grades);

  }
  
  /** This is a loop demo.
   * Uses while loops, for loops and do-while loops
   */
  
  public static void loopDemo() {
    // while loop
    
    int whileLoopCount = 8;
    
    while (whileLoopCount > 4) {
      
      System.out.println("whileLoopCount is: " + whileLoopCount);
      
      whileLoopCount--;
      // subtracts one from the count
      
    }

    // do-while loop
    int doWhileCount = 1;
    
    do {
      
      System.out.println("doWhileCount is: " + doWhileCount);
      
      doWhileCount++;
      // adds one to the count
      
    } while (doWhileCount < 5);

    // for loop
    for (int forLoopCount = 1; forLoopCount < 6; forLoopCount++) {
      
      System.out.println("forLoopCount is: " + forLoopCount);
      
    }
    
    for (int kills = 0; kills < 3; kills++) {
      
      if (kills == 2) {
        
        continue; 
     
      }
      /*control jumps to update kills++ 
      * the output will not include 2 because of the continue statement 
      * The loop execution is skipped when the loop counter is 2 */
      System.out.println("Let's take a look at how to use a continue!");
      
      System.out.println("Number of kills: " + kills);
    }
    
    int deaths = 1;
    
    while (deaths < 8) {
      
      System.out.println("Let's take a look at how to use a break!"); 
      
      System.out.println("Number of deaths: " + deaths);
         
      deaths++;
         
      if (deaths == 4) {
           
        break;
        //execution of the loop is terminated when the loop counter is equal to 4
      }
    }
  }
}
