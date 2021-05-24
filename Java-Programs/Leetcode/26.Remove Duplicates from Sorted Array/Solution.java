// Given a sorted array *nums*, remove the duplicates **[in-place](https://en.wikipedia.org/wiki/In-place_algorithm)** such that each element appears only *once* and returns the new length.

// Do not allocate extra space for another array, you must do this by **modifying the input array [in-place](https://en.wikipedia.org/wiki/In-place_algorithm)** with O(1) extra memory.

// **Clarification:**

// Confused why the returned value is an integer but your answer is an array?

// Note that the input array is passed in by **reference**, which means a modification to the input array will be known to the caller as well.

// Internally you can think of this:

// ```
// //nums is passed in by reference. (i.e., without making a copy)
// int len = removeDuplicates(nums);

// // any modification tonums in your function would be known by the caller.
// // using the length returned by your function, it prints the firstlen elements.
// for (int i = 0; i < len; i++) {
//     print(nums[i]);
// }
// ```

// **Example 1:**

// ```
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2]
// Explanation: Your function should return length =2, with the first two elements ofnums being1 and2 respectively. It doesn't matter what you leave beyond the returned length.
// ```


class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        //int i=0 , j = len-1;
        if(len==0 || len ==1)
            return len;
        for(int i=0;i<len-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                int j = i+1;
                while(j<len-1)
                {
                    nums[j] = nums[j+1];
                    j++;
                }
                i--;
                len--;
            }
        }
        return len;
    }
}
