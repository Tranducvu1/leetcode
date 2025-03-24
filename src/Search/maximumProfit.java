package Search;

public class maximumProfit {
	 public static int maximumProfit(int prices[]) {
		 if(prices == null || prices.length <2) {
				return 0;
			}
		    int maxProfis =0;
		    int minPrices = Integer.MAX_VALUE;
		    for(int price : prices) {
		    	minPrices = Math.min(price, minPrices);
		    	maxProfis = Math.max(maxProfis, price - minPrices);
		    }
			return maxProfis;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7, 10, 1, 3, 6, 9, 2};
		System.out.println(maximumProfit(prices));
	}

}
