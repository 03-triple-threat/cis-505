/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021
 */
package Module_6;

public abstract class Division {
    
    /**
     * fields for the division name & division account number
     */
    private String divisionName;
    private String divisionAccountNumber;

    /**
     * Abstract method that will be defined in subclasses
     * @return
     */
    public abstract String display();

    /**
     * Constructor of hte Divsion object 
     * @param divisionName
     * @param divisionAccountNumber
     */
    protected Division(String divisionName, String divisionAccountNumber) {
        this.divisionName = divisionName;
        this.divisionAccountNumber = divisionAccountNumber;
    }
}
