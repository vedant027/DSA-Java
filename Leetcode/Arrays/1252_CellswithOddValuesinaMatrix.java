public class CellswithOddValuesinaMatrix {
    public static void main(String[] args) {
        class Solution {
            public int oddCells(int m, int n, int[][] indices) {
                int[] rows=new int[m];
                int[] cols=new int[n];

                for(int[] a:indices){
                    rows[a[0]]++;
                    cols[a[1]]++;
                }
                int res=0;
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if((rows[i]+cols[j])%2 != 0){
                            res++;
                        }
                    }
                }
                return res;
            }
        }
    }
}