import java.util.Scanner;

public class SumMethods {
    public static void main(String[] args) {
//        sum();

//        int ans = sum2();
//        System.out.println(ans);

          int ans = sum3(20, 30);
        System.out.println(ans);
    }

//    pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }


//    return the value
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
//      System.out.println("This will never execute");
    }

//    Display the value
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is " + sum);
    }


//    return_type name (arguments) {
//       // body
//       return statement;
//    }

}
