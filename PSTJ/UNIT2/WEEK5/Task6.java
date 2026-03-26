This is a Greedy + String Traversal problem.

  Key Idea

We only need to count adjacent equal characters.

If:

AA → delete 1
BB → delete 1

So just compare current character with previous.


CODE : 


class Result {

    public static int alternatingCharacters(String s) {
        int deletions = 0;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }
        
        return deletions;
    }

}