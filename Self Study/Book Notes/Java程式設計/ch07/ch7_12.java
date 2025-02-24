/*  檔名:ch7_12.java     功能:在建構函式中使用this(引數列)   */

package myJava.ch07;
import java.lang.*;

public class ch7_12         //主類別
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(3);   //實體產生時呼叫第22行的建構子
        CMyClass Y = new CMyClass(5,40);//實體產生時呼叫第27行的建構子
        X.showVar();
        Y.showVar();
    } 
}    

class CMyClass
{
    public int VarA;
    private int VarB;
    public CMyClass(){}       //良好的習慣是補上一個沒有參數的建構函式
    public CMyClass(int i)           //定義一個整數參數的建構函式
    {
        VarA = 1;
        VarB = i;
    }
    public CMyClass(int a,int b)    //定義兩個整數參數的建構函式
    {
        this(b);                    //呼叫第22行的建構函式,藉以設定VarB
        VarA = a * b;        
    }
    public void showVar()
    {
        System.out.println("VarA=" + VarA);
        System.out.println("VarB=" + VarB);        
    }
}
