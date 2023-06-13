import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] prime = new boolean[1000001];
        isPrime(prime);
        prime[0] = prime[1] = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 2; j <= N/2; j++){
                int tmp = N - j;
                if(!prime[tmp] && !prime[j]){
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
    static void isPrime(boolean[] prime) {
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}