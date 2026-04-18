class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var buyPrice = prices[0]
        for(i in 1.. prices.size-1){
            if(buyPrice>prices[i]){
                buyPrice = prices[i]
            }else{
                profit = maxOf(profit,prices[i]-buyPrice)
            }
        }
        return profit
    }
}
