import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double tmpX = Math.pow(x2 - x1, 2);
            double tmpY = Math.pow(y2 - y1, 2);
            double tmpR1 = Math.pow(r2 - r1, 2);
            double tmpR2 = Math.pow(r2 + r1, 2);

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append(-1).append(" ");
            } else if (tmpX + tmpY < tmpR1) {
                sb.append(0).append(" ");
            } else if (tmpX + tmpY > tmpR2) {
                sb.append(0).append(" ");
            } else if (tmpX + tmpY == tmpR1) {
                sb.append(1).append(" ");
            } else if (tmpX + tmpY == tmpR2) {
                sb.append(1).append(" ");
            } else {
                sb.append(2).append(" ");
            }
        }
        System.out.println(sb);
    }
}