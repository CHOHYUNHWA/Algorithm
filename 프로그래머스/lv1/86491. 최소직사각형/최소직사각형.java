import java.util.Arrays;

class Solution {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        for(int i =0; i < sizes.length; i++){
            if(sizes[i][1] > max){
                max = sizes[i][1];
            }
            if(sizes[i][0] > min){
                min = sizes[i][0];
            }
        }
        answer = max*min;
        return answer;
    }
}

