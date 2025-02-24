/*  檔名:ch4_17.java      功能:多層for迴圈的示範   */

package myJava.ch04;
import java.lang.*;

public class ch4_17         //主類別
{
    public static void main(String args[])
    {
       for(int i=1;i<=9;i++)
       {
         for(int j=1;j<=9;j++)
             System.out.print(i + "*" + j + "=" + i*j + "\t");
         System.out.println();
       }
    }
}