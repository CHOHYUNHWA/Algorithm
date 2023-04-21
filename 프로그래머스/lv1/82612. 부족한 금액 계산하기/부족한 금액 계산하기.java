class Solution {
    public static long solution(int price, int money, int count) {
        long tmp = 0;
        for(int i = 1; i<=count; i++){
            tmp = tmp + price*i;
        }
        long result = tmp-money;
        if(money-tmp >= 0)return 0;

        return result;
    }
}