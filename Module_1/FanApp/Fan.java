/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
      Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by A. Hurtado 2021
 */
package Module_1.FanApp;

public class Fan {

    //requirement #1
    final static int STOPPED = 0;
    final static int SLOW = 1; 
    final static int MEDIUM = 2;
    final static int FAST = 3;

    //requirement #2
    private int speed = STOPPED; 
    
    //requirement #3
    private Boolean on;
    
    //requirement #4
    private int radius = 6;

    //requirement #5
    public String color = "white";

    //requirement #6
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public Boolean isOn() {
        return on;
    }

    public void setOn(Boolean newOn) {
        on = newOn;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    //requirement #7
    Fan() {
        int speed;
        Boolean on;
        int radius;
        String color;
    }

    //requirement #8
    Fan(int newSpeed, Boolean newOn, int newRadius, String newColor) {
        this.speed = newSpeed;
        this.on = newOn;
        this.radius = newRadius;
        this.color = newColor;
    }

    public static void main (String[] args) {
        Fan noArgsFan = new Fan();

        Fan argsFan = new Fan(2, true, 5, "red");

        System.out.println(noArgsFan.color);

        System.out.println(argsFan.color);
    }

}