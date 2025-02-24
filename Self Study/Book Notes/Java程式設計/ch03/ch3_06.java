/*  檔名:ch3_06.java    功能:遞增遞減運算子範例   */

package myJava.ch03;
import java.lang.*;

public class ch3_06         //主類別
{
    public static void main(String args[])
    {
         int i=5,j=10,a,b;
         int x=5,y=10,c,d;

         a = 1+ i++;
         b = 1+ j--;
         c=  1+ ++x;
         d=  1+ --y;

         System.out.print("i = " + i);
         System.out.print("\t j = " + j);
         System.out.print("\t x = " + x);
         System.out.println("\t y = " + y);
         System.out.print("a = " + a);
         System.out.print("\t b = " + b);
         System.out.print("\t c = " + c);
         System.out.println("\t d = " + d);
    }
}