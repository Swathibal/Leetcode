// Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

// An input string is valid if:

// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.

// **Example 1:**

// ```
// Input: s = "()"
// Output: true

// ```

// **Example 2:**

// ```
// Input: s = "()[]{}"
// Output: true

// ```

// **Example 3:**

// ```
// Input: s = "(]"
// Output: false
// ```

class Solution {
    static int push(char c,int peek,char a[])
    {
        if(peek==-1)
            a[++peek]=c;
        else if(a[peek]=='(' && c==')')
        {
            peek--;
        }
        else if(a[peek]=='{' && c=='}')
        {
            peek--;
        }else if(a[peek]=='[' && c==']')
        {
            peek--;
        }
        else
            a[++peek]=c;
        return peek;
    }
    public boolean isValid(String s) {
        
        char ar[] = new char[s.length()];
        int top = -1;
        for(int i = 0;i<s.length();i++)
        {
            top=push(s.charAt(i),top,ar);
            //System.out.println(top);
        }
        if(top==-1)
            return true;
        else
           return false;
    }
}
