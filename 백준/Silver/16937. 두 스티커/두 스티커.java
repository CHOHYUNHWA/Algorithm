import java.io.*;
import java.util.*;

public class Main {
    static class sticker{
        int h, w;
        public sticker(int h, int w) {
            this.h = h;
            this.w = w;
        }
    }
    static int H,W,N, answer = 0;
    static ArrayList<sticker> info = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if((h > H && h > W) || (w > W && w > H))
                continue;
            info.add(new sticker(h, w));
        }
        cal();
        System.out.println(answer);
    }
    static void cal(){
        for(int i=0;i<info.size();i++){
            sticker cur = info.get(i);
            int size = cur.h * cur.w;
            int tempH = H - cur.h;
            int tempW = W - cur.w;
            if(tempH>=0 && tempW>=0)	
                secondSticker(i, tempH, tempW, size);

            tempH = H - cur.w;
            tempW = W - cur.h;
            if(tempH>=0 && tempW>=0)	
                secondSticker(i, tempH, tempW, size);
        }
    }
    static void secondSticker(int index, int h, int w, int size){
        int secondSize = 0;
        for(int i=index+1;i<info.size();i++){
            sticker cur = info.get(i);
            int tempSize = cur.h * cur.w;	
            if((cur.h <= h && cur.w <= W) || (cur.h <= H && cur.w <= w)
                    ||(cur.w <=h && cur.h <=W) || (cur.w <=H && cur.h <= w))
                secondSize = Math.max(secondSize, tempSize);
        }
        if(secondSize!=0)
            answer = Math.max(answer, size+secondSize);
    }
}