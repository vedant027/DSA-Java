public class FindGreatestCommonDivisorofArray {
    public static void main(String[] args) {
        class Solution {
            public int findGCD(int[] nums) {
                int max = 0;
                int min = 1001;

                for(int a:nums){
                    max = Math.max(a,max);
                    min = Math.min(a,min);
                }
                return gcd(max,min);
            }

            private int gcd(int a, int b){
                if(b==0) return a;
                return gcd(b,a%b);
            }
        }
    }
}
