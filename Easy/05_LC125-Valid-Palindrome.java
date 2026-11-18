/*
Problem Number: 125
Problem Name: Valid Palindrome
Difficulty: Easy
Topic: Strings and Conditions

APPROACH:
We use two pointers, left and right.
We ignore spaces and special characters.
We convert uppercase letters into lowercase.
Then we compare characters from both ends.
If characters are different, return false.
If all characters match, return true.

*/

class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char a = Character.toLowerCase(s.charAt(left));
            char b = Character.toLowerCase(s.charAt(right));

            if (a != b) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

/*
TEST CASE 1:
Input: "A man, a plan, a canal: Panama"
Output: true

TEST CASE 2:
Input: "race a car"
Output: false

TEST CASE 3:
Input: " "
Output: true

DRY RUN:
Input: "madam"

m == m
a == a
d == d

All characters match.

Final Output: true

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/
