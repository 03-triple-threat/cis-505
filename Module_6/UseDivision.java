package Module_6;

public class UseDivision {
    
    public static void main(String[] args) {
        
        DomesticDivision DomesticDivisionOneInstance = new DomesticDivision("DivisionName1", "123456789", "Nebraska");

        DomesticDivision DomesticDivisionTwoInstance = new DomesticDivision("DivisionName2", "987654321", "Kansas");

        InternationalDivision InternationalDivisionOneInstance = new InternationalDivision("Division3", "432156789", "Mexico", "Spanish");

        InternationalDivision InternationalDivisionTwoInstance = new InternationalDivision("Division4", "5647382910", "Canada", "English");

    }
}
