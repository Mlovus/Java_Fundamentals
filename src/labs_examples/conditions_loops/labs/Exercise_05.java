package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a lower bound and an upper bound");
        int low=input.nextInt();
        int high= input.nextInt();
        int sum=0;
        double average=0;
        sum=((Math.abs(low-high)+1)*(low+high))/2;
        average=(double)(low+high)/2.0;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
        sum=0;
        for (int i = low; i <=high ; i++) {
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
    }
}
