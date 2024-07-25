class Solution {
    public int solution(int n) {
        int answer = 0;
        int ncount = binaryCount(n);
        
        while(true) {
            answer = ++n;
            if(binaryCount(answer) == ncount) {
                return answer;
            }
        }
    }
    
    public static int binaryCount(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        
        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i)=='1') {
                count++;
            }
        }
        
        return count;
    }
}