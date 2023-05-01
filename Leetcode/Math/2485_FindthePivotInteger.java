public class FindthePivotInteger {
    public static void main(String[] args) {
        class Solution {
            public int pivotInteger(int n) {
                for(int i=1; i<=n; i++){
                    long left_sum = (i*(i+1))/2;
                    long right_sum = (n*(n+1))/2 - (i*(i-1))/2;

                    if(left_sum == right_sum) return i;
                }
                return -1;
            }
        }
    }
}
