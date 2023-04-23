class Solution {
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; left<=right; left++){
            int tmp = 0;
            for(int j=1; j<=left; j++){
                if(left%j == 0){
                    tmp++;
                }
            }
            if(tmp%2 == 0){
                answer += left;
            }else {answer -= left;}
        }
        return answer;
    }
}