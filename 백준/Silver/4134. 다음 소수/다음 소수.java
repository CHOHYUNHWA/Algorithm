import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            long tmp = Long.parseLong(br.readLine());
            while(true){
                if(tmp == 0 || tmp == 1){
                    sb.append(2).append('\n');
                    break;
                }
                if(getDecimal(tmp)){
                    sb.append(tmp).append('\n');
                    break;
                }
                tmp++;
            }
        }
        System.out.println(sb);
    }
    static boolean getDecimal(long a){
        for(long i = 2; i<= Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}