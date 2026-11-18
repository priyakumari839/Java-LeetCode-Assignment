/*
Problem Number: 709
Problem Name: To Lower Case
Difficulty: Easy
Topic: Strings and Character Operations

APPROACH:
We convert the string into a character array.
We check each character.
If a character is an uppercase English letter,
we convert it into lowercase by adding 32.
Finally, we return the new string.
*/

class Solution {
    public String toLowerCase(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }

        return new String(chars);
    }
}

/*
TEST CASE 1:
Input: "Hello"
Output: "hello"

TEST CASE 2:
Input: "LOVELY"
Output: "lovely"

TEST CASE 3:
Input: "here"
Output: "here"

DRY RUN:
Input: "HELLO"

H -> h
E -> e
L -> l
L -> l
O -> o

Final Output: "hello"

TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
*/
