/*   檔名:ch7_04.java        功能:建構函式   */

package myJava.ch07;
import java.lang.*;

public class ch7_04         //主類別
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(1);    //自動呼叫建構函式
        CMyClass Y = new CMyClass(2);     //自動呼叫建構函式
        
        X.addVar(10);     //在X物件上,執行addVar成員函式
        System.out.print("物件X\t");
        X.showVar();
        
        System.out.print("物件Y\t");
        Y.addVar(5);      //在Y物件上,執行addVar成員函式
        Y.showVar();

        System.out.print("物件Y\t");
        Y.addVar(3);      //在Y物件上,執行addVar成員函式
        Y.showVar();  
    } 
}    

class CMyClass
{
    public CMyClass(int i)
    {
        Var = i;
    }
    public void addVar(int b)
    {
        Var = Var + b;
    }
    public void showVar()
    {
    	realShow();  //執行private等級的函式
    }
    private int Var;
    private void realShow()
    {
    	System.out.println("Var=" + Var);
    }
}
