/*
Problem Number: 1672
Problem Name: Richest Customer Wealth
Difficulty: Easy
Topic: 2D Arrays and Nested Loops

APPROACH:
We use nested loops to calculate the total wealth
of each customer.
The outer loop selects each customer.
The inner loop adds the money in all their accounts.
We find and return the maximum wealth.

*/

class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}

/*
TEST CASE 1:
Input: [[1,2,3],[3,2,1]]
Output: 6

TEST CASE 2:
Input: [[1,5],[7,3],[3,5]]
Output: 10

DRY RUN:
Customer 1 = 1 + 2 + 3 = 6
Customer 2 = 3 + 2 + 1 = 6

Maximum Wealth = 6

TIME COMPLEXITY: O(m * n)
SPACE COMPLEXITY: O(1)
*/
