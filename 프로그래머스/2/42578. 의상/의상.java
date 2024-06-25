import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> cat = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            if(cat.containsKey(clothes[i][1])) {
                cat.put(clothes[i][1], cat.get(clothes[i][1]) + 1);
            } else {
                cat.put(clothes[i][1], 1);
            }
        } 
        
        for(int val : cat.values()) {
            answer *= (val+1);
        }
        
        return answer -1;
    }
}