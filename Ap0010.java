// Ap0010 programming challenges questions 1-18


/*
What output is produced by the program in Listing 1?

A. Compiler error
B. Runtime error
C. Hello World  - Correct.  Explanation: the controlling class Ap001 has a main() method with a signature matching the reqs for a main() method.  Upon exection, the JVM calls the main() in the controlling class, creating an instance of Worker (and object of the Worker class) and calling the hello() method on that object.  The hello() method prints "Hello World" to the console. In this case, the object being creates is an "anonymous object" because it is not assigned to a variable.  The object is created and the hello() method is called on it in the same line of code.
D. Goodbye Cruel World
 */
 class Ap001{
    public static void main(String args[]){
      new Worker().hello();
    }//end main()
  }//end class definition
  
  class Worker{
    public void hello(){
      System.out.println("Hello World");
    }//end hello()
  }//end class definition


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