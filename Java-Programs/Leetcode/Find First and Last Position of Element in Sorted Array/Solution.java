// Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].
   

import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = {-1,-1};
        int i = 0, j = nums.length-1;
          
            while(i<j)
            {
                
                if(nums[i]==target && nums[j] == target)
                {
                    a[0]=i;
                    a[1]=j;
                    break;
                }
                else if(nums[i]!=target && nums[j]!=target)
                {
                    i++;
                    j--;
                }
                else if(nums[i]!=target && nums[j]==target)
                    i++;
                else 
                    j--;
            }
            
            return a;
        }
    
}
