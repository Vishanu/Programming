// 217. Contains Duplicate
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> s = new HashSet<>();
        for(int it:nums){
            if(s.contains(it)){
                return true;
            }
            s.add(it);
        }
        return false;
    }
}
public class ContainsDuplicate {
    
}
