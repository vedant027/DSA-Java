import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A Sweet Red Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Grapes":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Please Enter a Valid Fruit");
                break;
        }
    }
}
