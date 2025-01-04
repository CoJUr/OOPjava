package arrays.largestEl;
import java.util.*;

class Main {
    public static void main(String[] args)
    {
        // similar to finding the minimum element, this program finds the largest element in the array, but instead of finding the element less than the refernce element, we find the element greater than the reference element.
        int[] intArray = {72, 42, 21, 10, 53, 64};
        System.out.println("The given array:" + Arrays.toString(intArray));
        int max_Val = intArray[0];                     //reference element
        int length = intArray.length;        // an ArrayList has no length Property, would have to use size() method
        
        for (int i = 1; i <= length - 1; i++)         // <= length -1 is the same as < length
        { // find max element by comparing each element with the reference element
            if (intArray[i] > max_Val)
            {

                max_Val = intArray[i];

            }
        }
        System.out.println("The largest element in the array is: " + max_Val);



        
    }
    
}
