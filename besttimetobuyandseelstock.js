/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
     let minPrice = Infinity;
     let maxPrice = 0;
    for(let i=0;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i] ;
            } else {
            let profit = prices[i] - minPrice;
            maxPrice = Math.max(maxPrice, profit);
            }
    }
    return maxPrice;
};