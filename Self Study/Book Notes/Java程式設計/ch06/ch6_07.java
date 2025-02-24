/*  檔名:ch6_07.java       功能:亂數函式random  */

package myJava.ch06;
import java.lang.*;
import java.lang.Math;      //randon所屬類別,可省略

public class ch6_07         //主類別
{
    public static void main(String args[])
    {
        for(int i=1;i<=6;i++)
           System.out.println("第" + i + "個隨機亂數為" + Math.random());
    }
}