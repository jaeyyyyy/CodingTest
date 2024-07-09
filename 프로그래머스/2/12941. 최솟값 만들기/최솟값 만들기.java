import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        int []C = new int[A.length];
        int index = 0;
        for(int i=A.length-1; i>=0; i--) {
            C[index] = A[i];
            index++;
        }
        
        for(int i = 0; i<A.length; i++) {
            answer += B[i] * C[i];
        }
        return answer;
    }
}