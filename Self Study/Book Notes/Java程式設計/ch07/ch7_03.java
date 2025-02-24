/*  檔名:ch7_03.java        功能:成員變數設定初始值  */

package myJava.ch07;
import java.lang.*;

public class ch7_03         //主類別
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass();
        CMyClass Y = new CMyClass();
        
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
    public void addVar(int b)
    {
        Var = Var + b;
    }
    public void showVar()
    {
    	realShow();  //執行private等級的函式
    }
    private int Var=1;        //設定初始值
    private void realShow()
    {
    	System.out.println("Var=" + Var);
    }
}
