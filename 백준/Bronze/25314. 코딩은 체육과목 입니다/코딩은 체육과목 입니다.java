import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String answer = "int";
        for(int i = 0; i<x/4; i++){
            answer = "long " + answer;
        }
        System.out.println(answer);
    }
}