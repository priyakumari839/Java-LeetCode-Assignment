/*
Problem Number: 704
Problem Name: Binary Search
Difficulty: Easy
Topic: Searching and Arrays

APPROACH:
Binary Search works on a sorted array.
We use two pointers: left and right.
Find the middle element of the array.
If the middle element equals the target,
return its index.
If the target is greater, search the right half.
If the target is smaller, search the left half.
If the target is not found, return -1.
*/

class Solution {
    public int search(int[] nums, int target) {

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

        return -1;
    }
}

/*
TEST CASE 1:
Input: nums = [-1,0,3,5,9,12]
       target = 9
Output: 4

TEST CASE 2:
Input: nums = [-1,0,3,5,9,12]
       target = 2
Output: -1

DRY RUN:
Array = [-1,0,3,5,9,12]
Target = 9

Step 1:
left = 0, right = 5
mid = 2
nums[mid] = 3
3 < 9, so search right half.

Step 2:
left = 3, right = 5
mid = 4
nums[mid] = 9
Target found at index 4.

Final Output: 4

TIME COMPLEXITY: O(log n)
SPACE COMPLEXITY: O(1)
*/
