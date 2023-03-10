public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        class Solution {
            public int numberOfSteps(int num) {
                // Initializing Count
                int count = 0;

                while(num != 0){
                    // Checking if num is even
                    if(num % 2 ==0){
                        num = num/2;
                        count++;
                    }
                    //  If num is odd
                    else {
                        num = num - 1;
                        count++;
                    }
                }
                return count;
            }
        }
    }
}