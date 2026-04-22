//205. Isomorphic Strings
import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        HashMap<Character, Character> hs = new HashMap<>();
        int i;
        for(i = 0; i<s1.length; i++){
            if(hs.containsKey(s1[i]) && hs.get(s1[i]) != t1[i]){
                return false;
            }
            else if(!hs.containsKey(s1[i]) && hs.containsValue(t1[i])){
                return false;
            }
            else {
                hs.put(s1[i], t1[i]);
            }
        }
        return true;
    }
}
public class IsomorphicStrings {
    
}
