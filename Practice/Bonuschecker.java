import java.util.Scanner;

public class Bonuschecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your Salary ? ");
        int salary = input.nextInt();
        if(salary > 30000){
            salary = salary + 5000;
        }
        else{
            salary = salary + 2500;
        }
        System.out.println("Your Salary including bonus is " + salary);
    }
}
