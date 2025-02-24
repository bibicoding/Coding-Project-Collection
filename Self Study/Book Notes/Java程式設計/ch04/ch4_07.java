/*  檔名:ch4_07.java       功能:條件運算式的練習   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_07         //主類別
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Credit,Status;  //信用額度,繳款狀態
      double Year=0;        // 持卡年份
    	
      System.out.print("請輸入信用額度:");
      Credit = Integer.parseInt(keyboardInput.nextLine());
      System.out.print("繳款是否正常(1:正常,0:不正常):");
      Status = Integer.parseInt(keyboardInput.nextLine());
      if(Status!=1)
      {
         System.out.println("預借現金金額為0元");
      }
      else
      {
         System.out.print("請輸入持卡年份:");
         Year = Double.parseDouble(keyboardInput.nextLine());
      }
      if((Status==1) && (Year>=0.5) && (Year<1))
         System.out.println("預借現金金額為"+(Credit*0.05)+"元");
      if((Status==1) && (Year>=1))
         System.out.println("預借現金金額為"+(Credit*0.1)+"元");
      if((Status==1) && (Year<0.5))
         System.out.println("預借現金金額為0元");
    }
}