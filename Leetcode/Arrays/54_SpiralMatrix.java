public class SpiralMatrix {
    public static void main(String[] args) {
        class Solution {
            public List<Integer> spiralOrder(int[][] matrix) {
                List <Integer> spiralMatrix = new ArrayList();

                int row = matrix.length;
                if(row == 0)
                    return spiralMatrix;
                int col = matrix[0].length;

                int leftColumn = 0;
                int rightColumn = col - 1;
                int topRow = 0;
                int bottomRow = row  - 1;
                int direction = 0;

                while(leftColumn<=rightColumn && topRow<=bottomRow){
                    if(direction==0){
                        for(int i=leftColumn; i<=rightColumn; i++){
                            spiralMatrix.add(matrix[topRow][i]);
                        }
                        direction=1;
                        topRow++;
                    }

                    else if(direction==1){
                        for(int i=topRow; i<=bottomRow; i++){
                            spiralMatrix.add(matrix[i][rightColumn]);
                        }
                        direction=2;
                        rightColumn--;
                    }

                    else if(direction==2){
                        for(int i=rightColumn; i>=leftColumn; i--){
                            spiralMatrix.add(matrix[bottomRow][i]);
                        }
                        direction=3;
                        bottomRow--;
                    }

                    else if(direction==3){
                        for(int i=bottomRow; i>=topRow; i--){
                            spiralMatrix.add(matrix[i][leftColumn]);
                        }
                        direction=0;
                        leftColumn++;
                    }
                }
                return spiralMatrix;
            }
        }
    }
}
