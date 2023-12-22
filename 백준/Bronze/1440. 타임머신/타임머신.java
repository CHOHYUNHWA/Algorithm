import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] timeStr = reader.readLine().split(":");
        int[] time = new int[3];
        for (int i = 0; i < 3; i++) {
            time[i] = Integer.parseInt(timeStr[i]);
        }

        int count = 0;

        for (int h = 0; h < 3; h++) {
            for (int m = 0; m < 3; m++) {
                for (int s = 0; s < 3; s++) {
                    if (h != m && m != s && s != h) {
                        if (time[h] >= 1 && time[h] <= 12 && time[m] >= 0 && time[m] <= 59 && time[s] >= 0 && time[s] <= 59) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}