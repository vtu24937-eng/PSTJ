Check Substrings (Brute Force — Optimal for Constraints)

Since:

words.length ≤ 100
word length ≤ 30

A simple double loop + contains() is efficient enough.

 Approach
Compare every word with every other word
If words[i] is substring of words[j], add to result


CODE : 

import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}