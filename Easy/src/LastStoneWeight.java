//Amazon
// We have a collection of stones, each stone has a positive integer weight.

// Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

// If x == y, both stones are totally destroyed;
// If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
// At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
class Solution {
     public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxPq = new PriorityQueue<>(stones.length, Comparator.reverseOrder());
        for (int stone : stones) {//Add stones to the queue in descending order
            maxPq.add(stone);
        }
        while (maxPq.size() >= 2) {
            int y = maxPq.poll();//takes the front of the queue and removes it too.
            int x = maxPq.poll();
            if (y > x) {//Only add elements where y-x!=0 after extracting y and x
                maxPq.add(y - x);
            }
        }
        return maxPq.isEmpty() ? 0 : maxPq.peek();
    }
}
