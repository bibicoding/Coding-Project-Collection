/*   檔名:ch7_12.java        功能:this的內容  */

package myJava.ch07;
import java.lang.*;

public class ch7_11         //主類別
{
                     
    public static void main(String args[])
    {         
         CMyClass X = new CMyClass();
         CMyClass Y = new CMyClass();
         System.out.print("X物件實體所在位址=");
         X.show_this();         
         System.out.print("Y物件實體所在位址=");
         Y.show_this();
    }
}

class CMyClass
{
    public int var=10;    //成員變數 
    public void show_this()
    {
        System.out.println(this);
    }
}    