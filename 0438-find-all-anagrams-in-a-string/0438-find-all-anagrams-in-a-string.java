import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i <= s.length() - p.length(); i++){
            char[] a = s.substring(i, i + p.length()).toCharArray();
            char[] b = p.toCharArray();
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            if(Arrays.equals(a, b)){
                res.add(i);
            }
        }
        
        return res;
    }
}