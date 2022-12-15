package com.github.tel_ran_de;

import java.util.Arrays;
import java.util.Random;

public class Exam {

    public static int countWords(String inputString) {
        String[] arr = inputString.split(" ");
        return arr.length;
    }

    public static void main(String[] args) {
//        Replace every element of an array with an odd index to zero
//        The task:
//        1. Create an array of 8 random integers from the interval [1;10]
//        2. Display the array to the screen as a string
//        3. Replace every odd-indexed element with zero
//        4. Display the array again on a separate line

        Random rnd = new Random();
        int[] arr = new int[8];
        for (int i=0; i<arr.length; i++) {
            arr[i] = rnd.nextInt(1, 11);
        }
        System.out.println(Arrays.toString(arr));
        for (int i=1; i<arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

//        How to determine the number of words in a line
//        The task:
//        Write a method that determines how many words you entered from the console.
        String line = "Write a method that determines how many words you entered from the console.";
        System.out.println(line);
        System.out.println(countWords(line));
    }
}
