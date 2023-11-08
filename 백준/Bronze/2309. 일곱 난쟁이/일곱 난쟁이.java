import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr  = new int[9];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);


        for(int a  = 0; a < arr.length-6; a++){
            for(int b = a+1; b < arr.length-5; b++){
                for(int c = b+1; c < arr.length-4; c++){
                    for(int d = c+1; d < arr.length-3; d++){
                        for(int e = d+1; e < arr.length-2; e++){
                            for(int f = e+1; f < arr.length-1; f++){
                                for(int g = f+1; g < arr.length; g++){
                                    if(arr[a] + arr[b] + arr[c] + arr[d] + arr[e] + arr[f] + arr[g] == 100){
                                        sb.append(arr[a]).append('\n');
                                        sb.append(arr[b]).append('\n');
                                        sb.append(arr[c]).append('\n');
                                        sb.append(arr[d]).append('\n');
                                        sb.append(arr[e]).append('\n');
                                        sb.append(arr[f]).append('\n');
                                        sb.append(arr[g]).append('\n');
                                        System.out.println(sb);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}