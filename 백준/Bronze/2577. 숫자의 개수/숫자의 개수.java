import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int multiple = A * B * C;
        String[] multipleArr = String.valueOf(multiple).split("");
        for(int i = 0; i < multipleArr.length; i++)
            arr[Integer.parseInt(multipleArr[i])]++;
        for (int i : arr) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}