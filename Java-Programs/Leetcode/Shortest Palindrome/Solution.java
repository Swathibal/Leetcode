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
