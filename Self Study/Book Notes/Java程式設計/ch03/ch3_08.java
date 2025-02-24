/*  檔名:ch3_08.java     功能:字串轉原始資料型態範例   */

package myJava.ch03;
import java.lang.*;
import java.util.Scanner;

public class ch3_08         //主類別
{
    public static void main(String args[])
    {
    	Scanner keyboardInput = new Scanner(System.in);
    	String str1;
        double x;
        
        System.out.print("欲求x的3次方,請輸入x:");        
        str1 = keyboardInput.nextLine();
        x=Double.parseDouble(str1);
        System.out.println("x的3次方為:" + (x*x*x));        
    }
}