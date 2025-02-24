/*  檔名:ch4_03.java       功能:條件運算式範例   */

package myJava.ch04;
import java.lang.*;

public class ch4_03         //主類別
{
    public static void main(String args[])
    {
        boolean x=false;
        String str1 = new String("x為真");
        if(x=false)
            str1 = "x為假";
        System.out.println(str1);
    }
}