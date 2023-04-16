import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a));
    }

    public static int solution(int a) {
        int answer = 0;
        if(a%4 ==0 && a%100!=0){
            answer = 1;
        }
        if(a%400==0){
            answer = 1;
        }

        return answer;
    }
}