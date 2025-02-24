/*  檔名:ch3_01.java   功能:鍵盤輸入範例   */

package myJava.ch03;
import java.lang.*;
import java.util.Scanner;

public class ch3_01         //主類別
{
    public static void main(String args[])
    {      
        Scanner keyboardInput = new Scanner(System.in);
        String str1,str2;
        
        System.out.print("請輸入第一個字串:");
        str1 = keyboardInput.nextLine();
        System.out.print("請輸入第二個字串:");
        str2 = keyboardInput.nextLine(); 
        System.out.println("您所輸入的字串如下:");
        System.out.println(str1);
        System.out.println(str2);  
    }
}