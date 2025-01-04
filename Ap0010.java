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
 * B. 2147483647   - Correct.  Explanation: The largest value of type int is 2,147,483,647. 32-bit signed integers are the default integer type in Java. There are no unsigned integers. Twos-complement notation is used to store ints. Calculation of the largest value of type int in twos-complement notation is as follows: 2^31 - 1 = 2,147,483,647.
 * C. -2147483647
 * D. -32768
 * 
 * 
 */