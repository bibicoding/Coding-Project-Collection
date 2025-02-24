/*  檔名:ch7_10.java           功能:this關鍵字的簡易使用法  */

package myJava.ch07;
import java.lang.*;

public class ch7_10         //主類別
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
        int var=20;                     //區域變數
        System.out.println("區域變數var=" + var);
        System.out.println("成員變數var=" + this.var);
    }
}    