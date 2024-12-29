package Arrays;

import java.util.Arrays;

public class Stocks {

	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		int min_cost = prices[0];
		int min_cost_index = 0;
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]<=min_cost)
			{
				min_cost=prices[i];
				min_cost_index=i;
			}
		}
		//System.out.println(min_cost+"........"+min_cost_index);
		
		int max_cost = 0;
        for(int i = min_cost_index+1;i<prices.length;i++)
        {
            if(prices[i]>=max_cost)
            {
                max_cost = prices[i];
            }
        }
        
        //System.out.println(max_cost+"........"+max_cost_index);
        //System.out.println(prices[max_cost_index]-prices[min_cost_index]);
        
        Arrays.sort(prices);
        for(int i : prices)
        {
        	System.out.println(i);
        }
        

	}

}
