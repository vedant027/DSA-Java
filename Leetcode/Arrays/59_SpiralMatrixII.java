public class SpiralMatrixII {
    public static void main(String[] args) {
        class Solution {
            public int[][] generateMatrix(int n) {
                int[][] matrix = new int[n][n];
                int num = 1;

                int row = matrix.length;
                if(row == 0)
                    return matrix;
                int col = matrix[0].length;

                int leftColumn = 0;
                int rightColumn = col - 1;
                int topRow = 0;
                int bottomRow = row  - 1;
                int direction = 0;

                while(leftColumn<=rightColumn && topRow<=bottomRow){
                    if(direction==0){
                        for(int i=leftColumn; i<=rightColumn; i++){
                            matrix[topRow][i]=num;
                            num++;
                        }
                        direction=1;
                        topRow++;
                    }

                    else if(direction==1){
                        for(int i=topRow; i<=bottomRow; i++){
                            matrix[i][rightColumn]=num;
                            num++;
                        }
                        direction=2;
                        rightColumn--;
                    }

                    else if(direction==2){
                        for(int i=rightColumn; i>=leftColumn; i--){
                            matrix[bottomRow][i]=num;
                            num++;
                        }
                        direction=3;
                        bottomRow--;
                    }

                    else if(direction==3){
                        for(int i=bottomRow; i>=topRow; i--){
                            matrix[i][leftColumn]=num;
                            num++;
                        }
                        direction=0;
                        leftColumn++;
                    }
                }
                return matrix;
            }
        }
    }
}
