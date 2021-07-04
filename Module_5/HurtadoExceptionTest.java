/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021
 */
package Module_5;

import java.util.ArrayList;
import java.util.Scanner;

public class HurtadoExceptionTest {

    public static void main(String[] args) {

        /**
         * Instantiates a new ArrayList of the String type
         */
        ArrayList <String> newList = new ArrayList<>();

        /**
         * Addition of a ten Strings to the newlist ArrayList
         */
        newList.add("Bellevue");
        newList.add("University");
        newList.add("Summer");
        newList.add("Term");
        newList.add("2020");
        newList.add("Java");
        newList.add("Intermediate");
        newList.add("Programming");
        newList.add("OOP");
        newList.add("Online");

        /**
         * ForEach loop that prints out each element within the newList ArrayList 
         */
        for (String s: newList) {
            System.out.println(s);
        }

        System.out.println("\nWhich element of the ArrayList would you like to see?");

        /**
         * Used for user input
         */
        Scanner input = new Scanner(System.in);

        /**
         * try-catch block that will print out an element within the ArrayList so long as 
         * the user inputs a valid int.
         */
        try {
            int inputNumber = input.nextInt();
            System.out.println("\n" + newList.get(inputNumber) + "\n");
        } catch (Exception e) {
            System.out.println("Out of Bounds");
        }

    }

    
}
