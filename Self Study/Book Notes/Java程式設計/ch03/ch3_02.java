/*  檔名:ch3_02.java  功能:鍵盤輸入範例 - 不顯示輸入字元   */

package myJava.ch03;
import java.lang.*;
import java.io.Console;

public class ch3_02         //主類別
{
    public static void main(String args[])  
    {
       Console console = System.console();
       String str1;
       char[] PW;               //宣告字元陣列
        
       System.out.println("請輸入帳號:");       
       str1 = console.readLine();
       PW = console.readPassword("請輸入密碼:");
       System.out.println("您所輸入的帳號及密碼如下:");
       System.out.println(str1);
       System.out.println(PW);        
    }
}
