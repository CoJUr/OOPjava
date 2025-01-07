// Ap0010 programming challenges questions 1-18


/*
What output is produced by the program in Listing 1?

A. Compiler error
B. Runtime error
C. Hello World  - Correct.  Explanation: the controlling class Ap001 has a main() method with a signature matching the reqs for a main() method.  Upon exection, the JVM calls the main() in the controlling class, creating an instance of Worker (and object of the Worker class) and calling the hello() method on that object.  The hello() method prints "Hello World" to the console. In this case, the object being creates is an "anonymous object" because it is not assigned to a variable.  The object is created and the hello() method is called on it in the same line of code.
D. Goodbye Cruel World
 */
//  class Ap001{
//     public static void main(String args[]){
//       new Worker().hello();
//     }//end main()
//   }//end class definition
  
//   class Worker{
//     public void hello(){
//       System.out.println("Hello World");
//     }//end hello()
//   }//end class definition


/*
 * Question 2.
 * What is the largest (algebraic) value of type int?
 * A. 32767
 * B. 2147483647   - Correct.  Explanation: The largest value of type int is 2,147,483,647. 32-bit signed integers are the default integer type in Java. There are no unsigned integers. Twos-complement notation is used to store ints. Calculation of the largest value of type int in twos-complement notation is as follows:     2^31 - 1 = 2,147,483,647.
 * C. -2147483647
 * D. -32768
 * 
 * 
 */


 /*
 Question 3.
What is the smallest (algebraic) value of type int?

A. -2147483648  - Correct.  Explanation: The smallest value of type int is -2,147,483,648. The reason its NOT -2147483647 which is the negative of the largest value, is due to how binary twos-complement notation works. The value range extends one unit further in the negative direction than in the positive direction. The calculation of the smallest value of type int in twos-complement notation is as follows: -2^31 = -2,147,483,648.
B. -2147483647 
C. 32767  - worth noting this value and -32768 are the values at the extreme ends of the range of a 16-bit binary number, in other words, the range of a short.  bytes, represented in 8-bit binary two's complement, range from -128 to 127.
D. -32768 
  */

// Question 4.       what values are displayed by the following program?
/*

public class Ap003{
  public static void main(
                        String args[]){
    new Worker().printDouble();
  }//end main()
}//end class definition

class Worker{
  public void printDouble(){
    System.out.println(
                     Double.MAX_VALUE);
    System.out.println(
                     Double.MIN_VALUE);
  }//end printDouble()
}//end class definition

*/

//A. -2147483648  
// B. 1.7976931348623157E308  - Correct.  Explanation: This is one of the correct answers. The Double.MAX_VALUE constant is the largest positive value that can be represented by a Double.  
// C. -2147483647
// D. 4.9E-324  - Correct.  Explanation: This is the other appropriate answer. Double.MIN_VALUE, similarly to MAX_VALUE, expresses the smallest positive value that can be represented by a Double. It is also an indication of the degree of granularity of values expressed as type double. Afterall, any double value can be treated as either positive or negative. Therefore, both floating types, float and double, have a MIN_VALUE and MAX_VALUE constant. The float type has a smaller range than the type double. A floats value range is approximately 1.4E-45 to 3.4E38. 


// Question 5.  What is the output of the following program?
/*

public class Ap004{
  public static void main( String args[] ) {
    new Worker().printBoolean();
  }//end main()
}//end class definition

class Worker{

  private boolean myVar;
  
  public void printBoolean(){
    System.out.println(myVar);

  }//end printBoolean
}//end class definition
        

A. true
B. false  - Correct.  Explanation: the primitive variable myVar is an uninitialized boolean declared in the Worker class. Usually variables are not usable until they are initialized. Being an instance variable, myVar, however, is automatically initialized to a default value, which for a boolean is false. Unlike C++, Java does not represent true and false as 1 and 0 numerically, a thus booleans cannot be used in arithmetic operations likes in C++.
C. 1
D. 0  
*/

// Question 6.  What is the output of the following program? 
// A. Compiler Error  - Correct.  Explanation: The program will not compile because the variable myVar is not initialized and is not an instance variable. Rather, it is a local variable belonging to the printBoolean() method. Therefore, it is not able to be accessed and used, causing a compiler error reading something like "variable myVar might not have been initialized."
// B. Runtime Error
// C. true
// D. false
/*
public class Ap005{
  public static void main(
                        String args[]){
    new Worker().printBoolean();
  }//end main()
}//end class definition

class Worker{
  public void printBoolean(){
    boolean myVar;
    System.out.println(myVar);
  }//end printBoolean()
}//end class definition
*/

// Question 7.  What is the output of the following program? 
/*
A. Compiler Error
B. Runtime Error
C. true
D. false - Correct.  Explanation: The program will compile and run without error. The variable myVar is a declared local boolean initialized to true. All variables can be initialized like this, whether local or not. The value of myVar is reassigned to false before being printed to the console. 
 
public class Ap006{
  public static void main(String args[]) {
    new Worker().printBoolean();

  }//end main()
}//end class definition

class Worker{
  public void printBoolean(){
    boolean myVar = true;
    myVar = false;
    System.out.println(myVar);
  }//end printBoolean()
}//end class definition
*/

// Question 8.  The + operator can perform numeric addition. What output is produced by the following program?
/*
A. Compiler Error  - Correct.  Explanation: As stated previously, boolean values cannot be used in arithmetic operations in Java. When the program attempts to add the literal value 1 to the boolean value myVar, the compiler will complain something like "bad operand types for binary operator '+'."      or  "operator '+' cannot be applied to int, boolean." ( using JDK 1.3)
B. Runtime Error
C. true
D. 2
E. 1

public class Ap007{
  public static void main(String args[]){
    new Worker().printBoolean();
  }//end main()
}//end class definition

class Worker{
  public void printBoolean(){
    boolean myVar = true;
    System.out.println(1 + myVar);
  }//end printBoolean()
}//end class definition



*/

// Question 9.  What is the output of the following program?

/*
A. Compiler Error
B. Runtime Error
C. 6
D. 6.0  - Correct.  Explanation: This program declares and initializes a double and an int and prints the sum of the two. Automatic conversion of the int to a double occurs before 3 is stored in the double variable, making it 3.0 to agree with the type double which has defines the variable x. Mixed-type arithmetic then occurs, with the double and int being added together. This causes the integer type to automatically be promoted to a floating-point type, esulting in floating-point arithmetic to be performed. The result is 6.0. 
*/
/*
public class Ap008{
  public static void main(String args[]){
    new Worker().printMixed();
  }//end main()
}//end class definition

class Worker{
  public void printMixed(){
    double x = 3;
    int y = 3;
    System.out.println(x+y);
  }//end printMixed()
}//end class definition
*/

// Question 10.  The slash (/) operator can perform division. What is the output of the following program?
/*
A. Compiler Error  
B. Runtime Error  
C. 0.33333334  
D. 0.3333333333333333  - Correct.  Explanation: Dividing a floating type by an integer literal results in a floating-point division. The integer first is promoted to a floating-point type, and then floating arithmetic is performed. The real question is, is the literal 1.0 a float or a double? The answer is that it is a double, because all literal floating-point numbers are doubles by default. And so this program divides a double by an int, resulting in a double. The proof is in the output, which shows approx 17 digits -- the maximum value for a float in a previous question only had about 8 digits and an exponent. A double has double the precision of a float. 
If we wanted to have the literal treated as a float rather than a double, we would append an 'f' to the end of the literal, like this: 1.0f.  The output when then be only 9 digits:  0.33333334



public class Ap009{
  public static void main(
                        String args[]){
    new Worker().printMixed();
  }//end main()
}//end class definition

class Worker{
  public void printMixed(){
    System.out.println(1.0/3);
  }//end printMixed()
}//end class definition

*/

//*******************                                                   PROGRAMMING CHALLENGES                               *******************//
// Question 11. write a program with the following description:
/*************************************
This program will not compile without errors. Make the necessary changes to the program so that it compiles and produces the following output:

ITSE
2321
*********************************************/
/*

 class Ap0010a1{
  public static void main(String args[]){
    System.out.println("ITSE");
    new Worker().doIt();
  }//end main()
}//end class definition 
//=======================================================//

class Worker{
  public void doIt(){
    System.out.println("2321");
  }//end doIt()
}//end class definition
 
*/

// Question 12. write a program with the following description, starting from the code fragment provided:
/*
write a method named doIt that: 1.) receives and dsplays an incoming parameter of type int. 2.) produces output like the following, depending on the value of the incoming parameter:
484495695
484495695
 */
/**/
import java.util.Random;
import java.util.Date;

 class Ap0010b1{
  public static void main(String args[]){
    //Create a random number for testing purposes
    Random random = new Random(new Date().getTime());
    int intVar = random.nextInt();
    
    
    int var = intVar;
    System.out.println(var);
    new Worker().doIt(var);
  }//end main()
}//end class definition 
//=======================================================//

class Worker{
  //-----------------------------------------------------//
  //Student: insert the method named doIt between these lines.
    public void doIt(int incoming){
        System.out.println(incoming);
    }//end doIt()
  //-----------------------------------------------------//
}//end class definition
//=======================================================//
