/*
Problem Number: 344
Problem Name: Reverse String
Difficulty: Easy
Topic: Arrays and Two Pointers

APPROACH:
We use two pointers: left and right.
The left pointer starts from the beginning.
The right pointer starts from the end.
We swap the characters at both positions.
Then move left forward and right backward.
We repeat until both pointers meet.

TEST CASE 1:
Input:  ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

TEST CASE 2:
Input:  ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

DRY RUN:
Input: ["h","e","l","l","o"]

Step 1: Swap h and o
Array: ["o","e","l","l","h"]

Step 2: Swap e and l
Array: ["o","l","l","e","h"]

Final Output: ["o","l","l","e","h"]

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/

class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
