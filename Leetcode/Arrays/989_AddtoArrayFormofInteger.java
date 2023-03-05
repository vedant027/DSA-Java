public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        class Solution {
            public List<Integer> addToArrayForm(int[] num, int k) {
                int n = num.length;
                int i = n-1;
                List<Integer> ans = new ArrayList();
                // Implementing OR condition for checking the parameters
                while (i >= 0 || k > 0){
                    if (i >= 0){
                        // Taking out individual digits
                        k = k + num[i];
                        ans.add(k % 10);
                        k = k / 10;
                    }else {
                        ans.add(k % 10);
                        k = k / 10;
                    }
                    i--;
                }
                Collections.reverse(ans);
                return ans;
            }
        }
    }
}