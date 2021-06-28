/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021
 */
package Module_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HurtadoArrayListTest {

    static ArrayList<Integer> listOfInts = new ArrayList<>();
    
    public void acceptArrayList(ArrayList inputArrayList) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list = inputArrayList;

    }

    public void fillArrayList() {

    }

    /**
     * Method returns the largest value from the ArrayList passed in.
     * @param inputArrayList - ArrayList being evaluated 
     * @return - largest Integer found in the input ArrayList
     */
    public static Integer max(ArrayList inputArrayList) {
        return (Integer) Collections.max(inputArrayList);
    }

    public static void getUserInput() {

        Scanner input = new Scanner(System.in);

        Integer inputValue = input.nextInt();

        while(inputValue != 0) {
            // System.out.println(inputValue);
            listOfInts.add(inputValue);
            inputValue = input.nextInt();
        }
    }

    public static void main (String[] args) {

        getUserInput();

    }

}
