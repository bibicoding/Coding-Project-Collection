/*  檔名:ch13_04.java          功能:sleep方法暫停多執行緒  */

package myJava.ch13;
import java.lang.*;

public class ch13_04         //主類別
{
    public static void main(String args[])
    {
        CCar obj1 = new CCar("Ford");
        CCar obj2 = new CCar("Toyota");
        obj1.start();
        obj2.start();    	
    } 
}

class CCar extends Thread  //繼承Thread可實現多執行緒
{
    String manufacturer;
    public CCar(String str){ manufacturer = str; }    
    public void run()    
    {
        for(int i=1;i<=3;i++)
        {
           try   //sleep會丟出例外,所以要包在try..catch內
           {
                 sleep((long)(1000*Math.random())); //休眠0~1秒鐘
           }
           catch(InterruptedException e){} 
           System.out.println(manufacturer + " is running");
        }
    }
}
