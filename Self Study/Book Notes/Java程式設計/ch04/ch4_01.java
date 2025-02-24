/*  檔名:ch4_01.java      功能:if選擇性敘述範例   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_01         //主類別
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        int x;
        String str1 = new String("您輸入的是正數或0");
    	       
        System.out.print("請輸入一個整數:");        
        x = Integer.parseInt(keyboardInput.nextLine());
        if(x<0)
            str1 = "您輸入的是負數";
        System.out.println(str1);
    }
}