// Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String rev="",normal="";
        String regex = "[abcdefghijklmnopqrstuvwxyz1234567890]";
        for(int i=0;i<str.length();i++)
        {
            if(String.valueOf(str.charAt(i)).matches(regex))
            {
                normal+=str.charAt(i);
                rev=str.charAt(i)+rev;
            }
        }
        if(normal.equals(rev))
           return true;
        return false;
    }
}

(or)

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
    int right = s.length() - 1;
    char leftChar; 
    char rightChar; 
    
    
    while (left <= right) {
      
      leftChar = s.charAt(left);
      rightChar = s.charAt(right);
      
      if (!Character.isLetterOrDigit(leftChar)) {
        left++;
      } else if (!Character.isLetterOrDigit(rightChar)) {
        right--;
      } else {
        
        if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
          return false;
        }
        left++;
        right--;
      }
    }
    return true;
  }
}
