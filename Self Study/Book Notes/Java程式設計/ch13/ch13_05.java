/*  檔名:ch13_05.java          功能:join()方法等待多執行緒完成  */

package myJava.ch13;
import java.lang.*;

public class ch13_05         //主類別
{
    public static void main(String args[])
    {
        CCar obj1 = new CCar("Ford");
        CCar obj2 = new CCar("Toyota");    	
        obj1.start();
        try   //join()會丟出例外,所以要包在try..catch內
        {
           obj1.join();   //等待本執行緒完成後才往下執行其它程式
           System.out.println("obj1執行緒已完成工作");    	   
           obj2.start();    	   
        }
        catch(InterruptedException e){}    	
    } 
}

class CCar extends Thread  //繼承Thread可實現多執行緒
{
    String manufacturer;
    public CCar(String str){ manufacturer = str; }    
    public void run()        //JVM自動執行
    {
        for(int i=1;i<=3;i++)
        {
           for(int t=1;t<100000000;t++) 
                ;  //空迴圈,可延長第33行執行兩次之間的時間
           System.out.println(manufacturer + " is running");
        }    	
    }
}
