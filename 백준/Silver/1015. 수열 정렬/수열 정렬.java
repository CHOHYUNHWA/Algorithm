import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        int[] sortedArr = new int[x];
        int[] answerArr = new int[x];
        for(int i = 0; i < x ; i++){
            arr[i] = sc.nextInt();
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        Arrays.fill(answerArr,-1);

        for(int i = 0; i<answerArr.length; i++){
            for(int j = 0; j < answerArr.length; j++){
                if(sortedArr[i] == arr[j] && answerArr[j] == -1){
                    answerArr[j] = i;
                    break;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < answerArr.length; i++){
            sb.append(answerArr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}