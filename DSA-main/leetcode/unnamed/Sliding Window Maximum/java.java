import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int[] arr = new int[nums.length - k + 1];
        int r = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i >= k - 1) {
                arr[r++] = nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}