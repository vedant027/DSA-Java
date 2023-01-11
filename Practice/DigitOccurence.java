public class DigitOccurence {
    public static void main(String[] args) {
        int a = 795787;
        int count = 0;

        while(a > 0){
            int rem = a % 10;
            if (rem == 7) {
                count++;
            }
                a = a / 10;
        }
        System.out.println(count);
    }
}
