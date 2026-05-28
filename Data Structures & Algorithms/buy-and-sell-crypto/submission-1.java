class Solution {
    public int maxProfit(int[] prices) {


      int min=Integer.MAX_VALUE;
      int maxProfit=Integer.MIN_VALUE;

      for(int price:prices){

        if(price < min){
            min=price;
        }
         else if(price > min){
            maxProfit=Math.max(price-min,maxProfit);
            

        }
      }

      return maxProfit == Integer.MIN_VALUE ? 0 : maxProfit;

        
    }
}
