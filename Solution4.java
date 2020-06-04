class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        
        while(i<s.length/2){
            char c1 = s[i];
            char c2 = s[j-i];
            
            s[i] = c2;
            s[j-i] = c1;
            
            i++;
        }
    }
}
