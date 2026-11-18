/*
Problem Number: 75
Problem Name: Sort Colors
Difficulty: Hard
Topic: Sorting, Arrays and In-place Algorithms

APPROACH:
We use three pointers: low, mid and high.

0: Move to the beginning.
1: Keep in the middle.
2: Move to the end.

We check the element at mid:
If it is 0, swap it with low.
If it is 1, move mid forward.
If it is 2, swap it with high.

This sorts the array in one pass.
*/

class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}

/*
TEST CASE 1:
Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

TEST CASE 2:
Input: [2,0,1]
Output: [0,1,2]

DRY RUN:
Input: [2,0,2,1,1,0]

Step 1: Swap 2 with 0
Array: [0,0,2,1,1,2]

Step 2: Move 0 to the beginning
Array: [0,0,2,1,1,2]

Step 3: Swap 2 with 1
Array: [0,0,1,1,2,2]

Step 4: Process remaining 1s.

Final Output: [0,0,1,1,2,2]

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/
