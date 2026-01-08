package LeetcodeProblems;

public class BestTimeToBuyAndSellStock
{
    public static void main(String[] args)
    {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        System.out.println(findMaxProfit(stockPrices)+"  it's Best time to ");
    }

    public static int findMaxProfit(int[] stockPrices)
    {
        int lowestPrice = Integer.MAX_VALUE;
        int highestProfit = 0;

        for (int i = 0; i < stockPrices.length; i++)
        {
            int currentPrice = stockPrices[i];

            if (currentPrice < lowestPrice)
            {
                lowestPrice = currentPrice;
            }
            else if (currentPrice - lowestPrice > highestProfit)
            {
                highestProfit = currentPrice - lowestPrice;
            }
        }

        return highestProfit;
    }
}
