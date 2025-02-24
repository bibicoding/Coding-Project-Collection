/*  檔名:ch13_07.java          功能:需處理的同步問題  */

package myJava.ch13;
import java.lang.*;

public class ch13_07         //主類別
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
		
    public static void withdraw(int m) //這個方法內寫入相同變數balance
    {
        int temp;	    
	    
        temp=balance;
        //sleep模擬其他因素導致Thread被暫停
        try  {Thread.sleep((long)(1000*Math.random())); }
        catch(InterruptedException e){}
        temp = temp - m;	
        try  {Thread.sleep((long)(1000*Math.random())); }
        catch(InterruptedException e){}
        balance = temp; //寫入balance
        System.out.println(Thread.currentThread().getName()+ ":請收取" + m + "元"); 
        checkBalance();
    }
	
    public static void checkBalance()
    {
        int temp=balance;
        //sleep模擬其他因素導致Thread被暫停
        try  {Thread.sleep((long)(1000*Math.random())); }
        catch(InterruptedException e){}
        System.out.print(Thread.currentThread().getName()+"執行中:");
        System.out.println("帳戶" + accoutNo + "剩餘" + temp + "元");
    }
}

class COperation extends Thread  //多執行緒類別
{    
    public void run()    
    {
        CAccount.withdraw(1000);    	
    }
}
