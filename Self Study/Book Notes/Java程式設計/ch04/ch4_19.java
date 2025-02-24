/*  檔名:ch4_19.java     功能:break敘述的示範  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_19         //主類別
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Sum=0,i,n;
      
      System.out.print("求1~N的總和,請輸入N值:");
      n=Integer.parseInt(keyboardInput.nextLine()); 
      for(i=1;i<=n;i++)
      {
        if(Sum>Integer.MAX_VALUE-100)
           break;
        Sum=Sum+i;
      }
      System.out.println("1~" + (i-1) + "的總和為" + Sum);
    }
}