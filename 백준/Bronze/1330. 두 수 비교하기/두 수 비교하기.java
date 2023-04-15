import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
        System.out.println(solution(a,b));
}
        public static String solution(int a, int b){
            String answer = "";
            if (a<b){
                answer = "<";
            } else if(a>b){
                answer = ">";
            } else {
                answer = "==";
            }
            return answer;
        }

}