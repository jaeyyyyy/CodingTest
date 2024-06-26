class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int[] nArr = new int[sArr.length];
        for(int i = 0; i < sArr.length; i++) {
            nArr[i] = Integer.parseInt(sArr[i]);
        }
        int max = nArr[0];
        int min = nArr[0];
        
        for(int i = 1; i < nArr.length; i++) {
            if(nArr[i] > max) {
                max = nArr[i];
            }
            if(nArr[i] < min) {
                min = nArr[i];
            }
        }
        
        return Integer.toString(min) + " " + Integer.toString(max);
    }
}