/*  檔名:ch4_10.java    功能:浮點數比較   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_10         //主類別
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      double k,tk=40.5;

      System.out.println("一台斤=0.6公斤");
      System.out.print("請問" + tk + "台斤等於幾公斤:");
      k=Double.parseDouble(keyboardInput.nextLine());
      if(k==tk*0.6)
         System.out.println("答對了!"); 
      else
         System.out.println("答錯了!");
    }
}