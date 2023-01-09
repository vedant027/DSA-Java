import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        Syntax of for loops:

        for (initialisation; condition; increment/decrement) {
            // body
        }
         */

//        Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 2){
//            System.out.println(num);
//        }

//        Print numbers from 1 to n
//        Print Hello World n times
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for(int num = 1; num <= n; num += 1){
////            System.out.println(num);
//            System.out.println("Hello World");
//        }

        // While loops
        /*
        Syntax:
        while(condition) {
            // body
        }
         */

//        int num = 2;
//        while (num <= 10){
//            System.out.println(num);
//            num += 2;
//        }

        // do while
        /*

        do {
        // body
        } while (condition);

         */

        int n = 1;
        do {
            System.out.println("Hello World");
            n +=1;
        } while (n != 5);

    }
}
