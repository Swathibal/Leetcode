// Given an array *nums* and a value `val`, remove all instances of that value **[in-place](https://en.wikipedia.org/wiki/In-place_algorithm)** and return the new length.

// Do not allocate extra space for another array, you must do this by **modifying the input array [in-place](https://en.wikipedia.org/wiki/In-place_algorithm)** with `O(1)` extra memory.

// The order of elements can be changed. It doesn't matter what you leave beyond the new length.

// **Clarification:**

// Confused why the returned value is an integer but your answer is an array?

// Note that the input array is passed in by **reference**, which means a modification to the input array will be known to the caller as well.

// Internally you can think of this:

// ```
// //nums is passed in by reference. (i.e., without making a copy)
// int len = removeElement(nums, val);

// // any modification tonums in your function would be known by the caller.
// // using the length returned by your function, it prints the firstlen elements.
// for (int i = 0; i < len; i++) {
//     print(nums[i]);
// }
// ```

// **Example 1:**

// ```
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2]
// ```


class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int ele : nums)
        {
            if(ele != val)
            {
                nums[count++]=ele;
            }
        }
        return count;
    }
}
