/*  檔名:ch3_09.java       功能:數值轉字串範例   */

package myJava.ch03;
import java.lang.*;

public class ch3_09         //主類別
{
    public static void main(String args[])
    {
       short a=100;
       int b=200;
       float d=3.5f;
       double e=4.8d;  //相當於 double d=4.8;       
       String s1,s2;
       
       s1=String.valueOf(a+b)+String.valueOf(a)+String.valueOf(b);
       s2=Float.toString(d)+Double.toString(e);
       System.out.println("s1 = " + s1);
       System.out.println("s2 = " + s2);
    }
}