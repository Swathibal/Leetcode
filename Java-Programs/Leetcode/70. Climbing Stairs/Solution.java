// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step

class Solution {
    public int climbStairs(int n) {
        
        if(n<=2)
            return n;
        int x=1,y=2;
        for(int i=3;i<n;i++)
        {
            int temp=y;
            y+=x;
            x=temp;
        }
        return (x+y);
        
    }
}

//using memoisation

class Solution {
    public int climbStairs(int n) {
        int mp[] = new int[n];
        if(n==1) return 1;
        
            mp[0]=1;
            mp[1]=2;
        
        for(int i = 2;i<n;i++)
        {
            mp[i] = mp[i-1]+mp[i-2];
        }
        return mp[n-1];
        
        
    }
}
