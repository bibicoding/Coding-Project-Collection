/*  檔名:ch3_07.java      功能:運算式的自動轉型範例   */

package myJava.ch03;
import java.lang.*;

public class ch3_07         //主類別
{
    public static void main(String args[])
    {
       short s=23;
       int a=100;
       char b='a';
       float c=3.5f;
       double d=4.8d;  //相當於 double d=4.8;       
       
       System.out.print("result = ");
       System.out.println((s+a-b+c)+(c*d));
    }
}