/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021
 */
package Module_6;

public class InternationalDivision extends Division {

    /**
     * Fields for the country and language data
     */
    private String country;
    private String language;

    /**
     * Constructor for the InternationalDivision Object.
     * 
     * @param divisionName
     * @param divisionAccountNumber
     * @param country
     * @param language
     */
    protected InternationalDivision(String divisionName, String divisionAccountNumber, String country, String language) {
        super(divisionName, divisionAccountNumber);
        this.country = country;
        this.language = language;
    }

    /**
     * Method inherited from the superclass Division.java
     */
    @Override
    public String display() {
        String message = "Divsion located in the following country: " + country + "\n" +
            "Local Language: " + language;
        return message;
    }    
}
