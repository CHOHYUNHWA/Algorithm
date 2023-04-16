import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a));
    }
    public static int solution(int a) {
        int answer = 0;
        String string = "";
        string = Integer.toString(a);
        String[] stringArr = string.split("");
        Arrays.sort(stringArr,Collections.reverseOrder());
        string = String.join("",stringArr);
        answer = Integer.parseInt(string);
        return answer;

    }
}