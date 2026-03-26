This is Maximum Subarray Sum in Circular Array.


Key Idea

There are 2 possible cases:

Case 1 — Normal Maximum Subarray

Use Kadane's Algorithm

Case 2 — Circular Maximum Subarray

If max subarray wraps around, then:

maxCircular = totalSum - minSubarray

So we calculate:

maxSubarray (Kadane)
minSubarray (Kadane variation)
totalSum


CODE : 

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int totalSum = 0;
        int maxSum = nums[0];
        int currMax = 0;

        int minSum = nums[0];
        int currMin = 0;

        for (int num : nums) {
            totalSum += num;

            // Kadane for max subarray
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Kadane for min subarray
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        // if all numbers are negative
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}

