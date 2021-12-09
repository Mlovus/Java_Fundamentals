package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        String Vowels ="[aeiouAEIOU]";
        Scanner input = new Scanner(System.in);
        System.out.println("input a word");
        String word= input.next();
        for (int i = 0; i < word.length();  i++) {

            if(Vowels.indexOf(word.charAt(i)) >=0){
                System.out.println(" The first vowel of: "+word+" is "+word.charAt(i));
                break;
            }

            if(i==word.length()-1){
                System.out.println("Word contains no vowels");
            }

        }

    }
}
