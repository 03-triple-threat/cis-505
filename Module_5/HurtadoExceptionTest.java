package Module_5;

import java.util.ArrayList;
import java.util.Scanner;

public class HurtadoExceptionTest {

    public static void main(String[] args) {

        ArrayList <String> newList = new ArrayList<>();

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

        for (String s: newList) {
            System.out.println(s);
        }

        System.out.println("\nWhich element of the ArrayList would you like to see?");

        Scanner input = new Scanner(System.in);

        // int inputNumber;// = input.nextInt();

        try {
            int inputNumber = input.nextInt();
            System.out.println("\n" + newList.get(inputNumber) + "\n");
        } catch (Exception e) {
            System.out.println("Out of Bounds");
        }

    }

    
}
