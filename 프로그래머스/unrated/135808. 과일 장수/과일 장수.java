import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
    ArrayList<Integer> tmpArray = new ArrayList<Integer>();
        int answer = 0;
        int tmp = 0;
        Arrays.sort(score);
        for(int i = 0; i < score.length; i++){
            tmpArray.add(score[i]);
        }
        for(int i = 0; i < score.length/m; i++) {
            ArrayList<Integer> ansArray = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                ansArray.add(tmpArray.get(tmpArray.size() - 1 - j));
            }
            answer += m*ansArray.get(ansArray.size()-1);
            for(int j = 0; j < m; j++) {
                if(tmpArray.size()<=m ){
                    return answer;
                }
                tmpArray.remove(tmpArray.size()-1-j);
            }
        }
        return answer;
    }
}
//k 사과품질
//m 한상자에 들어가는 사과 개수
//배열을 정렬시킨다. {1,1,1,2,2,2,3,3,3}
//사과를 m개 만큼 담는다. 담을때마다 tmp에 더해준다.
