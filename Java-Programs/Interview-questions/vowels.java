// Given a string,if string contains any vowels replace the vowel with number such that multiplying the index of the vowel with 5 
// and store it in any variable(eg.res) and add  all the consequetive odd numbers from 1 to res inclusively. If the sum of the
// consequetive odd number in greater than or equal to 10 add all the digits until it has been reduced to single digit and replace the vowel 
// with the obtained num. If the string doesn't contain vowel return -1.
  
// eg:Program

// output:

// Pr7gr7m


import java.util.Scanner;
public class vowels {
    public static int addOddNum(int n)
    {
        int oddSum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2 != 0)
              oddSum+=i;
        }
        return oddSum;
    }
    public static int sumOfDigits(int value)
    {
        int temp=value,rem,result=0;
        while(value>0)
        {
              rem=value%10;
              result+=rem;
              value/=10;
        }
        if(result>9)
           return sumOfDigits(result);
        return result;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        String op="";
        String vowel="[AEIOUaeiou].?";
        int res=1,add=0,count=0;
        for(int i=0;i<str.length();i++)
        {
            if(String.valueOf(str.charAt(i)).matches(vowel))
            {
                res=i*5;
                add = addOddNum(res);
                if(add>9)
                {
                    res=sumOfDigits(add);

                }
                op+=res;
                count++;
            }
            else
               op+=str.charAt(i);
        }
        if(count==0)
           System.out.println("-1");
        else
           System.out.println(op);
    }
}
