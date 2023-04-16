import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a,b));
    }
    public static int solution(int a, int b) {
        int answer = 0;
        if(a > 0 && b > 0){
            answer = 1;
        }
        if(a < 0 && b > 0){
            answer = 2;
        }
        if(a < 0 && b < 0){
            answer = 3;
        }
        if(a > 0 && b < 0){
            answer = 4;
        }
        return answer;
    }
}