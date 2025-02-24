/*   檔名:ch6_20.java     功能:使用迴圈求費氏數列   */

package myJava.ch06;
import java.lang.*;

public class ch6_20         //主類別
{
    public static void main(String args[])
    {
        System.out.print("費氏數列如下:");
        for(int i=0;i<=25;i++)
        {
           if(i%8==0)
              System.out.println();
           System.out.print(Fib(i) + "\t");
        }   
        System.out.println("......");
    } 
    
    public static int Fib(int n)
    {
        int n1=0,n2=0,sum=1;
        
        if((n==1) || (n==0))
           return n;
        else
        {
           for(int i=2;i<=n;i++)
           {
              n1 = sum;
              sum = sum + n2;
              n2 = n1;
           }
           return sum;
        }
    }
}