// Input: a1b2c3
// Output: abbccc
// Caution: Don't use inbuilt functions
// Explanation:

// After we have the number 1 so a repeats one time = a
// After b we have the number 2 so it repeats two times = bb
// After c we have the number 3 so it repeats three times = ccc
// Final Output: abbccc

import java.util.*;
public class StringFrequency {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>'0' &&  str.charAt(i)<='9')
            {
                  int num = Integer.parseInt(String.valueOf(str.charAt(i)));
                  while(num>0)
                  {
                     System.out.print(str.charAt(i-1));
                    num--;
                  }
            }
        }
    }
}
