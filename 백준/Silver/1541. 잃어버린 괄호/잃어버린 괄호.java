import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] sArr = s.split("-");
        int sum = Integer.MAX_VALUE;

        for(int i = 0; i < sArr.length; i++){
            int tmp = 0;
            String[] minus = sArr[i].split("\\+");
            for(int j = 0; j < minus.length; j++){
                tmp += Integer.parseInt(minus[j]);
            }
            if(sum == Integer.MAX_VALUE){
                sum = tmp;
            } else {
                sum -= tmp;
            }

        }
        System.out.println(sum);
    }
}