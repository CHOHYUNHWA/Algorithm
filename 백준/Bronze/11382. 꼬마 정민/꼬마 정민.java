import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] xArr = x.split(" ");
        long answer = 0;
        for(int i = 0; i < xArr.length; i++) {
            answer += Long.parseLong(xArr[i]);
        }
        System.out.println(answer);
    }
}