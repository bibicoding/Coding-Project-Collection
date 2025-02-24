/*   檔名:ch5_01.java        功能:陣列元素的存取    */

package myJava.ch05;
import java.lang.*;
import java.util.Scanner;

public class ch5_01         //主類別
{
    public static void main(String args[])
    {
       int sum=0;
       double average;
       Scanner keyboardInput = new Scanner(System.in);
    	
       int trades[] = new int[4];    //宣告trades陣列並產生陣列實體    	
       for(int i=0;i<trades.length;i++)
       {
           System.out.print("第" + (i+1) + "季的營業額:");
           trades[i] = Integer.parseInt(keyboardInput.nextLine());
           sum = sum + trades[i];
       }
       average = (double)sum / (double)12;
       System.out.println("=========================");
       System.out.println("    年度營業額:" + sum);
       System.out.println("平均各月營業額:" + average);   	
    }
}