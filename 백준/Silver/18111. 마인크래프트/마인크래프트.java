import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int map[] = new int[257];
		int time = 99999999;
		int height = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[Integer.parseInt(st.nextToken())]++;
			}
		}
		// 모든 높이 탐색
		for (int i = 256; i >= 0; i--) {
			int temp_time = 0;
			int temp_b = b;
			// 모든 높이에 있는 블럭
			for (int j = 256; j >= 0; j--) {
				if (map[j] == 0) {
					continue;
				}

				if (j >= i) {
					temp_time += map[j] * 2 * (j - i);
				} else {
					temp_time += map[j] * (i - j);

				}
				temp_b += map[j] * (j-i);
			}
//			System.out.println(temp_b);
			if(temp_b<0) continue;
			if (temp_time <= time) {
				if(temp_time==time) {
					height = Math.max(height, i);
				}
				else {
					height=i;
				}
				time = temp_time;
			}
		}
		System.out.println(time + " " + height);
	}
}
