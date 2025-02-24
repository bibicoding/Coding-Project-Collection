/*   檔名:ch7_09.java          功能:區域變數與成員變數同名  */

package myJava.ch07;
import java.lang.*;

public class ch7_09         //主類別
{                     
    public static void main(String args[])
    {         
         CMyClass X = new CMyClass();
         X.show();
    }
}

class CMyClass
{
    public int var=10;    //成員變數 
    public void show()
    {
        int var=20;                         //區域變數
        System.out.println("var=" + var);   //將會取用到區域變數 
    }
}