import java.util.ArrayList;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int add = brown + yellow;

        for(int height = 3; height <= Math.sqrt(add); height++) { // 노란 격자가 있으려면 가로, 세로 한 변의 크기는 최소 3이상
            if(add % height == 0) {
                int width = add/height;
                if((width-2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        
        return answer;
        
    }
    
}