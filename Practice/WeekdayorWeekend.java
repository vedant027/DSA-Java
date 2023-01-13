import java.util.Scanner;

public class WeekdayorWeekend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day of week: ");
        String day = input.next();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a Weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a Weekend");
            default -> System.out.println("Enter a valid Day");
        }
    }
}
