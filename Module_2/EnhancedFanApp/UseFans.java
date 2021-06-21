package Module_2.EnhancedFanApp;

import Module_1.FanApp.HurtadoFan;

public class UseFans {

    public static void main(String[] args) {
        
        HurtadoFan fanOne = new HurtadoFan();

        HurtadoFan fanTwo = new HurtadoFan();

        HurtadoFan fanThree = new HurtadoFan(3, true, 4, "blue");

        HurtadoFan fanFour = new HurtadoFan(5, false, 2, "");

        HurtadoFan fanFive = new HurtadoFan();

    }
    
}
