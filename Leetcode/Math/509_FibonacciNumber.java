public class FibonacciNumber {
    public static void main(String[] args) {
        class Solution {
            public int fib(int n) {
                int fibNumber = 0;

                if(n == 0 || n == 1){
                    fibNumber = n;
                }
                else {
                    fibNumber = fib(n-1) + fib(n-2);
                }
                return fibNumber;
            }
        }
    }
}
