/*
Problem Number: 33
Problem Name: Search in Rotated Sorted Array
Difficulty: Hard
Topic: Searching and Binary Search

APPROACH:
We use Binary Search to search the target.
First, we find the middle element.

If the middle element equals the target,
we return its index.

Otherwise, we check which half is sorted.
If the target is present in the sorted half,
we search that half.
Otherwise, we search the other half.

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

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {

                if (target >= nums[left] &&
                    target < nums[mid]) {

                    right = mid - 1;

                } else {
                    left = mid + 1;
                }

            } else {

                // Right half is sorted
                if (target > nums[mid] &&
                    target <= nums[right]) {

                    left = mid + 1;

                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}

/*
TEST CASE 1:
Input: nums = [4,5,6,7,0,1,2]
       target = 0
Output: 4

TEST CASE 2:
Input: nums = [4,5,6,7,0,1,2]
       target = 3
Output: -1

TEST CASE 3:
Input: nums = [1]
       target = 0
Output: -1

DRY RUN:
Input: [4,5,6,7,0,1,2]
Target = 0

Step 1:
left = 0, right = 6
mid = 3
nums[mid] = 7

Left half is sorted.
Target is not in the left half.
So, left = 4.

Step 2:
left = 4, right = 6
mid = 5
nums[mid] = 1

Left half is sorted.
Target is in the left half.
So, right = 4.

Step 3:
left = 4, right = 4
mid = 4
nums[mid] = 0

Target found at index 4.

Final Output: 4

TIME COMPLEXITY: O(log n)
SPACE COMPLEXITY: O(1)
*/
