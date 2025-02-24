/*   檔名:ch9_12.java          功能:動態繫結與靜態繫結  */

package myJava.ch09;
import java.lang.*;

public class ch9_12         //主類別
{
    public static void main(String args[])
    {
        CA obj;           //宣告父類別型態變數
        obj = new CB();   //obj指向子類別CB物件實體
        //obj.show1();    //編譯時期即可知無法執行，因為CA未宣告此method
        obj.show2();      //被宣告為final的方法,為靜態繫結
        obj.show3();      //因為是abstract method，故必發生多型之改寫(動態繫結)
        obj.show4();      //使用動態繫結以正確執行方法
        System.out.println("--------------------");
        obj = new CC();   //obj指向子類別CC物件實體
        //obj.show1();      //編譯時期即可知無法執行，因為CA未宣告此method
        obj.show2();      //被宣告為final的方法,為靜態繫結
        obj.show3();      //因為是abstract method，故必發生多型之改寫(動態繫結)
        obj.show4();      //使用動態繫結以正確執行方法        
    } 
}    

interface IA              //定義介面
{    
    public abstract void show1();    
}

abstract class CA         //定義父類別
{
    public final void show2()
    {
        System.out.println("This is CA's show2()");
    } 	
    public abstract void show3();
    public void show4()
    {
        System.out.println("This is CA's show4()");
    }
    
}

class CB extends CA implements IA   // 類別CB實作界面IA
{
    public void show1()
    {
        System.out.println("This is CB's show1()");
    }
    public void show3()
    {
        System.out.println("This is CB's show3()");
    }
}

class CC extends CA implements IA   // 類別CC實作界面IA
{
    public void show1()
    {
        System.out.println("This is CC's show1()");
    }
    public void show3()
    {
        System.out.println("This is CC's show3()");
    }
    public void show4()
    {
        System.out.println("This is CC's show4()");
    }
}