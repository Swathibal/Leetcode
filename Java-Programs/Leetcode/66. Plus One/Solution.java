// Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

 

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Example 3:

// Input: digits = [0]
// Output: [1]

class Solution {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int arr[] = new int[len+1];
        boolean flag = false;
        int rem=0,carry=1,value=0,j=0;
        
           for(int i=len-1;i>=0;i--)
           {
               value = digits[i]+carry;
               System.out.print(value+" "+digits[i]);
               if(value<=9)
               {
                   digits[i] = value;
                   break;
               }
               else
                   rem=value%10;
                   carry = value/10;
                   digits[i] = rem;
               
               if(i==0 && carry == 1)
               {
                   flag = true;
                   for(int k=0;k<len+1;k++)
                   {
                       if(k == 0)
                           arr[k] = carry;
                       else
                           arr[k] = digits[j++];
                   }
               }
           }
             
        if(flag)
            return arr;
        return digits;
            
    }
}
