import java.util.ArrayList;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int add = brown + yellow;

        for(int i = 3; i <= add; i++) { // 노란 격자가 있으려면 가로, 세로 한 변의 크기는 최소 3이상
            if(add % i == 0 && add/i > 2 && i >= add/i) {
                int width = i;
                int height = add/i;
                if((width-2) * 2 + (height * 2) == brown) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        
        return answer;
        
    }
    
}