/*  檔名:ch10_12.java      功能:重新丟出例外  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_12         //主類別
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        int ary[] = new int[]{0,5,10,15,20,25,30,35,40,45};
        int x=0,num=0;
        try                              //外層try區塊
        {          
             try
             {
                 System.out.print("請問要讀取陣列第幾個元素:");
                 x = Integer.parseInt(keyboardInput.nextLine());
                 num = ary[x];
                 System.out.println("ary[" + x + "]=" + num);
             }
             catch(ArrayIndexOutOfBoundsException e)
             {
                 System.out.println("例外發生:存取超過陣列大小範圍!");
             }                
             catch(NumberFormatException e)
             {
                 System.out.println("捕捉到轉型例外,準備交由外層處理");
                 throw e;  
             }            
                
        }
        catch(NumberFormatException e)    //外層catch區塊
        {             
             System.out.println("例外發生:索引應為數值!");
        }
        
        System.out.println("...程式即將結束...");    	
    } 
}