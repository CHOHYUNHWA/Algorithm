import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] tmp = new int[a];
        for(int i = 0; i< a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            tmp[i] = b+c;
        }
        for(int i=0; i< a; i++) {
            System.out.println(tmp[i]);
        }
    }
}