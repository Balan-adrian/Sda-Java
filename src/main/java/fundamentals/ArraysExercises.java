package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

//Write a Java program to find maximum product of two integers in a given array of integers.
//Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56

    public static void maxProduct() {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        int max = nums[0];
        int Product = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("Pair is: " + max + ", " + nums[nums.length - 2]);
        System.out.println("Maximum Product is: " + max * nums[nums.length - 2]);
    }

//Write a Java program to test if an array of strings contains a specific value.

    public static void testValueArray(int a) {
        int[] testArray = {1, 3, 5, 4, -8, 9, -5, -7, 6, -2};
        for (int i = 0; i < testArray.length; i++) {
            if (a == testArray[i]) {
                System.out.println(a + " is contains in Array");
            }
        }
//Nam gasit o metoda pentru a implementa un else la loup, fara sal repete in continuu, idei, sugestii!
//Aceasi problema am intalnito la primul exercitiu de String.
//      System.out.println("I am so sorry, don't found you number!");
    }

//Write a Java program to remove a specific element from an array.

    public static void remuveElementArray(int a) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == a) {
                myArray[i] = 0;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }

//Write a Java program to find the max number (harder: the second max number) in an array of integers.

    public static void maxNumber() {
        int[] array = {1, 4, 7, 23, 19, 8};
        int max = array[0];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max number is: " + max);
        System.out.println("Second max number is: " + array[array.length - 2]);
    }

//Write a Java program to find the duplicate values of an array of string values

    public static void duplicateValue() {
        int[] Array = {3, 1, 6, 2, 6, 9, 2, 3};
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    System.out.print(Array[j] + " ");
                }
            }
        }
    }
}
