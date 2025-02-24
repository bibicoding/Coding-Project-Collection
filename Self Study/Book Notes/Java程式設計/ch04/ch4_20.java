/*  檔名:ch4_20.java      功能:while迴圈的示範  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_20         //主類別
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);                 
      int x,y,gcd,temp;
      
      System.out.print("輸入x:");
      x=Integer.parseInt(keyboardInput.nextLine());
      System.out.print("輸入y:");
      y=Integer.parseInt(keyboardInput.nextLine());
      System.out.print("(" + x + "," + y + ")=");
      if(x<y)          // 將較大的數值放在x,較小的放在y
      {
         temp = x;   x = y;   y = temp;    // x,y數值對調
      }
      while(x!=0)
      {
         x=x%y;
         if(x!=0)
         {
            temp = x;   x = y;   y = temp;    // x,y數值對調
         }
      }
      gcd=y;
      System.out.println(gcd);
    }
}