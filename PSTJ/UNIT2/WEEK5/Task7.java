This is a classic Sliding Window + HashSet problem.

 Idea
Use two pointers (left and right) to maintain a window of unique characters.
Move right pointer to expand the window.
If a duplicate appears, move left pointer until the duplicate is removed.
Keep track of the maximum length seen.

This gives O(n) time complexity.

CODE : 

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current) + 1);
            }

            map.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}