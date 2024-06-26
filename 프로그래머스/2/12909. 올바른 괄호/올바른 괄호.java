import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        Queue q = new LinkedList<>();
        char[] arr = s.toCharArray();
        
        for(char bracket : arr) {
            if(bracket == '(') {
                q.add(bracket);
            } else {
                if(q.isEmpty()) {
                    return false;
                } else {
                    q.remove();
                }
            }    
        }
        
        return q.isEmpty() ? true : false;
    }
}