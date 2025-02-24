/*   檔名:ch7_19.java      功能:類別內的無名區段   */

package myJava.ch07;
import java.lang.*;

public class ch7_19        //主類別
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass();
        X.show("使用物件呼叫時");        
    } 
}       

class CMyClass
{
    public int Var;
    public CMyClass()
    {
        Var = 10;
        System.out.println("建構函式執行中");
        show("建構函式執行完畢時");
    }
    public void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
    {
        Var = 100;
        System.out.println("無名區塊執行中");
        show("無名區塊執行完畢時");
    }
}
