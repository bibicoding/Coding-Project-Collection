/*  檔名:ch7_17.java     功能:類別名稱存取類別成員  */

package myJava.ch07;
import java.lang.*;

public class ch7_17         //主類別
{
    public static void main(String args[])
    {
        CMyClass.show("修改前");    //執行類別方法
        CMyClass.Var = 20;          //存取類別變數
        CMyClass.show("修改後");    //執行類別方法
        CMyClass X = new CMyClass();
        X.show("使用物件呼叫時");
    } 
}       

class CMyClass
{
    public static int Var=10;
    
    public static void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
}
