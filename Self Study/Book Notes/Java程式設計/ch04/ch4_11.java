/*  檔名:ch4_11.java     功能:if else的配對練習   */

package myJava.ch04;
import java.lang.*;

public class ch4_11         //主類別
{
    public static void main(String args[])
    {
         int Score=75;
         if(Score > 60)
            if(Score > 80)
                System.out.println("成績真不錯");
         else
            System.out.println("成績差強人意");
    }
}