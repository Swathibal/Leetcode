// You are given a string `s`. You can convert `s` to a palindrome by adding characters in front of it.

// Return *the shortest palindrome you can find by performing this transformation*.

// **Example 1:**

// ```
// Input: s = "aacecaaa"
// Output: "aaacecaaa"

// ```

// **Example 2:**

// ```
// Input: s = "abcd"
// Output: "dcbabcd"
// ```


class Solution {
    public String shortestPalindrome(String s) {
        int i = 0,end = s.length()-1,j = end;
        char a[] = s.toCharArray();
        while(i<j)
        {
            if(a[i]==a[j])
            {
                i++;
                j--;
            }
            else
            {
                i=0;
                end--;
                j=end;
            }
        }
        return new StringBuilder(s.substring(end+1)).reverse().toString() + s; 
    }
}
