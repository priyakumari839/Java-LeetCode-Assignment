/*
Problem Number: 1470
Problem Name: Shuffle the Array
Difficulty: Easy
Topic: Arrays

APPROACH:
We create a new array to store the shuffled elements.
The first half contains x elements.
The second half contains y elements.
We take one element from each half alternately.
Finally, we return the shuffled array.

*/

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {

            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];

        }

        return result;
    }
}

/*
TEST CASE 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]

TEST CASE 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

DRY RUN:
Input: [2,5,1,3,4,7]
n = 3

First half:  [2,5,1]
Second half: [3,4,7]

Step 1: Take 2 and 3
Step 2: Take 5 and 4
Step 3: Take 1 and 7

Final Output: [2,3,5,4,1,7]

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
*/
