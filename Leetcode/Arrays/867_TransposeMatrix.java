public class TransposeMatrix {
    public static void main(String[] args) {
        class Solution {
            public int[][] transpose(int[][] matrix) {
                int R = matrix.length, C = matrix[0].length;
                // Creating the transpose matrix
                int[][] ans = new int[C][R];
                for (int r = 0; r < R; ++r)
                    for (int c = 0; c < C; ++c) {
                        // Interchanging the original matrix row and column for the transpose matrix
                        ans[c][r] = matrix[r][c];
                    }
                return ans;
            }
        }
    }
}