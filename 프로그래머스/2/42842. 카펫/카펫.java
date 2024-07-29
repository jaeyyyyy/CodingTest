import java.util.ArrayList;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int add = brown + yellow;

        // 전체 타일의 약수를 찾습니다.
        for (int height = 3; height <= Math.sqrt(add); height++) {
            if (add % height == 0) {
                int width = add / height;
                if ((width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        
        return answer;
        
    }
    
}