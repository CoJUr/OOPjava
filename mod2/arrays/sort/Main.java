package arrays.sort;
import java.util.*; // import the Arrays class from the java.util package

 class Main {
     // This is a program to find the minimum value in an array which may be sorted or unsorted already
    public static void main(String[] args) {
        int[] intArray = { 72, 42, 21, 10, 53, 64 };
        System.out.println("The given array is: " + Arrays.toString(intArray));

        int min_Val = intArray[0]; // initialize the minimum value to the first element of the array
        int length = intArray.length; // get the length of the array

        for (int i = 1; i <= length - 1; i++) 
        {
            int value = intArray[i]; // get the value at the current index
            if (value < min_Val) // check if the value is less than the minimum value
            {
                min_Val = value; // update the minimum value if the current value is less than the minimum value
            }

        }
    }
}
