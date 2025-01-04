package arrays;
import java.util.*; // import the Arrays class from the java.util package


class Main {

    public static void main(String[] args) {
        Integer[] intArray = {1,3,5,7,9}; // Integer array. Note the capital 'I'. This is a wrapper class for the primitive int type.
        String[] strArray = {"one", "two", "three"}; 
    
    System.out.println("Integer Array: " + Arrays.toString(intArray)); // print the Integer array
    System.out.println("The length of the Integer array is: " + intArray.length); // print the length of the Integer array

    System.out.println("String Array: " + Arrays.toString(strArray)); // print the String array
    System.out.println("The length of the String array is: " + strArray.length); // print the length of the String array


    // demonstration of searching for a value in an array
    strArray = new String[]{"Java", "Python", "C++", "Ruby", "JavaScript"};
    

    // search for a string using searchValue function
    System.out.println(searchValue(strArray, "c++")? "value C++ found:" : "value c++ not found"); // short hand if else statement 
    System.out.println(searchValue(strArray, "Python")? "value Python found:" : "value Python not found"); // short hand if else statement

    }
    private static boolean searchValue(String[] searchArray, String lookup)
    {
    //traverse through a loop until all the elements are iterated through (length-1), searching for the lookup value to see if the given value is in the array. If it is, traversing is stopped.
    if (searchArray != null) {
        int arrayLength = searchArray.length; // get the length of the array
        for (int i = 0; i <= arrayLength - 1; i++) 
        {
            String value = searchArray[i]; // get the value at the current index
            if (value.equals(lookup)) // check if the value is equal to the lookup value
            {
                return true; // return true if the value is found
            }

        }

    }
    return false; // return false if the value is not found
    }
    
    }
