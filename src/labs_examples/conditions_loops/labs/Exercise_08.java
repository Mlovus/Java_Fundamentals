package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String[] args) {
        int i=1000;
        int j=0;
        do {
        if(j%3==0){
            System.out.print(i+" ");
            if (i%10==0){
                System.out.println();
            }
        }
        j++;
        i--;
        }while(i>-1);
    }




}
