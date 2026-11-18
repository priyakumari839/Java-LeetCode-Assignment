/*
Problem Number: 912
Problem Name: Sort an Array
Difficulty: Medium
Topic: Sorting and Arrays

APPROACH:
We use Merge Sort to sort the array.
First, divide the array into two halves.
Then recursively sort both halves.
Finally, merge both sorted halves into one sorted array.

TEST CASE 1:
Input: [5,2,3,1]
Output: [1,2,3,5]

TEST CASE 2:
Input: [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]

DRY RUN:
Input: [5,2,3,1]

Divide into:
[5,2] and [3,1]

Sort both halves:
[2,5] and [1,3]

Merge:
[1,2,3,5]

Final Output: [1,2,3,5]

TIME COMPLEXITY: O(n log n)
SPACE COMPLEXITY: O(n)
*/

class Solution {

    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}

/*
TEST CASE 3:
Input: [1]
Output: [1]

*/
