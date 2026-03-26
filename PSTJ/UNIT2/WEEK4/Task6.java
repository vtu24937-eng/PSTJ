Optimal Approach (Two Pointers — In-place, O(n))
Use one pointer (insertPos) to track where next non-zero should go
First pass: move all non-zeros forward
Second pass: fill remaining with zeros



CODE : 
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}