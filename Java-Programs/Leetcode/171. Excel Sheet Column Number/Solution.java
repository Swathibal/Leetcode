// Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.

// For example:

// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28 
// ...


class Solution {
    public int titleToNumber(String columnTitle) {
        int digit = 0,ans=0;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            ans+=((columnTitle.charAt(i)-'A')+1) * Math.pow(26,digit);
            digit++;
        }
        return ans;
    }
}
