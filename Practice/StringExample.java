import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = input.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
