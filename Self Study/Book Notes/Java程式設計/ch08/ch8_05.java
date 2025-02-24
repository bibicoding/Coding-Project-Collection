/*   檔名:ch8_05.java        功能:@Override的練習   */

package myJava.ch08;
import java.lang.*;

public class ch8_05         //主類別
{
    public static void main(String args[])
    {
        CB objB =  new CB();           //objB是子類別物件
        objB.show();
        objB.show(10);
        objB.show(10.0);
    } 
}    

class CA
{
    public void show()
    {
        System.out.println("目前執行父類別的show()");
    }
}

class CB extends CA   // 子類別CB繼承自類別CA
{
    @Override public void show()
    {
        System.out.println("目前執行子類別的show()");    	
    }
    public void show(int x)
    {
        System.out.println("目前執行子類別的show(" + x +")");
    }
    public void show(double x)
    {
        System.out.println("目前執行子類別的show(double)");
        super.show();
    }
}