// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

// using sorting O(nlogn)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}

//using HashMap O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        mp.put(nums[0],0);
        for(int i=1;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
                return true;
            
            mp.put(nums[i],i);
        }
        return false;
    }
}

//using HashSet O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
        }
    return false;
    }
}
