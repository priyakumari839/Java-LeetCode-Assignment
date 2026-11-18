/*
Problem Number: 121
Problem Name: Best Time to Buy and Sell Stock
Difficulty: Medium
Topic: Arrays, Loops and If/Else

APPROACH:
We find the minimum stock price while traversing the array.
We calculate the profit by subtracting the minimum price
from the current price.
We update the maximum profit whenever we find a better profit.
Finally, we return the maximum profit.
*/

class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            else {
                int profit = prices[i] - minPrice;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}

/*
TEST CASE 1:
Input: [7,1,5,3,6,4]
Output: 5

TEST CASE 2:
Input: [7,6,4,3,1]
Output: 0

DRY RUN:
Input: [7,1,5,3,6,4]

Minimum price = 7
Price 1: Minimum price = 1
Price 5: Profit = 5 - 1 = 4
Price 3: Profit = 3 - 1 = 2
Price 6: Profit = 6 - 1 = 5
Price 4: Profit = 4 - 1 = 3

Maximum Profit = 5

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/
