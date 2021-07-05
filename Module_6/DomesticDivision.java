/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021
 */
package Module_6;

public class DomesticDivision extends Division {

    /**
     * Field for the state data
     */
    private String state; 

    /**
     * Constuctor for the Domestic Divsion object.
     * 
     * @param divisionName
     * @param divisionAccountNumber
     * @param state
     */
    protected DomesticDivision(String divisionName, String divisionAccountNumber, String state) {
        super(divisionName, divisionAccountNumber);
        this.state = state;
    }

    /**
     * Method inherited from the superclass Division.java
     */
    @Override
    public String display() {
        // TODO Auto-generated method 
        String message = "Division located in the following state: " + state;
        return message;
    }
    
}
