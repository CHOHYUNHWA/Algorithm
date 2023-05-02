import java.io.*;
import java.util.*;

class Solution {
    public static int solution(int[] nums){
        int answer = 0;
        int max = nums.length/2;
        int[] arr = Arrays.stream(nums).distinct().toArray();
        if(arr.length >= max){
            answer = max;
        } else {
            answer = arr.length;
        }
        return answer;
    }
}