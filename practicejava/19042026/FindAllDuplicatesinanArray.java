//442. Find All Duplicates in an Array

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set <Integer> s = new HashSet<>();
        List<Integer> ls = new ArrayList<>();
        for(int it:nums){
            if(s.contains(it)){
                ls.add(it);
            }
            s.add(it);
        }
        return ls;
    }
}

public class FindAllDuplicatesinanArray {
    
}
