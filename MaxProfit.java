package my;

public class MaxProfit 
{
	public static void main(String[] args) 
	{

		int stocks[]={10,05,30,60,20,30};
		
			  double min = 0;
			  double maxDiff = 0;
			  int buy_day=0;
			  int sell_day=0;
			  for (int i = 0; i < stocks.length; i++) {
			    //if (stocks[i] < stocks[min])
			      //min = i;
				  if(i<(stocks.length-1))
				  {
			    int diff = stocks[i+1] - stocks[i];
			    if (diff > maxDiff) {
			      buy_day= i;
			      sell_day= i+1;
			      maxDiff = diff;
			    }
			  }
			
		}
			  System.out.println("Max Profit is "+maxDiff+" when you buy that on day "+(buy_day+1)+" and you sell that on day "+(sell_day+1));
}
}