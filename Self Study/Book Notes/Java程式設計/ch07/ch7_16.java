/*   檔名:ch7_16.java        功能:類別變數與類別方法  */

package myJava.ch07;
import java.lang.*;

public class ch7_16         //主類別
{
    public int Var;
    public static int sVar;
    
    public void show(String str)
    {
        System.out.println(str + "'s Var=" + Var);        
        System.out.println("ch7_16 class sVar=" + sVar);        
    }
    public static void add()        //類別方法
    {
        //Var++;        //錯誤,因為類別方法內不可以存取實體變數
        sVar++;
    }
    
    public static void main(String[] args)
    {
        ch7_16 X = new ch7_16();
        ch7_16 Y = new ch7_16(); 
        X.Var = 3;
        Y.Var = 10;
        X.sVar = 5;        //使用物件存取類別變數
        X.add();         //使用物件執行類別方法
        Y.add();         //使用物件執行類別方法       
        X.show("X");
        Y.show("Y");
    }
}
