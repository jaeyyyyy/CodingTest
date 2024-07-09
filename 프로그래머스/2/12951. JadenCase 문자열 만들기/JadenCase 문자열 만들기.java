class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty()) { // 빈칸이 아니라면
                char first = arr[i].charAt(0);
                if(first>=65) { // 알파벳으로 시작할 경우
                    
                        arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1, arr[i].length());
                    
                }
                sb.append(arr[i]).append(" ");
            } else { // 빈칸이라면
                sb.append(" ");
            }
        }
        
        if(s.substring(s.length()-1, s.length()).isEmpty()) { // 마지막 글자가 공백이라면
            return sb.toString();
        }
        return sb.substring(0, s.length()).toString();
    }
}