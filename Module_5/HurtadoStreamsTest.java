/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021
 */
package Module_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HurtadoStreamsTest {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        /**
         * Creates a new file titled "data.file"
         */
        File dataFile = new File("data.file");

        /**
         * Creates a new PrintWrite object for the data.file
         */
        PrintWriter writer = new PrintWriter(dataFile);
        
        /**
         * Checks if data.file exists. If true, user is informed that file 
         * already exists.
         */
        if (dataFile.exists()) {
            System.out.println("\nThe " + dataFile + " already exists...previous content being overwritten\n");
        }

        /**
         * Printout to inform user of current action
         */
        System.out.println("Writing to file.....\n");

        /**
         * For Loop that generates 10 random numbers and write each number to data.file
         */
        for (int i=0; i < 10; i++) {
            int randomNum = (int)(Math.random()*10000);

            writer.print(randomNum + " ");
        }

        /**
         * Printout to inform user of current action
         */
        System.out.println("Contents written to file.....\n");

        /**
         * Printout to inform user of current action
         */
        System.out.println("Closing file.....\n");

        /**
         * Closes data.file to properly save contents of file.
         */
        writer.close();

        /**
         * Creates a new Scanner object for data.file
         */
        Scanner reader = new Scanner(dataFile);

        /**
         * Printout to inform user of current action
         */
        System.out.println("Reading file.....\n");

        /**
         * Do-while loop that reads & outputs the contents of  data.file
         */
        while (reader.hasNext()) {
            String outputString = reader.nextLine();

            System.out.println(outputString);
        }

        /**
         * Closes the Scanner object.
         */
        reader.close();
        
    }
}
