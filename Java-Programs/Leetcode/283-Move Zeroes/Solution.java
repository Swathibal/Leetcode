// Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

// **Note** that you must do this in-place without making a copy of the array.

// **Example 1:**

// ```
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// ```

// **Example 2:**

// ```
// Input: nums = [0]
// Output: [0]
// ```

//passes all test cases
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        while (pointer < nums.length) {
            nums[pointer] = 0;
            pointer++;
        }
}
}


// doesn't pass all test cases
class Solution {
    public void moveZeroes(int[] nums) {
         int j=0;
        for(int i=0;i<nums.length;i++)
        {
              if(nums[i]!=0)
               {
                   nums[i] = nums[i]^nums[j];
									 nums[j] = nums[i]^nums[j];
									 nums[i] = nums[i]^nums[j];
                   j++;
         }
}
