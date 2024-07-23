import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int allcount = 0; // 제거한 모든 0의 개수
        int length = 0; // 제거 후 길이
        int time = 0; // 2진변환한 횟수
        
        while(!s.equals("1")) {
            int count = 0; // 0개수 세기
            
            for(int i =0; i<s.length(); i++) {
                if(s.charAt(i) == '0') {
                    count++;
                }
            }
        
            allcount += count; // 제거할 0의 개수
            int x = s.length()-count; // 0제거 후 길이
            length += x;
            s = Integer.toBinaryString(x); // x를 2진법 변환하고 s에 대입
            time++;
        }
        
        answer[0] = time;
        answer[1] = allcount;
        
        return answer;
    }
}