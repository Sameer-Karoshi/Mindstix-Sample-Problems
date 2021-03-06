class Solution {
    public int maxProfit(int[] prices) {
        //if array is empty then return 0 :)
        if(prices.length == 0) return 0;
        int min = prices[0], max = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i]-min);
            }
        }
        
        return max;
        
    }
}