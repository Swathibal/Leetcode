// this is the kadane's algorithm for finding the maximum contiguous subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_sofar = Integer.MIN_VALUE,max_ending = 0;
       
        for(int i=0;i<n;i++)
        {
            max_ending+=nums[i];
            if(max_sofar<max_ending)
                max_sofar = max_ending;
            if(max_ending<0)
                max_ending = 0;
                
        }
        return max_sofar;
    }
}

