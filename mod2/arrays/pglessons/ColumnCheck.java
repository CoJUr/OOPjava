package arrays.pglessons;
import java.io.*;
import java.util.Scanner;

class ColumnCheck 
{
    // This is a program to check if a line has more than 10 characters and whether the 10th character is a space or not
    public static void main(String[] args) 
    {
        final int colNum = 10;
        int counter = 0;
        String line = null;
        Scanner scan = new Scanner( System.in );
    
        while ( scan.hasNext() ) {
            line = scan.nextLine() ;
            counter = counter + 1;
            if ( line.length() > colNum && line.charAt( colNum ) != ' ' ){
                System.out.println( counter + ":\t" + line );
            }
        } 
    }
}
