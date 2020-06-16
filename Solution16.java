import java.util.regex.Pattern; 

class Solution {
    public String validIPAddress(String IP) {
        if(Pattern.matches("((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])",IP)){
            return "IPv4";
        }else if(Pattern.matches("(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})",IP)){
            return "IPv6";
        }else{
            return "Neither";
        }
    }
}
