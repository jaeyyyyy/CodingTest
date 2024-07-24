class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n/2; i++) {
            int num = i; // 시작하는 자연수
            int add = 0; // 합한 값
            while(true) {
                add += num;
                num++;
                
                if(add == n) {
                    answer++;
                    break;
                } else if (add > n){
                    break;
                }
            }
        }
        
        return answer+1;
    }
}