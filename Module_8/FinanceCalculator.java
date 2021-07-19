/**
    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

 */
package Module_8;

public class FinanceCalculator {
    
    private static int MONTHS_IN_YEAR = 12;

    /**
     * Calculates the future value based on monthly payment, rate, & years.
     * 
     * @param monthlyPayment double
     * @param rate double
     * @param years int
     * @return
     */
    static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        
        int totalMonths = years * MONTHS_IN_YEAR;

        double interestRate = (1 + rate/100);

        double presentValue = monthlyPayment * totalMonths;

        double futureValue = presentValue * (Math.pow(interestRate, totalMonths));

        return futureValue = Math.round(futureValue*100.0)/100.0;
    }

}
