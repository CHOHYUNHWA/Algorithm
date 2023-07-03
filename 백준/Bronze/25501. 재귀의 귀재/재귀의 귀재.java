import java.io.*;


public class Main{
    public static int[] recursion(String s, int l, int r, int[] answer){
        answer[1]++;
        if(l >= r) {
            answer[0] = 1;
            return answer;
        }
        else if(s.charAt(l) != s.charAt(r)){
            answer[0] = 0;
            return answer;
        }
        else return recursion(s, l+1, r-1, answer);
    }
    public static int[] isPalindrome(String s){
        int[] answer = new int[2];
        return recursion(s, 0, s.length()-1, answer);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            int[] answer = isPalindrome(s);
            sb.append(answer[0]).append(" ").append(answer[1]).append('\n');
        }
        System.out.println(sb);
    }
}