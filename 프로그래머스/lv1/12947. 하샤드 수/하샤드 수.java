class Solution {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
    } //테스트케이스 코드
    public static boolean solution(int x) {
        boolean answer = true; //리턴값 초기화
        int temp = 0; // String으로 변한 x배열의 합을 저장할 변수 초기화
        String Stringx = Integer.toString(x); //x를 String으로 변환
        for (int i = 0; i < Stringx.length(); i++) {
            temp = temp + Character.getNumericValue(Stringx.charAt(i));
        }//반복문으로 String의 요소들을 int로 변환후 더해줌
        if (x % temp == 0) {
            answer = true;
        } else {
            answer = false;
        }//x를 temp로 나누었을때 나머지가 0이면 true 아니면 false를 answer에 담음
        return answer;
    }//리턴값 반환
}