class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n/2; i++) {
            int num = i;
            int add = 0;
            while(add <= n) {
                add += num;
                num++;
                if(add == n) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer + 1;
    }
}