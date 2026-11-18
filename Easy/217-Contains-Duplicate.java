/*
Problem Number: 217
Problem Name: Contains Duplicate
Difficulty: Easy
Topic: Arrays

APPROACH:
We use a HashSet to store array elements.
Before adding an element, we check whether
it is already present in the HashSet.
If it is present, we return true.
Otherwise, we add the element to the HashSet.
If no duplicate is found, we return false.

*/

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}

/*
TEST CASE 1:
Input: [1, 2, 3, 1]
Output: true

TEST CASE 2:
Input: [1, 2, 3, 4]
Output: false

TEST CASE 3:
Input: [1, 1]
Output: true

DRY RUN:
Input: [1, 2, 3, 1]

1 is added to the set.
2 is added to the set.
3 is added to the set.
1 is already present in the set.

Therefore, return true.

TIME COMPLEXITY: O(n) average
SPACE COMPLEXITY: O(n)
*/
