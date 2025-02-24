/*  檔名:ch13_06.java          功能:不需處理的同步問題  */

package myJava.ch13;
import java.lang.*;

public class ch13_06         //主類別
{
    public static void main(String args[])
    {
        COperation atmObj = new COperation();  
        COperation counterObj = new COperation();
    	
        atmObj.start();
        counterObj.start();    	
    } 
}

class CAccount
{
    static int balance=10000; //帳戶餘額
    static int accoutNo=8529; //帳號
		
    public static void checkBalance()
    {
        int temp=balance;
        //sleep模擬其他因素導致Thread被暫停
        try  {Thread.sleep((long)(1000*Math.random())); }
        catch(InterruptedException e){}
        System.out.print(Thread.currentThread().getName()+"執行中:");
        System.out.println("帳戶" + accoutNo + "內有" + temp + "元");
    }
}

class COperation extends Thread  //多執行緒類別
{    
    public void run()    
    {
        CAccount.checkBalance();
    }
}
