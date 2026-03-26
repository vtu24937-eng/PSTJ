This is the classic Maximum Subarray problem.
The optimal solution uses Kadane's Algorithm.

Optimal Solution — Kadane's Algorithm (O(n))
Idea
Keep track of current sum
If current sum becomes negative → reset to 0
Track maximum sum seen so far





CODE : 

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        for (int num : nums) {
            if (currSum < 0)
                currSum = 0;

            currSum += num;
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}