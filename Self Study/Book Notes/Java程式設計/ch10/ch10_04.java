/*  檔名:ch10_04.java          功能:透過throw敘述丟出自定例外類別物件  */

package myJava.ch10;
import java.lang.*;

public class ch10_04         //主類別
{
    public static void main(String args[]) throws CmyException
    {
        System.out.println("這一行會被執行");
        int i=-2;
        if(i<0)
            throw new CmyException("陣列大小出現負數");
        int ary[] = new int[i];       //這一行不會被執行
        System.out.println("這一行不會被執行"); 	        
    } 
}

class CmyException extends Exception
{
    public CmyException()   //建構子
    {
        super();
    }
    public CmyException(String msg)   //建構子
    {
        super(msg);
    }    
}
