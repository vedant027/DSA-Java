public class ConverttheTemperature {
    public static void main(String[] args) {
        class Solution {
            public double[] convertTemperature(double celsius) {
                double ans[]=new double[2];

                // For converting celsius into kelvin
                ans[0] = celsius + 273.15;

                // For converting celsius into fahrenheit
                ans[1] = celsius * 1.80 + 32.00;

                return ans;
            }
        }
    }
}