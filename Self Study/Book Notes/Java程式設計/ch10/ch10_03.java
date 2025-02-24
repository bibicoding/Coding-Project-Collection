/*   檔名:ch10_03.java          功能:透過throw敘述丟出內建例外類別物件  */

package myJava.ch10;
import java.lang.*;

public class ch10_03         //主類別
{
    public static void main(String args[])
    {
    	   System.out.println("這一行會被執行");
    	   int i=-2;
    	   if(i<0)
    	       throw new NegativeArraySizeException();
    	   //int ary[] = new int[i];
    	   System.out.println("這一行不會被執行");    	        
    } 
}