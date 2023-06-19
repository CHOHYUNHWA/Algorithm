import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 0;
        int mode = 0;
        for(int i = 0; i< N; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num+4000]++;
            sum += num;
            max = Math.max(max,num);
            min = Math.min(min,num);
        }

        int count = 0;
        int mode_max = 0;
        boolean flag = false;

        for(int i = min + 4000; i<= max+4000; i++){
            if(arr[i] > 0){
                if(count < (N+1) /2){
                    count += arr[i];
                    median = i - 4000;
                }

                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if(mode_max == arr[i] && flag){
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        int average = (int)Math.round((double)sum/N);
        int range = max-min;
        sb.append(average).append('\n')
                .append(median).append('\n')
                .append(mode).append('\n')
                .append(range).append('\n');
        System.out.println(sb);
    }
}