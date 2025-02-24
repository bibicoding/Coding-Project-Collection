/*   檔名:ch6_05.java      功能:無傳入引數及回傳值的函式    */

package myJava.ch06;
import java.lang.*;

public class ch6_05         //主類別
{
    public static void main(String args[])
    {
       print99();   // 函式呼叫 */    	
    }
    
    public static void print99()  // 函式定義
    {
       for(int i=1;i<=9;i++)
       {
         for(int j=1;j<=9;j++)
             System.out.print(i + "*" + j + "=" + i*j + "\t");
         System.out.println();
       }
    }
}