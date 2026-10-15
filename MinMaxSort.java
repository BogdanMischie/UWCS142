// MinMaxSort.java
// Sort 3 numbers from largest to smallest using the Math.min and Math.max methods.
import java.util.Scanner;
public class MinMaxSort{

    public static void main(String[] args){
        // Use this to order the user inputs in the correct order
        int largest = Integer.MIN_VALUE;
        int middle = 0;
        int smallest = 0;
        
        // scanner
        Scanner scnr = new Scanner(System.in);
        
        // Ask user for inputs
        System.out.println("Please enter your name followed by 3 numbers (space separated):");
        
        // Record inputs
        String name = scnr.next();

        int num1 = scnr.nextInt();

        int num2 = scnr.nextInt();

        int num3 = scnr.nextInt();

        // Put into array so we can sort
        int[] arr = {num1,num2,num3};
        // Insetion sort is pretty easy to do and data set isnt too huge so it should work for this
        arr = insertionSort(arr);

        // Prints the numbers
        System.out.printf("%d %d %d\n", arr[2], arr[1], arr[0] );
        // Prints out name
        System.out.println("Thank you " + name + "!");

    }

    public static int[] insertionSort(int[]  arr){
        // Compares new nonsorted value to current sorted value
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int k = i - 1;
            // finds the exact spot to place the new value
            while(k > -1 && arr[k] > current){
                // moves all the numbers to the right one until we find one smaller to insert this one ahead of
                arr[k+1] = arr[k];
                k = k - 1;
            }
            // inserts the held number
            arr[k+1] = current;
        }

        return arr;
    }

}