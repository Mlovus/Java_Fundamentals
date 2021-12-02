package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args){
        int[] sum = new int[10];
        int total=0;
        Scanner input = new Scanner(System.in);
        for(int i=0; i< sum.length; i++){
            System.out.println("Please Input a number");
            sum[i]=input.nextInt();
            System.out.println(sum[i]);
        }
        input.close();
        for (int i=0; i< sum.length; i++) {
            total += sum[i];
        }
        System.out.println("The total of all numbers is: "+total+" The average of all the numbers is: "+ (new Double (total)/new Double (sum.length)));
    }
}