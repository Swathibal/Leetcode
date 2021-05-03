// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    
    
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[]=new int[(nums1.length)+(nums2.length)];
        int k=0,index=0;
        double median=0;
        for(int i=0;i<nums1.length;i++)
        {
            a[k++]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            a[k++]=nums2[j];}
        Arrays.sort(a);
        index = k/2;
        if(k%2 == 0){
           median = ((a[index-1]+a[index])/2);
           if(((a[index-1]+a[index])%2)==1)
               median+=0.5;}
           
        else
            median = a[index];
        
        return median;
         
            
    }
}
