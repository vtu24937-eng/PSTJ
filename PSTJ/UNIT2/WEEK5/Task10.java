Naive Pattern Searching Algorithm (Java)
 Approach
Slide pattern over text one by one
For each position, check character-by-character
If all characters match → print index


CODE : 


class Solution {
    public static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        String text = "THIS IS A TEST TEXT";
        String pattern = "TEST";

        search(text, pattern);
    }
}