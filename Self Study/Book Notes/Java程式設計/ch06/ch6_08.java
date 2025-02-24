/*  檔名:ch6_08.java        功能:產生6個1~49的隨機亂數  */

package myJava.ch06;
import java.lang.*;
import java.lang.Math;      //randon所屬類別,可省略

public class ch6_08         //主類別
{
    public static void main(String args[])
    {
        int lottos[]=new int[6];
        
        for(int i=1;i<=6;i++)
        {
       	   lottos[i-1] = (int)((Math.random()*49)+1);
       	   System.out.println("第" + i + "個隨機亂數為" + lottos[i-1]);
        }
    }
}