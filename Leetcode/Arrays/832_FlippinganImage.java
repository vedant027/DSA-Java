public class FlippinganImage {
    public static void main(String[] args) {
        class Solution {
            public int[][] flipAndInvertImage(int[][] image) {
                for(int row = 0 ; row < image.length ; row++){
                    swap(image[row]);
                    for(int col = 0 ; col < image[row].length ; col++){
                        image[row][col] = image[row][col] ^ 1;
                    }
                }
                return image;
            }
            public int[] swap(int[] arr){
                int s = 0 ;
                int e = arr.length -1;
                while(s < arr.length/2){
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e]= temp;
                    s++;
                    e--;
                }
                return arr;
            }
        }
    }
}