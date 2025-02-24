/*   檔名:ch8_07.java        功能:父類別型態變數參考子類別物件實體   */

package myJava.ch08;
import java.lang.*;

public class ch8_07         //主類別
{
    public static void main(String args[])
    {
        CA obj =  new CB();              
        obj.show1();         //可執行子類別改寫的函式
        obj.show2();         //可執行繼承的函式
        //obj.show3();  
    } 
}    

class CA
{
    protected int varA;
    public void show1()
    {
        System.out.println("父類別show1()執行中");
    }
        public void show2()
    {
        System.out.println("父類別show2()執行中");
    }
}

class CB extends CA   // 子類別CB繼承自類別CA
{
    protected int varB;
    @Override public void show1()
    {
        System.out.println("子類別改寫的show1()執行中");
    }
    public void show3()
    {
        System.out.println("子類別新增的show3()執行中");
    }
}
