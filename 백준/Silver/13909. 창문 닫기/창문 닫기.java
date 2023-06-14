import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long N = Integer.parseInt(br.readLine());
        int minCount = 1;
        int maxCount = 3;
        int tmp = 1;
        while(true){
             if(N >= (long) minCount *tmp && N <= (long) maxCount *tmp){
                 System.out.println(tmp);
                 break;
             }
             minCount++;
             maxCount++;
             tmp++;
        }
    }
}