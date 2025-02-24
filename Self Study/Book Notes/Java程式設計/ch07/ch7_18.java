/*   檔名:ch7_18.java      功能:static區段   */

package myJava.ch07;
import java.lang.*;

public class ch7_18        //主類別
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
    public static int Var;
    
    public static void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
    static{
        Var = 100;
        System.out.println("類別變數Var初始化完畢" + Var);
        show("初始化之後");
    }
}
