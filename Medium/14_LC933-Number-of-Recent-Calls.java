/*
Problem Number: 933
Problem Name: Number of Recent Calls
Difficulty: Medium
Topic: Class Design and Methods

APPROACH:
We use a Queue to store the ping times.
When a new ping comes, we add its time to the queue.
We remove all calls that are older than 3000 milliseconds.
Finally, we return the size of the queue.
*/

import java.util.Queue;
import java.util.LinkedList;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.add(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}

/*
TEST CASE 1:

Input:
ping(1)
ping(100)
ping(3001)
ping(3002)

Output:
[1, 2, 3, 3]

TEST CASE 2:

Input:
ping(1)
ping(3000)
ping(3001)
ping(6000)

Output:
[1, 2, 3, 3]

DRY RUN:

ping(1):
Queue = [1]
Output = 1

ping(100):
Queue = [1, 100]
Output = 2

ping(3001):
Queue = [1, 100, 3001]
Output = 3

ping(3002):
Remove 1 because 1 < 2.
Queue = [100, 3001, 3002]
Output = 3

TIME COMPLEXITY: O(1) Amortized
SPACE COMPLEXITY: O(3000) Bounded
*/
