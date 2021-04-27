import java.util.*;
public class TofindLeapYear {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean flag;
      
        if(n%400 == 0)
           flag=true;
        else if(n%100 == 0)
           flag=false;
        else if(n%4==0)
           flag=true;
        else
           flag=false;
        if(flag)
           System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
