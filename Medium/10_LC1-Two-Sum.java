/*
Problem Number: 1
Problem Name: Two Sum
Difficulty: Medium
Topic: Arrays and Methods

APPROACH:
We use two nested loops to check pairs of numbers.
The outer loop selects the first number.
The inner loop selects the second number.
If their sum equals the target, we return their indices.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}

/*
TEST CASE 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

TEST CASE 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

DRY RUN:
Input: [2,7,11,15]
Target = 9

i = 0, j = 1
nums[0] + nums[1] = 2 + 7 = 9

Target found.
Return indices [0,1].

TIME COMPLEXITY: O(n^2)
SPACE COMPLEXITY: O(1)
*/
