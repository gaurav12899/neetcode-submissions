class Solution {
    fun maxProfit(prices: IntArray): Int {
        var mxProfit = 0
        var buyPrice = prices[0]
        for(i in 1 until prices.size){
            if(prices[i]>buyPrice){
                var profit = prices[i]-buyPrice
                mxProfit = max(profit,mxProfit)
            }else{
                buyPrice = prices[i]
            }
        }
        return mxProfit
    }
}
