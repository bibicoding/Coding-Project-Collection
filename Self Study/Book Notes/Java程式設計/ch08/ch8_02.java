/*  檔名:ch8_02.java         功能:繼承的建構子執行順序   */

package myJava.ch08;
import java.lang.*;

public class ch8_02         //主類別
{
    public static void main(String args[])
    {
        CB objB =  new CB();           //objB是子類別物件
        objB.show();
    } 
}    

class CA
{
    protected int varX;
    public CA()
    {
        System.out.println("父類別建構子執行中....");
        varX = 10;
    }
}

class CB extends CA   // 類別CB繼承自類別CA
{
    public CB()
    {
        System.out.println("子類別建構子執行中....");    	 
    }
    public void show()  
    {
        System.out.println("varX=" + varX);
    }
}