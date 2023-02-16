public class FindNumberswithEvenNumberofDigits {
   public static void main(String[] args){
      class Solution {
         public int findNumbers(int[] nums) {
            int count = 0;
            int n = nums.length;
            for(int i=0; i<n; i++){
               int digit = 0;
               while(nums[i] > 0){
                  digit++;
                  nums[i] = nums[i]/10;
               }
               if(digit % 2 ==0){
                  count++;
               }
            }
            return count;
         }
      }
   }
}