/*  檔名:ch10_08.java          功能:捕捉所有的例外  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_08         //主類別
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);    	
        int lottoSize=0;
        int lottoAry[];
    	
        while(true)
        {
          try
          {   	   
            System.out.print("請輸入陣列大小:");
            lottoSize = Integer.parseInt(keyboardInput.nextLine());
            lottoAry = new int[lottoSize]; 
            break;	 //跳出while迴圈    
          }
          catch(NumberFormatException e)
          {
            System.out.println("陣列大小請輸入數字");
          } 
          catch(Exception e)
          {
            System.out.println("有未考慮到的例外發生了");
          }    	
          finally
          {
          }
        }
        System.out.println("程式正確執行中...");    	
    } 
}