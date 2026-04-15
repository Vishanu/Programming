//1768. Merge Strings Alternately(leetcode)

class MergeString {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();

        int i = 0, j = 0;
        int pick = 0; // if pick = 0  i will take char from word1
        //if pick = 1  i will take char from word2
        while(i<word1.length() && j<word2.length()){
            if(pick == 0){
                s.append(word1.charAt(i++));
                pick = 1;
            }else if(pick == 1){
                s.append(word2.charAt(j++));
                pick = 0;
            }
        }
        while(i<word1.length()){
            s.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            s.append(word2.charAt(j++));
        }

        return new String(s);
    }
}