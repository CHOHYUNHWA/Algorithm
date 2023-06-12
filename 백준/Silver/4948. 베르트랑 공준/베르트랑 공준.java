import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int start = Integer.parseInt(br.readLine());
            if(start == 0){
                break;
            }
            int end = 2 * start;
            int count = 0;
            for (int i = start+1; i <= end; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
    static boolean isPrime(int a){
        if(a < 2){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
