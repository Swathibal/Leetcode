// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

 

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".
// Example 2:

// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".
// Example 3:

// Input: s = "a##c", t = "#a#c"
// Output: true
// Explanation: Both s and t become "c".
// Example 4:

// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".
  
  import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        s="";
        t="";
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]=='#' && !stack.empty())
                stack.pop();
            else if(s1[i]!='#')
            {
                stack.push(String.valueOf(s1[i]));
            }
        }
         while(!stack.empty())
        {
            s+=stack.pop();
        }
        for(int j=0;j<t1.length;j++)
        {
            if(t1[j]=='#' && !stack.empty())
                stack.pop();
            else if(t1[j]!='#')
            {
                stack.push(String.valueOf(t1[j]));
            }
        }
       
        while(!stack.empty())
        {
            t+=stack.pop();
        }
        if(s.equals(t))
            return true;
        
        return false;
        
    }
}
