/*   檔名:ch9_11.java          功能:介面型態變數參考實作類別物件實體   */

package myJava.ch09;
import java.lang.*;

public class ch9_11         //主類別
{
    public static void main(String args[])
    {
        int i;
        IA obj =  new CA();  //介面型態變數參考實作類別物件實體
        obj.show1();         //可執行介面宣告的方法(由子類別改寫的method)
        i = obj.varA;        //可存取介面定義的欄位
        //obj.varB = 10;     //不可存取新增的成員變數
        //obj.show2();       //不可實行新增的method 
    } 
}    

interface IA              //定義介面
{    
    public static final int varA=5;  
    public abstract void show1();
}

class CA implements IA   // 類別CB實作界面IA
{
    public int varB;    
    @Override public void show1()
    {
        System.out.println("實作類別改寫的show1()執行中");
    }
    public void show2()
    {
        System.out.println("實作類別新增的show2()執行中");
    }
}
