/*   檔名:ch10_02.java          功能:系統自動引發例外   */

package myJava.ch10;
import java.lang.*;

public class ch10_02         //主類別
{
    public static void main(String args[])
    {
    	System.out.println("這一行會被執行");
    	int ary[] = new int[-2];
    	System.out.println("這一行不會被執行");    	        
    } 
}