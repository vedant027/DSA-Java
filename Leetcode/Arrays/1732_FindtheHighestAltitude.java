public class FindtheHighestAltitude {
    public static void main(String[] args) {
        class Solution {
            public int largestAltitude(int[] gain) {
                int maxAltitude = 0;
                int currentAltitude = 0;

                for(int i=0; i<gain.length; i++){
                    currentAltitude += gain[i];
                    maxAltitude = Math.max(currentAltitude, maxAltitude);
                }
                return maxAltitude;
            }
        }
    }
}