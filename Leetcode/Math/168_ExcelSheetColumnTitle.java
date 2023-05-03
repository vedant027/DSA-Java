public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        class Solution {
            public String convertToTitle(int col) {
                StringBuilder sb = new StringBuilder();

                while(col > 0){
                    int r = (col-1)%26;
                    sb.append((char)(r +'A'));
                    col = (col-1)/26;
                }
                return sb.reverse().toString();
            }
        }
    }
}
