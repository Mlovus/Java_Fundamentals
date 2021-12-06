package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Collections;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args){
        int[]array = new int[10];
        for (int i=0; i<array.length; i++){
                array[i]=(int)(Math.random()*100);
            }

        for (int i = array.length-1; i >=0 ; i--) {
            if((array.length-i+1)%2==0){
                System.out.print(array[i]+" ");
            }
        }

    }
}


