import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//        if(b > a){
//            max = b;
//        }
//        if(c > b){
//            max = c;
//        }
//        System.out.println(max);

//        int max = 0;
//        if(a > b){
//            max = a;
//        }else {
//            max = b;
//        }
//        if(c > b){
//            max = c;
//        }
//        System.out.println("Largest number is "+ max);

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}
