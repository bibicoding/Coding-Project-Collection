/*  檔名:ch6_19.java        功能:遞迴函式求費氏數列  */

package myJava.ch06;
import java.lang.*;

public class ch6_19         //主類別
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
        if((n==1) || (n==0))
          return n;
        else
          return Fib(n-1) + Fib(n-2);
    }
}