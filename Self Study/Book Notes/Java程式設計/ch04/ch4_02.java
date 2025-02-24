/*  檔名:ch4_02.java       功能:if選擇性敘述範例   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_02         //主類別
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        int OnePrice=200,Qty;
        double TotalPrice;
    	
        System.out.println("每張入場卷價格為" + OnePrice + "元");
        System.out.print("請輸入您要購買的張數:");    	
        Qty=Integer.parseInt(keyboardInput.nextLine());
        System.out.println("==========================");
        TotalPrice = OnePrice * Qty;
        if(Qty>=10)
        {
            TotalPrice = TotalPrice * 0.9;
            System.out.println("購買10張以上打九折");
        }
        System.out.println("總價為" + TotalPrice + "元");
    }
}