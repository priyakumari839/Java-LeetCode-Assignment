/*
Problem Number: 35
Problem Name: Search Insert Position
Difficulty: Medium
Topic: Searching and Binary Search

APPROACH:
We use Binary Search on a sorted array.
We calculate the middle index.
If the middle element equals the target,
we return its index.
If the target is greater, search the right half.
If the target is smaller, search the left half.
If the target is not found, return the left index.
This gives the correct insertion position.
*/

class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return left;
    }
}

/*
TEST CASE 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

TEST CASE 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

TEST CASE 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

DRY RUN:
Input: [1,3,5,6]
Target = 2

Step 1:
left = 0, right = 3
mid = 1
nums[1] = 3

3 > 2, so right = 0.

Step 2:
left = 0, right = 0
mid = 0
nums[0] = 1

1 < 2, so left = 1.

Now left > right.
Return left = 1.

Final Output: 1

TIME COMPLEXITY: O(log n)
SPACE COMPLEXITY: O(1)
*/
