import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a));
    }

    public static String solution(int a) {
        String answer = "F";
        if (a >= 90 || a == 100) {
            return "A";
        }
        if (a >= 80 && a < 90) {
            return "B";
        }
        if (a >= 70 && a < 80) {
            return "C";
        }
        if (a >= 60 && a < 70) {
            return "D";
        }
        return answer;
    }
}