public class Add2Integers {
    public static void main(String[] args) {
        class Solution {
            public int sum(int num1, int num2) {
                for(int i= -200; i <= 200; i++){
                    // Adding two integers
                    if(num1 + num2 == i){
                        return i;
                    }
                }
                return -1;
            }
        }
    }
}