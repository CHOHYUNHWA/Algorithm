class Solution {
    public int solution(int a, int b, int n) {
        if(n < 2){
            return 0;
        }
        int answer = 0;
        while(n >= a){
            answer += n/a*b;
            n = n/a*b + n%a;
        }
        return answer;
    }
}

