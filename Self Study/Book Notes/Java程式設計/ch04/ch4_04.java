/*  檔名:ch4_04.java      功能:if-else選擇性敘述範例   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_04         //主類別
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        int OnePrice = 200,Qty;
        double TotalPrice;
        
        System.out.println("每張入場卷價格為" + OnePrice + "元");
        System.out.print("請輸入您要購買的張數:");        
        Qty = Integer.parseInt(keyboardInput.nextLine());
        System.out.println("==========================");
        TotalPrice = OnePrice * Qty;
        if(Qty>=10)
        {
           TotalPrice = OnePrice * Qty * 0.9;
           System.out.println("購買10張以上打九折");
        }
        else
        {
           TotalPrice = OnePrice * Qty;
           System.out.println("您未購買10張以上的入場券,恕不打折");
        }
        System.out.println("總價為" + TotalPrice + "元");
    }
}