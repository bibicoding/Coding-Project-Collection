/*  檔名:ch3_10.java       功能:var宣告變數(JDK11適用)   */

package myJava.ch03;
import java.lang.*;

public class ch3_10         //主類別
{
    public static void main(String args[])
    {
       var a=100;
       var b=200;
       var d=3.5f;
       var e=4.8d;
       //不可設定d=e,但可設定e=d;  
              
       System.out.println("a = " + a);
       System.out.println("b = " + b);
       System.out.println("d = " + d);
       System.out.println("e = " + e);
    }
}