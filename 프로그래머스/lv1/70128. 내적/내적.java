class Solution {
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        int answerList[] = new int[a.length];
        for(int i =0; i<answerList.length; i++){
            answerList[i] = a[i]*b[i];
            answer += answerList[i];
        }
        return answer;
    }
}