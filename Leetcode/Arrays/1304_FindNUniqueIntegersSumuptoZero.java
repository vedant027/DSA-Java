public class FindNUniqueIntegersSumuptoZero {
    public static void main(String[] args) {
        class Solution {
            public int[] sumZero(int n) {
                int[] unique = new int[n];
                if(n%2 == 0){
                    for(int i=0; i<n-1; i=i+2){
                        unique[i] = i+1;
                        unique[i+1] = -(i+1);
                    }
                }
                else{
                    for(int i=0; i<n-1; i=i+2){
                        unique[i] = i+1;
                        unique[i+1] = -(i+1);
                    }
                    unique[n-1] = 0;
                }
                return unique;
            }
        }
    }
}