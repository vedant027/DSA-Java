public class DefanginganIPAddress {
    public static void main(String[] args) {
        class Solution {
            public String defangIPaddr(String address) {
                String ipAddress = address.replace(".", "[.]");
                return ipAddress;
            }
        }
    }
}
