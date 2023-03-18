public class RichestcustomerWealth {

    public static void main(String[] args) {
        class Solution {
            public int maximumWealth(int[][] accounts) {
                int rowLength = accounts.length;
                int colLength = accounts[0].length;
                int maxWealth = 0;
                int sum;
                for(int i=0; i<rowLength ; i++){
                    sum = 0;
                    // Calculating the sum of individual rows
                    for(int j=0; j<colLength ; j++){
                        sum += accounts[i][j];
                    }
                    // Comparing the sum of individual rows
                    if(sum > maxWealth){
                        maxWealth = sum;
                    }
                }
                return maxWealth;
            }
        }
    }
}