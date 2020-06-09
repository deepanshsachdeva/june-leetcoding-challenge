class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        
        int si = 0;
        
        for(int ti=0; ti<t.length(); ti++){
            if(s.charAt(si) == t.charAt(ti)){
                if (si == s.length()-1) return true;
                si++;
            }
        }
        
        return false;
    }
}
