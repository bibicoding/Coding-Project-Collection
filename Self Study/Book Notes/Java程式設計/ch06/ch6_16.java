/*   檔名:ch6_16.java      功能:main函式的參數   */

package myJava.ch06;
import java.lang.*;

public class ch6_16         //主類別
{
    public static void main(String args[])
    {
        System.out.println("本程式共接受到" + args.length + "個輸入引數");
        for(int i=0;i<args.length;i++)
           System.out.println("args[" + i + "]字串為" + args[i]);
    } 
}