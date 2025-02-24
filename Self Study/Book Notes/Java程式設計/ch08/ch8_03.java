/*   檔名:ch8_03.java        功能:super的練習   */

package myJava.ch08;
import java.lang.*;

public class ch8_03         //主類別
{
    public static void main(String args[])
    {
    	CB objB =  new CB(10);           //objB是子類別物件
        objB.show();
    } 
}    

class CA
{
    public int varX;
    public CA()
    {
    	System.out.println("父類別無參數建構子執行中...");
    }
    public CA(int i)
    {
    	varX = i;
    }
}

class CB extends CA   // 子類別CB繼承自類別CA
{
    public int varX;          //新增的成員變數,與父類別成員同名
    public CB(){}
    public CB(int i)
    {
    	super(i);     //呼叫父類別建構子public CA(int i),必須放在第一行
    	varX = 100;      
    }
    public void show()      //新增的成員函式
    {
    	super.varX++;      
    	System.out.println("子類別varX=" + varX);
    	System.out.println("父類別varX=" + super.varX);
    }
}