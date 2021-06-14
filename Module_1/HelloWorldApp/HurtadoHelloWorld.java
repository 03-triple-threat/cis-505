package Module_1.HelloWorldApp;

public class HurtadoHelloWorld {

    public static void main(String [] args) {
        System.out.printf(helloWorld("AJ", "Hurtado"));
    }

    public static String helloWorld(String firstName, String lastName) {
        String helloMessage = "Hello World from " + firstName + " " + lastName + ".";

        return helloMessage;
    }
}