class GfG {
    
    static int maximumProfit(int[] prices) {
        int res = 0;

        // Keep on adding the difference between
        // adjacent when the prices a
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) 
                res += prices[i] - prices[i - 1];
        }
        
        return res;
    }
}
