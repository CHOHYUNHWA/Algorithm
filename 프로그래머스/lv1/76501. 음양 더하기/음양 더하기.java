class Solution {
    public static void main(String[] args) {
        int[] absolutes = {3,6,7,8};
        boolean[] signs = {true,true,false,true};
    }
    int answer = 0;
    public int solution(int[] absolutes, boolean[] signs) {
        int[] tmp = new int[signs.length];
        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == true){
                tmp[i] = absolutes[i];
            } else {
                tmp[i] = -absolutes[i];
            }
        }
        for(int i=0; i<absolutes.length; i++){
            answer = answer + tmp[i];
        }

        return answer;
    }
}