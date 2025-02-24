/*  檔名:ch4_06.java      功能:巢狀選擇範例   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_06         //主類別
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Credit,Status;  //信用額度,繳款狀態
      double Year;        // 持卡年份
    	
      System.out.print("請輸入信用額度:");
      Credit = Integer.parseInt(keyboardInput.nextLine());
      System.out.print("繳款是否正常(1:正常,0:不正常):");
      Status = Integer.parseInt(keyboardInput.nextLine());
      if(Status==1)
      {
        System.out.print("請輸入持卡年份:");
        Year = Double.parseDouble(keyboardInput.nextLine());
        if(Year>=0.5)
        {
          if(Year<1)
          {
            System.out.println("預借現金金額為"+(Credit*0.05)+"元");
          }
          else  //對應第25行的if
          {
            System.out.println("預借現金金額為"+(Credit*0.1)+"元");
          }
        }
        else  //對應第23行的if
        {
          System.out.println("預借現金金額為0元");
        }
      }
      else   //對應第19行的if
      {
        System.out.println("預借現金金額為0元");
      }
    }
}