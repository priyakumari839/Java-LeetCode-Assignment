/*
Problem Number: 1480
Problem Name: Running Sum of 1d Array
Difficulty: Easy
Topic: Arrays and Loops

LOGIC:
We start the loop from index 1.
We add the previous element to the current element.
This creates the running sum in the same array.
*/

class Solution {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}

/*
TEST CASE 1:
Input:  [1, 2, 3, 4]
Output: [1, 3, 6, 10]

TEST CASE 2:
Input:  [1, 1, 1, 1, 1]
Output: [1, 2, 3, 4, 5]

DRY RUN:
[1, 2, 3, 4]

2 + 1 = 3
3 + 3 = 6
4 + 6 = 10

Final Output: [1, 3, 6, 10]

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/
