/*  檔名:ch4_18.java      功能:continue敘述的示範   */

package myJava.ch04;
import java.lang.*;

public class ch4_18         //主類別
{
    public static void main(String args[])
    {
       int Sum=0;
       for(int i=1;i<=10;i++)
       {
         if((i%2)==1)
            continue;
         Sum=Sum+i;
       }
       System.out.println("2+4+6+8+10=" + Sum);
    }
}