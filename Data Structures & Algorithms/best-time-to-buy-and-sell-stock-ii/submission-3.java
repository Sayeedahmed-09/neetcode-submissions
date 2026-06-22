class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int n=prices.length;

        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                max_profit+=prices[i]-prices[i-1];
            }
        }
        return max_profit;
    }
}