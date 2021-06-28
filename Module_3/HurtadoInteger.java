
/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021
 */
package Module_3;

public class HurtadoInteger {
    
    int AJ;

    /**
     * Constructor for the HurtadoInteger class.
     * @param inputValue - integer 
     */
    HurtadoInteger(int inputValue) {
        this.AJ = inputValue;
    }

    /**
     * Method returns the value of the AJ variable
     * @return the int value stored in the AJ variable
     */
    public int getInteger() {
        return AJ;
    }

    /**
     * Method sets the value for the AJ variable
     * @param inputValue - the value the AJ variable is set to
     */
    public void setInteger(int inputValue) {
        this.AJ = inputValue;
    }

    /**
     * Method checks if value stored in AJ variable is even
     * by performing the modulo operation on the value of the AJ field.
     * 
     * If the end result is 0, the number is even. If not, the number is odd.
     * @return boolean result of the operation
     */
    public Boolean isEven() {
        if(AJ % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method checks if value stored in AJ variable is even
     * by performing the modulo operation on the value of the AJ field.
     * 
     * If the end result is not 0, the number is odd. If so, the number is even.
     * @return boolean result of the operation
     */
    public Boolean isOdd() {
        if(AJ % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method checks if value stored in AJ variable is even
     * by performing the modulo operation on the value of the AJ field.
     * 
     * If the end result is 0, the number is even. If not, the number is odd.
     * @param intToBeEvaluated parameter being evaluated
     * @return boolean (true or false)
     */
    public static Boolean isEven(int intToBeEvaluated) {
        if(intToBeEvaluated % 2 == 0) {
            return true;
        } else {
            return false;
        }
    };

    /**
     * Method checks if value stored in AJ variable is even
     * by performing the modulo operation on the value of the AJ field.
     * 
     * If the end result is 0, the number is even. If not, the number is odd.
     * @param intToBeEvaluated parameter being evaluated
     * @return boolean (true or false)
     */
    public static Boolean isOdd(int intToBeEvaluated) {
        if(intToBeEvaluated % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method checks if value stored in AJ variable is even
     * by performing the modulo operation on the value of the AJ field.
     * 
     * If the end result is 0, the number is even. If not, the number is odd.
     * @param integerToBeEvaluated parameter being evaluated
     * @return boolean (true or false)
     */
    public static Boolean isEven(Integer integerToBeEvaluated) {
        if(integerToBeEvaluated % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method checks if value stored in AJ variable is even
     * by performing the modulo operation on the value of the AJ field.
     * 
     * If the end result is 0, the number is even. If not, the number is odd.
     * @param integerToBeEvaluated parameter being evaluated
     * @return boolean (true or false)
     */
    public static Boolean isOdd(Integer integerToBeEvaluated) {
        if(integerToBeEvaluated % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {

        HurtadoInteger instanceOne = new HurtadoInteger(5);

        HurtadoInteger instanceTwo = new HurtadoInteger(10);

        HurtadoInteger instanceThree = new HurtadoInteger(15);

        System.out.println(instanceOne.isEven());
        System.out.println(instanceOne.isOdd());
        
        System.out.println(instanceTwo.isEven());
        System.out.println(instanceTwo.isOdd());

        System.out.println(instanceThree.isEven());
        System.out.println(instanceThree.isOdd());

        System.out.println("########################");

        System.out.println(instanceOne.isEven(50));
        System.out.println(instanceOne.isOdd(50));

        System.out.println("########################");

        System.out.println(instanceOne.isEven(50));
        System.out.println(instanceOne.isOdd(50));
    }
}
