// a subsequence obtained by deleting chars in original string, and needed not to be consecutive
// a substring needed to be consecutive
// to be clare, ask interviewer to clarify this meaning
//
// this question only has 3 possible
// because the string has only two kinds of char - a and b
// so, return 0 if string is empty
// return 1 if string is palindrome
// return 2 if not palindrome
// since we can delete all a's and then delete all b's
// to let the string s to be empty
class Solution {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        String reversedString = new StringBuilder(s).reverse().toString();
        if (rebersedString.equals(s)) {
            return 1;
        }
        return 2;
    }
}

// time complexity is O(N) since we reversed the string cost O(N)
// space is also O(N) since we new a StringBuilder and reverse it cost O(N)
