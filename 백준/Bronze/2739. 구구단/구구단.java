import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        solution(a);
    }
    public static void solution(int a) {
        int answer = 0;
        for(int i =1; i<=9; i++){
            System.out.println(a +" * "+i + " = " + a*i);
        }
    }
}