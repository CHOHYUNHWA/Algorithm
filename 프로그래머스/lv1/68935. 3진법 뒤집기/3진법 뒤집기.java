import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Solution {
     public static int solution(int n) {
        if(n<=3){
            return n;
        }
        int answer = 0;
        int tmp = n;
        String answerString = "";
        for(int i = 0; i <tmp/3; i++){
            answerString += n%3;
            n = n/3;
            if(n==0){
            break;}
        }
        String[] answerArr = answerString.split("");
        List<String> answerList = Arrays.asList(answerArr);
        Collections.reverse(answerList);
        answerArr = answerList.toArray(answerArr);

        answer += Integer.parseInt(answerArr[0]);
        for(int i = answerArr.length-1; i > 0; i--){
            answer += Integer.parseInt(answerArr[i])*Math.pow(3,i);
        }
        return answer;
    }
}
