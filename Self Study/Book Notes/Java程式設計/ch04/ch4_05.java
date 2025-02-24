/*  檔名:ch4_05.java     功能:「?:」運算子範例   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_05         //主類別
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        String str1 = new String("恭喜您猜到了,獎品是一包乖乖.");
        int Ans=38; /* 答案為38 */
        int Guess;
        
        System.out.print("請猜一個1~99的號碼:");        
        Guess=Integer.parseInt(keyboardInput.nextLine());
        if(Guess!=Ans)
              str1 = (Guess>Ans) ? "您猜得太大了" : "您猜得太小了" ;
        System.out.println(str1);    	
    }
}