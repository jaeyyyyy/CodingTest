class Solution {
    public int solution(int n, long l, long r) {
        int answer = 0;
        for(l = l - 1; l < r; l++) {
            if(isOne(l)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean isOne(long num) {
        if(num % 5 == 2) {
            return false;
        } else if (num < 5 && num % 5 != 2) {
            return true;
        }
        return isOne(num / 5);
    }
}